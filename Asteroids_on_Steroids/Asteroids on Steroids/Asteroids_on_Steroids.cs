using System;
using System.Collections.Generic;
using Jypeli;
using Jypeli.Assets;
using Jypeli.Controls;
using Jypeli.Widgets;

/// @author  Kim Hietikko
/// @version 28.3.2019
///
/// <summary>
/// Tehdään Asteroids on Steroids peli
/// </summary>
public class Asteroids_on_Steroids : PhysicsGame
{
    private const int VIHOLLISTEN_LUKUMAARA = 500;
    private const int PELIN_LEVEYS = 1024;
    private const int PELIN_KORKEUS = 768;
    private const double ALUKSEN_KAANTYMINEN = 4.0;

    private PhysicsObject alus;
    private IntMeter pelaajanPisteet;
    private Cannon ase;
    private Image aluksenKuva = LoadImage("alus");
    private Image asteroidinKuva = LoadImage("asteroidi");
    private Image aseenKuva = LoadImage("ase");
    private Image alkunäytönKuva = LoadImage("alkunäyttö");
    private EasyHighScore ParhaatPisteet = new EasyHighScore();

    /// <summary>
    /// Käynnistetään peli aloitusvalikkoon ja peli on tietyn kokoinen ja levyinen
    /// </summary>
    public override void Begin()
    {
        SetWindowSize(1024, 768, false);
        Menu();
    }


    /// <summary>
    /// Luo alkuvalikon taustakuvineen, josta pääsee peliin, huipputuloksiin tai pois pelistä
    /// </summary>
    private void Menu()
    {
        MultiSelectWindow alkuValikko = new MultiSelectWindow("Pelin alkuvalikko",
                               "Aloita peli", "Parhaat pisteet", "Lopeta");
        Add(alkuValikko);

        Level.Background.Image = alkunäytönKuva;

        alkuValikko.AddItemHandler(0, AloitaPeli);
        alkuValikko.AddItemHandler(1, ParhaatPisteet.Show);
        alkuValikko.AddItemHandler(2, Exit);
        alkuValikko.DefaultCancel = 0;

        ParhaatPisteet.HighScoreWindow.Closed += Peliin;
    }


    /// <summary>
    /// Aloitetaan peli, jossa on kenttä, ohjaimet, pistelaskuri ja taustamusiikki.
    /// </summary>
    private void AloitaPeli()
    {
        LuoKentta();
        AsetaOhjaimet();
        LisaaLaskurit();
        LisaaMusiikki();

    }


    /// <summary>
    /// Luodaan tähtitaivaalla oleva kenttä, johon syntyy tietty määrä vihollisia.
    /// </summary>
    private void LuoKentta()
    {
        Level.Background.CreateStars();

        int vihollistenAlueLeveys = 20 * PELIN_LEVEYS;
        int vihollistenAlueKorkeus = 20 * PELIN_KORKEUS;

        alus = LuoAlus(0.0, 0.0, "alus");

        for (int i = 0; i < VIHOLLISTEN_LUKUMAARA; i++)
            LuoVihollinen(Level.Left - (vihollistenAlueLeveys), Level.Bottom - (vihollistenAlueKorkeus), Level.Right + (vihollistenAlueLeveys),
                Level.Top + (vihollistenAlueKorkeus), RandomGen.NextDouble(50, 100), "asteroidi");

    }


    /// <summary>
    /// Luodaan keskelle kenttää pelaaja ja ase pelaajalle
    /// </summary>
    /// <param name="x">Pelaajan x-koordinaatti</param>
    /// <param name="y">Pelaajan y-koordinaatti</param>
    /// <param name="tunniste">Pelaajan eli aluksen tunniste</param>
    /// <returns></returns>
    private PhysicsObject LuoAlus(double x, double y, string tunniste)
    {
        PhysicsObject alus = new PhysicsObject(100.0, 50.0);
        alus.Shape = Shape.Rectangle;
        alus.X = x;
        alus.Y = y;
        alus.Tag = tunniste;
        alus.Image = aluksenKuva;
        AddCollisionHandler(alus, "asteroidi", PalloOsui);
        Add(alus);

        ase = new Cannon(20, 30);
        ase.X = x;
        ase.Y = 30;
        ase.FireRate = 3.0;
        ase.AmmoIgnoresExplosions = true;
        ase.Angle += Angle.FromDegrees(90);
        ase.ProjectileCollision = AmmusOsui;
        ase.Image = aseenKuva;
        alus.Add(ase);

        return alus;
    }


    /// <summary>
    /// Mitä eri näppäimillä pelissä tehdään (näppäimistö ja xbox360-ohjain)
    /// </summary>
    private void AsetaOhjaimet()
    {
        Keyboard.Listen(Key.Left, ButtonState.Down, KaannaAlusta, "Pyöritä alusta vasemmalle", ALUKSEN_KAANTYMINEN);
        Keyboard.Listen(Key.Right, ButtonState.Down, KaannaAlusta, "Pyöritä alusta oikealle", -ALUKSEN_KAANTYMINEN);
        Keyboard.Listen(Key.LeftControl, ButtonState.Down, AmmuAseella, "Ammu", ase);
        Keyboard.Listen(Key.F1, ButtonState.Pressed, ShowControlHelp, "Näytä ohjeet");
        Keyboard.Listen(Key.Escape, ButtonState.Pressed, ConfirmExit, "Lopeta peli");

        ControllerOne.Listen(Button.DPadLeft, ButtonState.Down, KaannaAlusta, "Pyöritä alusta vasemmalle", ALUKSEN_KAANTYMINEN);
        ControllerOne.Listen(Button.DPadRight, ButtonState.Down, KaannaAlusta, "Pyöritä alusta oikealle", -ALUKSEN_KAANTYMINEN);
        ControllerOne.Listen(Button.RightTrigger, ButtonState.Down, AmmuAseella, "Ammu", ase);
        ControllerOne.Listen(Button.Y, ButtonState.Pressed, ShowControlHelp, "Näytä ohjeet");
        ControllerOne.Listen(Button.Back, ButtonState.Pressed, ConfirmExit, "Lopeta peli");
    }


    /// <summary>
    /// Käännetään alusta
    /// </summary>
    /// <param name="kulma">Montako astetta alus kääntyy</param>
    private void KaannaAlusta(double kulma)
    {
        alus.Angle += Angle.FromDegrees(kulma);
    }


    /// <summary>
    /// Aliohjelma, jossa asteroidi voi tulla tietylle alueelle ja muita asteroidin tietoja
    /// </summary>
    /// <param name="minx">Minimi x-koordinaatti mihin vihollinen voi syntyä</param>
    /// <param name="miny">Minimi y-koordinaatti mihin vihollinen voi syntyä</param>
    /// <param name="maxx">Maksimi x-koordinaatti mihin vihollinen voi syntyä</param>
    /// <param name="maxy">Maksimi y-koordinaatti mihin vihollinen voi syntyä</param>
    /// <param name="vauhti">Millä nopeudella asteroidi tulee kohti</param>
    /// <param name="tunniste">Asteroidin tunniste</param>
    /// <returns></returns>
    private PhysicsObject LuoVihollinen(double minx, double miny, double maxx, double maxy, double vauhti, string tunniste)
    {

        double leveys = RandomGen.NextDouble(50, 100);
        double korkeus = leveys;
        PhysicsObject vihollinen = new PhysicsObject(leveys, korkeus, Shape.Circle);
        vihollinen.Position = RandomGen.NextVector(minx, miny, maxx, maxy);
        vihollinen.Color = Color.Brown;
        vihollinen.MoveTo(new Vector(0, 0), vauhti);
        vihollinen.Tag = tunniste;
        vihollinen.Image = asteroidinKuva;
        vihollinen.AngularVelocity = RandomGen.NextDouble(1, 3);
        Add(vihollinen);
        return vihollinen;
    }


    /// <summary>
    /// Aliohjelmassa alus tuhoutuu ja soittaa äänen sen seurauksena sekä antaa räjäytyksen ja poistaa pelaajan kentältä.
    /// Tuhoamisen jälkeen peli päättyy ja pelaaja voi kirjoittaa oman nimensä, jos pääsi tuloslistalle.
    /// </summary>
    /// <param name="alus">Pelaaja</param>
    private void TuhoaPelaaja(IPhysicsObject alus)
    {
        Explosion rajahdys = new Explosion(alus.Width * 5);
        rajahdys.Position = alus.Position;
        rajahdys.UseShockWave = false;
        rajahdys.Sound = null;
        MediaPlayer.Play("tuhoapelaaja");
        MediaPlayer.IsRepeating = false;
        Add(rajahdys);
        Remove(alus);

        PeliOhi("HÄVISIT PELIN! Voit poistua pelistä painamalla tulostaulussa 'OK' nappia");

        ParhaatPisteet.EnterAndShow(pelaajanPisteet.Value);
        ParhaatPisteet.HighScoreWindow.Closed += PoisPelista;
    }


    /// <summary>
    /// Pelaaja tuhotaan, kun vihollinen eli asteroidi osuu.
    /// </summary>
    /// <param name="alus">Pelaaja</param>
    /// <param name="asteroidi">Vihollinen</param>
    private void PalloOsui(PhysicsObject alus, PhysicsObject asteroidi)
    {
        TuhoaPelaaja(alus);
    }

    /// <summary>
    /// Tulostaa tekstin, kun peli loppuu
    /// </summary>
    private void PeliOhi(string teksti)
    {
        Label tekstikentta = new Label(PELIN_LEVEYS, PELIN_KORKEUS / 10, teksti);
        tekstikentta.Y = Screen.Top - 50;
        tekstikentta.TextColor = Color.Red;
        Add(tekstikentta);
    }


    /// <summary>
    /// Suljetaan peli, kun ollaan joko hävitty tai voitettu ja painetaan OK-nappia tulostaulussa.
    /// </summary>
    /// <param name="sender"></param>
    private void PoisPelista(Window sender)
    {
        Exit();
    }


    /// <summary>
    /// Aloitusvalikossa, kun katsoo tulostaulua ja painaa OK-nappia niin se siirtyy automaattisesti peliin.
    /// </summary>
    /// <param name="sender"></param>
    private void Peliin(Window sender)
    {
        AloitaPeli();
    }


    /// <summary>
    /// Tehdään laskuri pelin oikeaan yläreunaan
    /// </summary>
    /// <param name="x">Laskurin x-koordinaatti</param>
    /// <param name="y">Laskurin y-koordinaatti</param>
    /// <returns>Laskuri</returns>
    private IntMeter LuoPisteLaskuri(double x, double y)
    {
        IntMeter laskuri = new IntMeter(0);
        laskuri.MaxValue = 999;

        Label naytto = new Label();
        naytto.BindTo(laskuri);
        naytto.X = x;
        naytto.Y = y;
        naytto.TextColor = Color.Red;
        Add(naytto);

        return laskuri;
    }


    /// <summary>
    /// Lisätään pelaajalle ase
    /// </summary>
    /// <param name="ase">Pelaajan ase</param>
    private void AmmuAseella(Cannon ase)
    {
        PhysicsObject ammus = ase.Shoot();

        if (ammus != null)
        {
            ammus.Size *= 3;
            ammus.MaximumLifetime = TimeSpan.FromSeconds(0.7);
        }
    }


    /// <summary>
    /// Kun aseen ammus osuu viholliseen eli asteroidiin, asteroidi räjähtää ja tuhoutuu sekä poistetaan ammus sekä asteroidi ja pelaaja saa yhden pisteen.
    /// Jos ammus osuu tarpeeksi monta kertaa eli pelaaja saa tarpeeksi pisteitä, niin pelaaja saa päivityksiä aseeseensa.
    /// </summary>
    /// <param name="ammus">Aseen ammus</param>
    /// <param name="asteroidi">Vihollinen</param>
    private void AmmusOsui(PhysicsObject ammus, PhysicsObject asteroidi)
    {
        pelaajanPisteet.Value += 1;
        Explosion rajahdys = new Explosion(asteroidi.Width * 2);
        rajahdys.Position = asteroidi.Position;
        rajahdys.UseShockWave = false;
        rajahdys.Sound = null;

        Add(rajahdys);
        Remove(asteroidi);
        Remove(ammus);

        Upgrade(100, 4.0);
        Upgrade(250, 5.0);

        if (pelaajanPisteet == VIHOLLISTEN_LUKUMAARA)
        {
            PeliOhi("VOITIT PELIN! Voit poistua pelistä painamalla tulostaulussa 'OK' nappia");
            SoundEffect voitto = LoadSoundEffect("voitto");
            voitto.Play();
            ParhaatPisteet.EnterAndShow(pelaajanPisteet.Value);
            ParhaatPisteet.HighScoreWindow.Closed += PoisPelista;
        }
    }


    /// <summary>
    /// Päivityksiä aseeseen
    /// </summary>
    /// <param name="x">Montako pistettä vaaditaan päivitykseen</param>
    /// <param name="y">Aseen FireRate</param>
    private void Upgrade(double x, double y)
    {
        if (pelaajanPisteet.Value == x)
        {
            SoundEffect upgrade = LoadSoundEffect("upgrade");
            upgrade.Play();
            ase.FireRate = y;
        }

    }


    /// <summary>
    /// Lisätään pistelaskuri pelin oikeaan ylänurkkaan.
    /// </summary>
    private void LisaaLaskurit()
    {
        pelaajanPisteet = LuoPisteLaskuri(Screen.Right - 100.0, Screen.Top - 100.0);
    }


    /// <summary>
    /// Pelin taustamusiikki, joka toistaa itseään kun se menee loppuun.
    /// </summary>
    private void LisaaMusiikki()
    {
        MediaPlayer.Play("taustamusiikkiValmis");
        MediaPlayer.Volume = 0.8;
        MediaPlayer.IsRepeating = true;
    }
}
