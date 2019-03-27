<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  
  

  


  <head>
    <title>
      tiedosto Tietue.java hakemistossa k2018/kijohiet/tags/vaihe7/src/kanta
     – Ohjelmointi 2 HT
    </title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <!--[if IE]><script type="text/javascript">
      if (/^#__msie303:/.test(window.location.hash))
        window.location.replace(window.location.hash.replace(/^#__msie303:/, '#'));
    </script><![endif]-->
        <link rel="search" href="/projects/ohj2ht/search" />
        <link rel="help" href="/projects/ohj2ht/wiki/TracGuide" />
        <link rel="alternate" href="/projects/ohj2ht/browser/k2018/kijohiet/tags/vaihe7/src/kanta/Tietue.java?rev=50131&amp;format=txt" type="text/plain" title="Pelkkä teksti" /><link rel="alternate" href="/projects/ohj2ht/export/50131/k2018/kijohiet/tags/vaihe7/src/kanta/Tietue.java" type="text/x-java; charset=iso-8859-15" title="Alkuperäinen muoto" />
        <link rel="up" href="/projects/ohj2ht/browser/k2018/kijohiet/trunk/src/kanta/Tietue.java" />
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
              <li class="first"><span class="missing">&larr; Edellinen versio</span></li><li><a href="/projects/ohj2ht/browser/k2018/kijohiet/trunk/src/kanta/Tietue.java">Uusin versio</a></li><li><span class="missing">Seuraava versio &rarr;</span></li><li><a href="/projects/ohj2ht/browser/k2018/kijohiet/trunk/src/kanta/Tietue.java?annotate=blame&amp;rev=50131" title="Merkitse jokaisen rivin lähdeversio (viimeisin versio jossa kyseistä riviä on muutettu). Tämä saattaa kestää pitkään...">Blame</a></li><li class="last"><a href="/projects/ohj2ht/log/k2018/kijohiet/tags/vaihe7/src/kanta/Tietue.java?rev=50131">Versioloki</a></li>
          </ul>
        <hr />
      </div>
    <div id="content" class="browser">
          <h1>
<a class="pathentry first" href="/projects/ohj2ht/browser?order=name" title="Siirry tiedostovaraston alkuun">source:</a>
<a class="pathentry" href="/projects/ohj2ht/browser/k2018?rev=50131&amp;order=name" title="Näytä k2018">k2018</a><span class="pathentry sep">/</span><a class="pathentry" href="/projects/ohj2ht/browser/k2018/kijohiet?rev=50131&amp;order=name" title="Näytä kijohiet">kijohiet</a><span class="pathentry sep">/</span><a class="pathentry" href="/projects/ohj2ht/browser/k2018/kijohiet/tags?rev=50131&amp;order=name" title="Näytä tags">tags</a><span class="pathentry sep">/</span><a class="pathentry" href="/projects/ohj2ht/browser/k2018/kijohiet/tags/vaihe7?rev=50131&amp;order=name" title="Näytä vaihe7">vaihe7</a><span class="pathentry sep">/</span><a class="pathentry" href="/projects/ohj2ht/browser/k2018/kijohiet/tags/vaihe7/src?rev=50131&amp;order=name" title="Näytä src">src</a><span class="pathentry sep">/</span><a class="pathentry" href="/projects/ohj2ht/browser/k2018/kijohiet/tags/vaihe7/src/kanta?rev=50131&amp;order=name" title="Näytä kanta">kanta</a><span class="pathentry sep">/</span><a class="pathentry" href="/projects/ohj2ht/browser/k2018/kijohiet/tags/vaihe7/src/kanta/Tietue.java?rev=50131&amp;order=name" title="Näytä Tietue.java">Tietue.java</a>
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
          <th scope="col">Version <a href="/projects/ohj2ht/changeset/50050">50050</a>,
            <span title="3374 tavua">3.3 KB</span>
            tallensi kijohiet, <a class="timeline" href="/projects/ohj2ht/timeline?from=2018-04-16T23%3A54%3A12%2B03%3A00&amp;precision=second" title="2018-04-16T23:54:12+03:00 aikajanalla">11 kuukautta</a> sitten
            (<a href="/projects/ohj2ht/changeset/50050/k2018/kijohiet/trunk/src/kanta/Tietue.java">muutokset</a>)</th>
        </tr>
        <tr>
          <td class="message searchable">
              <p>
Vaihe 7<br />
</p>
          </td>
        </tr>
      </table>
      <div id="preview" class="searchable">
        
  <table class="code"><thead><tr><th class="lineno" title="Rivinumerot">Rivi</th><th class="content"> </th></tr></thead><tbody><tr><th id="L1"><a href="#L1">1</a></th><td><span class="kn">package</span> kanta<span class="o">;</span></td></tr><tr><th id="L2"><a href="#L2">2</a></th><td></td></tr><tr><th id="L3"><a href="#L3">3</a></th><td><span class="cm">/**</span></td></tr><tr><th id="L4"><a href="#L4">4</a></th><td><span class="cm"> * Rajapinta tietueelle johon voidaan taulukon avulla rakentaa</span></td></tr><tr><th id="L5"><a href="#L5">5</a></th><td><span class="cm"> * "attribuutit".</span></td></tr><tr><th id="L6"><a href="#L6">6</a></th><td><span class="cm"> * @author vesal</span></td></tr><tr><th id="L7"><a href="#L7">7</a></th><td><span class="cm"> * @version Mar 23, 2012</span></td></tr><tr><th id="L8"><a href="#L8">8</a></th><td><span class="cm"> * @example</span></td></tr><tr><th id="L9"><a href="#L9">9</a></th><td><span class="cm"> */</span></td></tr><tr><th id="L10"><a href="#L10">10</a></th><td><span class="kd">public</span> <span class="kd">interface</span> <span class="nc">Tietue</span> <span class="o">{</span></td></tr><tr><th id="L11"><a href="#L11">11</a></th><td></td></tr><tr><th id="L12"><a href="#L12">12</a></th><td>   </td></tr><tr><th id="L13"><a href="#L13">13</a></th><td>    <span class="cm">/**</span></td></tr><tr><th id="L14"><a href="#L14">14</a></th><td><span class="cm">     * @return tietueen kenttien lukumäärä</span></td></tr><tr><th id="L15"><a href="#L15">15</a></th><td><span class="cm">     * @example</span></td></tr><tr><th id="L16"><a href="#L16">16</a></th><td><span class="cm">     * &lt;pre name="test"&gt;</span></td></tr><tr><th id="L17"><a href="#L17">17</a></th><td><span class="cm">     *   #import kerho.Harrastus;</span></td></tr><tr><th id="L18"><a href="#L18">18</a></th><td><span class="cm">     *   Harrastus har = new Harrastus();</span></td></tr><tr><th id="L19"><a href="#L19">19</a></th><td><span class="cm">     *   har.getKenttia() === 5;</span></td></tr><tr><th id="L20"><a href="#L20">20</a></th><td><span class="cm">     * &lt;/pre&gt;</span></td></tr><tr><th id="L21"><a href="#L21">21</a></th><td><span class="cm">     */</span></td></tr><tr><th id="L22"><a href="#L22">22</a></th><td>    <span class="kd">public</span> <span class="kd">abstract</span> <span class="kt">int</span> <span class="nf">getKenttia</span><span class="o">();</span></td></tr><tr><th id="L23"><a href="#L23">23</a></th><td></td></tr><tr><th id="L24"><a href="#L24">24</a></th><td></td></tr><tr><th id="L25"><a href="#L25">25</a></th><td>    <span class="cm">/**</span></td></tr><tr><th id="L26"><a href="#L26">26</a></th><td><span class="cm">     * @return ensimmäinen käyttäjän syötettävän kentän indeksi</span></td></tr><tr><th id="L27"><a href="#L27">27</a></th><td><span class="cm">     * @example</span></td></tr><tr><th id="L28"><a href="#L28">28</a></th><td><span class="cm">     * &lt;pre name="test"&gt;</span></td></tr><tr><th id="L29"><a href="#L29">29</a></th><td><span class="cm">     *   Harrastus har = new Harrastus();</span></td></tr><tr><th id="L30"><a href="#L30">30</a></th><td><span class="cm">     *   har.ekaKentta() === 2;</span></td></tr><tr><th id="L31"><a href="#L31">31</a></th><td><span class="cm">     * &lt;/pre&gt;</span></td></tr><tr><th id="L32"><a href="#L32">32</a></th><td><span class="cm">     */</span></td></tr><tr><th id="L33"><a href="#L33">33</a></th><td>    <span class="kd">public</span> <span class="kd">abstract</span> <span class="kt">int</span> <span class="nf">ekaKentta</span><span class="o">();</span></td></tr><tr><th id="L34"><a href="#L34">34</a></th><td></td></tr><tr><th id="L35"><a href="#L35">35</a></th><td></td></tr><tr><th id="L36"><a href="#L36">36</a></th><td>    <span class="cm">/**</span></td></tr><tr><th id="L37"><a href="#L37">37</a></th><td><span class="cm">     * @param k minkä kentän kysymys halutaan</span></td></tr><tr><th id="L38"><a href="#L38">38</a></th><td><span class="cm">     * @return valitun kentän kysymysteksti</span></td></tr><tr><th id="L39"><a href="#L39">39</a></th><td><span class="cm">     * @example</span></td></tr><tr><th id="L40"><a href="#L40">40</a></th><td><span class="cm">     * &lt;pre name="test"&gt;</span></td></tr><tr><th id="L41"><a href="#L41">41</a></th><td><span class="cm">     *   Harrastus har = new Harrastus();</span></td></tr><tr><th id="L42"><a href="#L42">42</a></th><td><span class="cm">     *   har.getKysymys(2) === "ala";</span></td></tr><tr><th id="L43"><a href="#L43">43</a></th><td><span class="cm">     * &lt;/pre&gt;</span></td></tr><tr><th id="L44"><a href="#L44">44</a></th><td><span class="cm">     */</span></td></tr><tr><th id="L45"><a href="#L45">45</a></th><td>    <span class="kd">public</span> <span class="kd">abstract</span> String <span class="nf">getKysymys</span><span class="o">(</span><span class="kt">int</span> k<span class="o">);</span></td></tr><tr><th id="L46"><a href="#L46">46</a></th><td></td></tr><tr><th id="L47"><a href="#L47">47</a></th><td></td></tr><tr><th id="L48"><a href="#L48">48</a></th><td>    <span class="cm">/**</span></td></tr><tr><th id="L49"><a href="#L49">49</a></th><td><span class="cm">     * @param k Minkä kentän sisältö halutaan</span></td></tr><tr><th id="L50"><a href="#L50">50</a></th><td><span class="cm">     * @return valitun kentän sisältö</span></td></tr><tr><th id="L51"><a href="#L51">51</a></th><td><span class="cm">     * @example</span></td></tr><tr><th id="L52"><a href="#L52">52</a></th><td><span class="cm">     * &lt;pre name="test"&gt;</span></td></tr><tr><th id="L53"><a href="#L53">53</a></th><td><span class="cm">     *   Harrastus har = new Harrastus();</span></td></tr><tr><th id="L54"><a href="#L54">54</a></th><td><span class="cm">     *   har.parse("   2   |  10  |   Kalastus  | 1949 | 22 t ");</span></td></tr><tr><th id="L55"><a href="#L55">55</a></th><td><span class="cm">     *   har.anna(0) === "2";   </span></td></tr><tr><th id="L56"><a href="#L56">56</a></th><td><span class="cm">     *   har.anna(1) === "10";   </span></td></tr><tr><th id="L57"><a href="#L57">57</a></th><td><span class="cm">     *   har.anna(2) === "Kalastus";   </span></td></tr><tr><th id="L58"><a href="#L58">58</a></th><td><span class="cm">     *   har.anna(3) === "1949";   </span></td></tr><tr><th id="L59"><a href="#L59">59</a></th><td><span class="cm">     *   har.anna(4) === "22";   </span></td></tr><tr><th id="L60"><a href="#L60">60</a></th><td><span class="cm">     * &lt;/pre&gt;</span></td></tr><tr><th id="L61"><a href="#L61">61</a></th><td><span class="cm">     */</span></td></tr><tr><th id="L62"><a href="#L62">62</a></th><td>    <span class="kd">public</span> <span class="kd">abstract</span> String <span class="nf">anna</span><span class="o">(</span><span class="kt">int</span> k<span class="o">);</span></td></tr><tr><th id="L63"><a href="#L63">63</a></th><td></td></tr><tr><th id="L64"><a href="#L64">64</a></th><td>   </td></tr><tr><th id="L65"><a href="#L65">65</a></th><td>    <span class="cm">/**</span></td></tr><tr><th id="L66"><a href="#L66">66</a></th><td><span class="cm">     * Asetetaan valitun kentän sisältö.  Mikäli asettaminen onnistuu,</span></td></tr><tr><th id="L67"><a href="#L67">67</a></th><td><span class="cm">     * palautetaan null, muutoin virheteksti.</span></td></tr><tr><th id="L68"><a href="#L68">68</a></th><td><span class="cm">     * @param k minkä kentän sisältö asetetaan</span></td></tr><tr><th id="L69"><a href="#L69">69</a></th><td><span class="cm">     * @param s asetettava sisältö merkkijonona</span></td></tr><tr><th id="L70"><a href="#L70">70</a></th><td><span class="cm">     * @return null jos ok, muuten virheteksti</span></td></tr><tr><th id="L71"><a href="#L71">71</a></th><td><span class="cm">     * @example</span></td></tr><tr><th id="L72"><a href="#L72">72</a></th><td><span class="cm">     * &lt;pre name="test"&gt;</span></td></tr><tr><th id="L73"><a href="#L73">73</a></th><td><span class="cm">     *   Harrastus har = new Harrastus();</span></td></tr><tr><th id="L74"><a href="#L74">74</a></th><td><span class="cm">     *   har.aseta(3,"kissa") === "aloitusvuosi: Ei kokonaisluku (kissa)";</span></td></tr><tr><th id="L75"><a href="#L75">75</a></th><td><span class="cm">     *   har.aseta(3,"1940")  === null;</span></td></tr><tr><th id="L76"><a href="#L76">76</a></th><td><span class="cm">     *   har.aseta(4,"kissa") === "h/vko: Ei kokonaisluku (kissa)";</span></td></tr><tr><th id="L77"><a href="#L77">77</a></th><td><span class="cm">     *   har.aseta(4,"20")    === null;</span></td></tr><tr><th id="L78"><a href="#L78">78</a></th><td><span class="cm">     * &lt;/pre&gt;</span></td></tr><tr><th id="L79"><a href="#L79">79</a></th><td><span class="cm">     */</span></td></tr><tr><th id="L80"><a href="#L80">80</a></th><td>    <span class="kd">public</span> <span class="kd">abstract</span> String <span class="nf">aseta</span><span class="o">(</span><span class="kt">int</span> k<span class="o">,</span> String s<span class="o">);</span></td></tr><tr><th id="L81"><a href="#L81">81</a></th><td></td></tr><tr><th id="L82"><a href="#L82">82</a></th><td></td></tr><tr><th id="L83"><a href="#L83">83</a></th><td>    <span class="cm">/**</span></td></tr><tr><th id="L84"><a href="#L84">84</a></th><td><span class="cm">     * Tehdään identtinen klooni tietueesta</span></td></tr><tr><th id="L85"><a href="#L85">85</a></th><td><span class="cm">     * @return kloonattu tietue</span></td></tr><tr><th id="L86"><a href="#L86">86</a></th><td><span class="cm">     * @throws CloneNotSupportedException jos kloonausta ei tueta</span></td></tr><tr><th id="L87"><a href="#L87">87</a></th><td><span class="cm">     * @example</span></td></tr><tr><th id="L88"><a href="#L88">88</a></th><td><span class="cm">     * &lt;pre name="test"&gt;</span></td></tr><tr><th id="L89"><a href="#L89">89</a></th><td><span class="cm">     * #THROWS CloneNotSupportedException</span></td></tr><tr><th id="L90"><a href="#L90">90</a></th><td><span class="cm">     *   Harrastus har = new Harrastus();</span></td></tr><tr><th id="L91"><a href="#L91">91</a></th><td><span class="cm">     *   har.parse("   2   |  10  |   Kalastus  | 1949 | 22 t ");</span></td></tr><tr><th id="L92"><a href="#L92">92</a></th><td><span class="cm">     *   Object kopio = har.clone();</span></td></tr><tr><th id="L93"><a href="#L93">93</a></th><td><span class="cm">     *   kopio.toString() === har.toString();</span></td></tr><tr><th id="L94"><a href="#L94">94</a></th><td><span class="cm">     *   har.parse("   1   |  11  |   Uinti  | 1949 | 22 t ");</span></td></tr><tr><th id="L95"><a href="#L95">95</a></th><td><span class="cm">     *   kopio.toString().equals(har.toString()) === false;</span></td></tr><tr><th id="L96"><a href="#L96">96</a></th><td><span class="cm">     *   kopio instanceof Harrastus === true;</span></td></tr><tr><th id="L97"><a href="#L97">97</a></th><td><span class="cm">     * &lt;/pre&gt;</span></td></tr><tr><th id="L98"><a href="#L98">98</a></th><td><span class="cm">     */</span></td></tr><tr><th id="L99"><a href="#L99">99</a></th><td>    <span class="kd">public</span> <span class="kd">abstract</span> Tietue <span class="nf">clone</span><span class="o">()</span> <span class="kd">throws</span> CloneNotSupportedException<span class="o">;</span></td></tr><tr><th id="L100"><a href="#L100">100</a></th><td></td></tr><tr><th id="L101"><a href="#L101">101</a></th><td></td></tr><tr><th id="L102"><a href="#L102">102</a></th><td>    <span class="cm">/**</span></td></tr><tr><th id="L103"><a href="#L103">103</a></th><td><span class="cm">     * Palauttaa tietueen tiedot merkkijonona jonka voi tallentaa tiedostoon.</span></td></tr><tr><th id="L104"><a href="#L104">104</a></th><td><span class="cm">     * @return tietue tolppaeroteltuna merkkijonona</span></td></tr><tr><th id="L105"><a href="#L105">105</a></th><td><span class="cm">     * @example</span></td></tr><tr><th id="L106"><a href="#L106">106</a></th><td><span class="cm">     * &lt;pre name="test"&gt;</span></td></tr><tr><th id="L107"><a href="#L107">107</a></th><td><span class="cm">     *   Harrastus harrastus = new Harrastus();</span></td></tr><tr><th id="L108"><a href="#L108">108</a></th><td><span class="cm">     *   harrastus.parse("   2   |  10  |   Kalastus  | 1949 | 22 t ");</span></td></tr><tr><th id="L109"><a href="#L109">109</a></th><td><span class="cm">     *   harrastus.toString()    =R= "2\\|10\\|Kalastus\\|1949\\|22.*";</span></td></tr><tr><th id="L110"><a href="#L110">110</a></th><td><span class="cm">     * &lt;/pre&gt;</span></td></tr><tr><th id="L111"><a href="#L111">111</a></th><td><span class="cm">     */</span></td></tr><tr><th id="L112"><a href="#L112">112</a></th><td>    <span class="nd">@Override</span></td></tr><tr><th id="L113"><a href="#L113">113</a></th><td>    <span class="kd">public</span> <span class="kd">abstract</span> String <span class="nf">toString</span><span class="o">();</span></td></tr><tr><th id="L114"><a href="#L114">114</a></th><td></td></tr><tr><th id="L115"><a href="#L115">115</a></th><td><span class="o">}</span></td></tr></tbody></table>

      </div>
      <div id="help"><strong>Huomaa:</strong> Katso <a href="/projects/ohj2ht/wiki/TracBrowser">TracBrowser</a>
        löytääksesi ohjeita tiedostovaraston selaamiseksi.</div>
      <div id="anydiff">
        <form action="/projects/ohj2ht/diff" method="get">
          <div class="buttons">
            <input type="hidden" name="new_path" value="/k2018/kijohiet/tags/vaihe7/src/kanta/Tietue.java" />
            <input type="hidden" name="old_path" value="/k2018/kijohiet/tags/vaihe7/src/kanta/Tietue.java" />
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
          <a rel="nofollow" href="/projects/ohj2ht/browser/k2018/kijohiet/tags/vaihe7/src/kanta/Tietue.java?rev=50131&amp;format=txt">Pelkkä teksti</a>
        </li><li class="last">
          <a rel="nofollow" href="/projects/ohj2ht/export/50131/k2018/kijohiet/tags/vaihe7/src/kanta/Tietue.java">Alkuperäinen muoto</a>
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