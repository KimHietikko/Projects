package projekti;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 * @author Kim Hietikko
 * @version 28.3.2019
 * This program uses Jsoup to parse different information from memrise (studying page). 
 * This program is used to parse Japanese kanjis, pronunciations and their english meanings.
 * The infomation is printed and then it can be copy-pasted into, for example Microsoft Excel where the information can be divided into their own cells.
 * I have used this program to make course materials for Japanese courses. I have made excel and pdf files from this information and then the teacher has been shared it with other students.
 */
public class KanjiCollector {

    public static void main(String[] args) throws IOException {
        
        /*
         * This for-loop goes through every page that there is, for example there are 22 chapters (44 pages in total) in this book, 
         * so every odd number is a page where there is english meaning and the kanji.
         * 
         * Every even number is a page where there is a kanjis' pronunciation.
         */
        for (int i = 1; i < 44; i = i+2) {
        Document englishAndKanji = Jsoup.connect("https://www.memrise.com/course/1297017/new-basic-kanji-book-1-kanji-compounds/"+(i)).get();
        Document pronunciation = Jsoup.connect("https://www.memrise.com/course/1297017/new-basic-kanji-book-1-kanji-compounds/"+(i+1)).get();
        
        List<String> kanjis = new ArrayList<String>();
        List<String> kanjiPronunciations = new ArrayList<String>();
        List<String> meaningInEnglish = new ArrayList<String>();
        
        
        /*
         * The program selects the pronunciation part of the kanji from the page and then adds it to the string list.
         */
        for (Element row : pronunciation.select("div.thing.text-text")) {
            String pronunciationPart = row.select("div.col_a.col.text").text();
            kanjiPronunciations.add(pronunciationPart);
        }
        
        /*
         * The program selects the english meaning and the kanji from the page and then adds them to their own string lists.
         */
        for (Element row : englishAndKanji.select("div.thing.text-text")) {
            String english = row.select("div.text.col.col_b").text();
            String kanji = row.select("div.col_a.col.text").text();
            kanjis.add(kanji);
            meaningInEnglish.add(english);
        }
       
        /*
         * Prints everything and divides them with ":" so it's easier to divide them in the Microsoft Excel.
         */
        for (int row = 0; row < kanjis.size(); row++) {
            System.out.println(kanjis.get(row) + ":" + kanjiPronunciations.get(row) + ":" + meaningInEnglish.get(row));
        }
        
        kanjis.clear();
        kanjiPronunciations.clear();
        meaningInEnglish.clear();
        
        System.out.println("\n");
        }
    }

}
