<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  
  

  


  <head>
    <title>
      tiedosto SailoException.java hakemistossa k2018/kijohiet/tags/vaihe7/src/elokuvarekisteri
     – Ohjelmointi 2 HT
    </title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <!--[if IE]><script type="text/javascript">
      if (/^#__msie303:/.test(window.location.hash))
        window.location.replace(window.location.hash.replace(/^#__msie303:/, '#'));
    </script><![endif]-->
        <link rel="search" href="/projects/ohj2ht/search" />
        <link rel="help" href="/projects/ohj2ht/wiki/TracGuide" />
        <link rel="alternate" href="/projects/ohj2ht/browser/k2018/kijohiet/tags/vaihe7/src/elokuvarekisteri/SailoException.java?rev=50131&amp;format=txt" type="text/plain" title="Pelkkä teksti" /><link rel="alternate" href="/projects/ohj2ht/export/50131/k2018/kijohiet/tags/vaihe7/src/elokuvarekisteri/SailoException.java" type="text/x-java; charset=iso-8859-15" title="Alkuperäinen muoto" />
        <link rel="up" href="/projects/ohj2ht/browser/k2018/kijohiet/trunk/elokuvarekisteri/SailoException.java" />
        <link rel="start" href="/projects/ohj2ht/wiki" />
        <link rel="stylesheet" href="/projects/ohj2ht/chrome/common/css/trac.css" type="text/css" /><link rel="stylesheet" href="/projects/ohj2ht/chrome/common/css/code.css" type="text/css" /><link rel="stylesheet" href="/projects/ohj2ht/pygments/trac.css" type="text/css" /><link rel="stylesheet" href="/projects/ohj2ht/chrome/common/css/browser.css" type="text/css" />
        <link rel="shortcut icon" href="/projects/ohj2ht/chrome/common/trac.ico" type="image/x-icon" />
        <link rel="icon" href="/projects/ohj2ht/chrome/common/trac.ico" type="image/x-icon" />
      <link type="application/opensearchdescription+xml" rel="search" href="/projects/ohj2ht/search/opensearch" title="Etsi projektista Ohjelmointi 2 HT" />
    <script type="text/javascript" src="/projects/ohj2ht/chrome/common/js/jquery.js"></script><script type="text/javascript" src="/projects/ohj2ht/chrome/common/js/babel.js"></script><script type="text/javascript" src="/projects/ohj2ht/chrome/common/js/messages/fi.js"></script><script type="text/javascript" src="/projects/ohj2ht/chrome/common/js/trac.js"></script><script type="text/javascript" src="/projects/ohj2ht/chrome/common/js/search.js"></script>
    <!--[if lt IE 7]>
    <script type="text/javascript" src="/projects/ohj2ht/chrome/common/js/ie_pre7_hacks.js"></script>
    <![endif]-->
    <script type="text/javascript" src="/projects/ohj2ht/chrome/common/js/folding.js"></script>
    <script type="text/javascript">
      jQuery(document).ready(function($) {
        $(".trac-toggledeleted").show().click(function() {
                  $(this).siblings().find(".trac-deleted").toggle();
                  return false;
        }).click();
        $("#jumploc input").hide();
        $("#jumploc select").change(function () {
          this.parentNode.parentNode.submit();
        });
          $('#preview table.code').enableCollapsibleColumns($('#preview table.code thead th.content'));
      });
    </script>
    <link rel="stylesheet" type="text/css" href="https://trac.cc.jyu.fi/projects/ohj1/export/0/css/style.css" />
<!--          href="https://svn.cc.jyu.fi/srv/svn/ohj2/css/style.css" /> -->
<!--          href="${href.chrome('site/style.css')}" /> -->
  </head>
  <body>
    <div id="siteheader" class="ylalinkkipalkki">
<p>Ohjelmointi 2 - kevät 2019
<a class="ylalinkki" href="https://tim.jyu.fi/view/kurssit/tie/ohj2/2019k/koti">Koti 2019</a>
<a class="ylalinkki" href="https://tim.jyu.fi/view/kurssit/tie/ohj2/2019k/luentojen-aiheet">Luennot</a>
<a class="ylalinkki" href="https://tim.jyu.fi/view/kurssit/tie/ohj2/2019k/paate/paate">Ohjaukset</a>
<a class="ylalinkki" href="https://tim.jyu.fi/view/kurssit/tie/ohj2/harjoitustyo/ohje">Harjoitustyö</a>
<a class="ylalinkki" href="https://tim.jyu.fi/view/kurssit/tie/ohj2/tyokaluja">Työkalut</a>
<a class="ylalinkki" href="https://tim.jyu.fi/view/2">Moniste</a>
<a class="ylalinkki" href="https://tim.jyu.fi/view/kurssit/tie/ohj2/2019k/demotyleinen">Demot</a>
</p>
</div>
    <div id="banner">
      <div id="header">
        <a id="logo" href="/projects/ohj2ht/wiki/TracIni#header_logo-section"><img src="/projects/ohj2ht/chrome/common/trac_banner.png" alt="" /></a>
      </div>
      <form id="search" action="/projects/ohj2ht/search" method="get">
        <div>
          <label for="proj-search">Haku:</label>
          <input type="text" id="proj-search" name="q" size="18" value="" />
          <input type="submit" value="Haku" />
        </div>
      </form>
      <div id="metanav" class="nav">
    <ul>
      <li class="first"><a href="/projects/ohj2ht/login">Kirjaudu sisään</a></li><li><a href="/projects/ohj2ht/prefs">Asetukset</a></li><li><a href="/projects/ohj2ht/wiki/TracGuide">Ohjeet</a></li><li class="last"><a href="/projects/ohj2ht/about">Tietoja Tracista</a></li>
    </ul>
  </div>
    </div>
    <div id="mainnav" class="nav">
    <ul>
      <li class="first"><a href="/projects/ohj2ht/wiki">Wiki</a></li><li class="active"><a href="/projects/ohj2ht/browser">Selaa koodia</a></li><li class="last"><a href="/projects/ohj2ht/search">Haku</a></li>
    </ul>
  </div>
    <div id="main">
      <div id="ctxtnav" class="nav">
        <h2>Kontekstin navigointi</h2>
          <ul>
              <li class="first"><span class="missing">&larr; Edellinen versio</span></li><li><a href="/projects/ohj2ht/browser/k2018/kijohiet/trunk/elokuvarekisteri/SailoException.java">Uusin versio</a></li><li><span class="missing">Seuraava versio &rarr;</span></li><li><a href="/projects/ohj2ht/browser/k2018/kijohiet/trunk/elokuvarekisteri/SailoException.java?annotate=blame&amp;rev=50131" title="Merkitse jokaisen rivin lähdeversio (viimeisin versio jossa kyseistä riviä on muutettu). Tämä saattaa kestää pitkään...">Blame</a></li><li class="last"><a href="/projects/ohj2ht/log/k2018/kijohiet/tags/vaihe7/src/elokuvarekisteri/SailoException.java?rev=50131">Versioloki</a></li>
          </ul>
        <hr />
      </div>
    <div id="content" class="browser">
          <h1>
<a class="pathentry first" href="/projects/ohj2ht/browser?order=name" title="Siirry tiedostovaraston alkuun">source:</a>
<a class="pathentry" href="/projects/ohj2ht/browser/k2018?rev=50131&amp;order=name" title="Näytä k2018">k2018</a><span class="pathentry sep">/</span><a class="pathentry" href="/projects/ohj2ht/browser/k2018/kijohiet?rev=50131&amp;order=name" title="Näytä kijohiet">kijohiet</a><span class="pathentry sep">/</span><a class="pathentry" href="/projects/ohj2ht/browser/k2018/kijohiet/tags?rev=50131&amp;order=name" title="Näytä tags">tags</a><span class="pathentry sep">/</span><a class="pathentry" href="/projects/ohj2ht/browser/k2018/kijohiet/tags/vaihe7?rev=50131&amp;order=name" title="Näytä vaihe7">vaihe7</a><span class="pathentry sep">/</span><a class="pathentry" href="/projects/ohj2ht/browser/k2018/kijohiet/tags/vaihe7/src?rev=50131&amp;order=name" title="Näytä src">src</a><span class="pathentry sep">/</span><a class="pathentry" href="/projects/ohj2ht/browser/k2018/kijohiet/tags/vaihe7/src/elokuvarekisteri?rev=50131&amp;order=name" title="Näytä elokuvarekisteri">elokuvarekisteri</a><span class="pathentry sep">/</span><a class="pathentry" href="/projects/ohj2ht/browser/k2018/kijohiet/tags/vaihe7/src/elokuvarekisteri/SailoException.java?rev=50131&amp;order=name" title="Näytä SailoException.java">SailoException.java</a>
<span class="pathentry sep">@</span>
  <a class="pathentry" href="/projects/ohj2ht/changeset/50131" title="Näytä muutos 50131">50131</a>
<br style="clear: both" />
</h1>
        <div id="jumprev">
          <form action="" method="get">
            <div>
              <label for="rev" title="Vinkki: jätä kenttä tyhjäksi nähdäksesi uusin versio">
                Näytä versio</label>
              <input type="text" id="rev" name="rev" value="50131" size="6" />
            </div>
          </form>
        </div>
      <table id="info" summary="Version tiedot">
        <tr>
          <th scope="col">Version <a href="/projects/ohj2ht/changeset/47863">47863</a>,
            <span title="488 tavua">488 tavua</span>
            tallensi kijohiet, <a class="timeline" href="/projects/ohj2ht/timeline?from=2018-03-12T17%3A11%3A36%2B02%3A00&amp;precision=second" title="2018-03-12T17:11:36+02:00 aikajanalla">13 kuukautta</a> sitten
            (<a href="/projects/ohj2ht/changeset/47863/k2018/kijohiet/trunk/elokuvarekisteri/SailoException.java">muutokset</a>)</th>
        </tr>
        <tr>
          <td class="message searchable">
              <p>
Vaihe 5<br />
</p>
          </td>
        </tr>
      </table>
      <div id="preview" class="searchable">
        
  <table class="code"><thead><tr><th class="lineno" title="Rivinumerot">Rivi</th><th class="content"> </th></tr></thead><tbody><tr><th id="L1"><a href="#L1">1</a></th><td><span class="kn">package</span> elokuvarekisteri<span class="o">;</span></td></tr><tr><th id="L2"><a href="#L2">2</a></th><td></td></tr><tr><th id="L3"><a href="#L3">3</a></th><td><span class="cm">/**</span></td></tr><tr><th id="L4"><a href="#L4">4</a></th><td><span class="cm"> * Poikkeusluokka tietorakenteesta aiheutuville poikkeuksille.</span></td></tr><tr><th id="L5"><a href="#L5">5</a></th><td><span class="cm"> * @author Vesa Lappalainen</span></td></tr><tr><th id="L6"><a href="#L6">6</a></th><td><span class="cm"> * @version 1.0, 22.02.2003</span></td></tr><tr><th id="L7"><a href="#L7">7</a></th><td><span class="cm"> */</span></td></tr><tr><th id="L8"><a href="#L8">8</a></th><td><span class="kd">public</span> <span class="kd">class</span> <span class="nc">SailoException</span> <span class="kd">extends</span> Exception <span class="o">{</span></td></tr><tr><th id="L9"><a href="#L9">9</a></th><td>    <span class="kd">private</span> <span class="kd">static</span> <span class="kd">final</span> <span class="kt">long</span> serialVersionUID <span class="o">=</span> <span class="mi">1L</span><span class="o">;</span></td></tr><tr><th id="L10"><a href="#L10">10</a></th><td></td></tr><tr><th id="L11"><a href="#L11">11</a></th><td></td></tr><tr><th id="L12"><a href="#L12">12</a></th><td>    <span class="cm">/**</span></td></tr><tr><th id="L13"><a href="#L13">13</a></th><td><span class="cm">     * Poikkeuksen muodostaja jolle tuodaan poikkeuksessa</span></td></tr><tr><th id="L14"><a href="#L14">14</a></th><td><span class="cm">     * käytettävä viesti</span></td></tr><tr><th id="L15"><a href="#L15">15</a></th><td><span class="cm">     * @param viesti Poikkeuksen viesti</span></td></tr><tr><th id="L16"><a href="#L16">16</a></th><td><span class="cm">     */</span></td></tr><tr><th id="L17"><a href="#L17">17</a></th><td>    <span class="kd">public</span> <span class="nf">SailoException</span><span class="o">(</span>String viesti<span class="o">)</span> <span class="o">{</span></td></tr><tr><th id="L18"><a href="#L18">18</a></th><td>        <span class="kd">super</span><span class="o">(</span>viesti<span class="o">);</span></td></tr><tr><th id="L19"><a href="#L19">19</a></th><td>    <span class="o">}</span></td></tr><tr><th id="L20"><a href="#L20">20</a></th><td><span class="o">}</span></td></tr></tbody></table>

      </div>
      <div id="help"><strong>Huomaa:</strong> Katso <a href="/projects/ohj2ht/wiki/TracBrowser">TracBrowser</a>
        löytääksesi ohjeita tiedostovaraston selaamiseksi.</div>
      <div id="anydiff">
        <form action="/projects/ohj2ht/diff" method="get">
          <div class="buttons">
            <input type="hidden" name="new_path" value="/k2018/kijohiet/tags/vaihe7/src/elokuvarekisteri/SailoException.java" />
            <input type="hidden" name="old_path" value="/k2018/kijohiet/tags/vaihe7/src/elokuvarekisteri/SailoException.java" />
            <input type="hidden" name="new_rev" value="50131" />
            <input type="hidden" name="old_rev" value="50131" />
            <input type="submit" value="Näytä muutokset..." title="Select paths and revs for Diff" />
          </div>
        </form>
      </div>
    </div>
    <div id="altlinks">
      <h3>Lataa muissa muodoissa:</h3>
      <ul>
        <li class="first">
          <a rel="nofollow" href="/projects/ohj2ht/browser/k2018/kijohiet/tags/vaihe7/src/elokuvarekisteri/SailoException.java?rev=50131&amp;format=txt">Pelkkä teksti</a>
        </li><li class="last">
          <a rel="nofollow" href="/projects/ohj2ht/export/50131/k2018/kijohiet/tags/vaihe7/src/elokuvarekisteri/SailoException.java">Alkuperäinen muoto</a>
        </li>
      </ul>
    </div>
    </div>
    <div id="footer" lang="en" xml:lang="en"><hr />
      <a id="tracpowered" href="http://trac.edgewall.org/"><img src="/projects/ohj2ht/chrome/common/trac_logo_mini.png" height="30" width="107" alt="Trac Powered" /></a>
      <p class="left">Ohjelmaversio: <a href="/projects/ohj2ht/about"><strong>Trac 0.12.5</strong></a><br />
Toimittaja: <a href="http://www.edgewall.org/">Edgewall Software</a>.</p>
      <p class="right">Trac-projektin sivut löydät osoitteesta <br /><a href="http://trac.edgewall.org/">http://trac.edgewall.org/</a></p>
    </div>
    <div id="sitefooter" class="alalinkkipalkki">
      <p>Ohjelmointi 2 - kevät 2019</p>
    </div>
  </body>
</html>