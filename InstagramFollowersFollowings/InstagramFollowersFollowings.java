package projekti;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * @author Kim Hietikko
 * @version 7.4.2019
 * In this program you can find out does someone who you follow, follow you back. The program uses Jsoup library by parsing different information.
 * First the program asks the user's Instagram username then inputs it to GalleryOfSocial website where you can check your followers and followings.
 * The downsides are that the profile needs to be public and it doesn't work with lots of followers/followings
 * One solution might be that this program would use Instagram API and then check the followers and followings by using it.
 */
public class InstagramFollowersFollowings {

    public static void main(String[] args) throws IOException {
        
        String username = "";
        
        Scanner inputReader = new Scanner(System.in);
        
            
        System.out.print("Please enter your Instagram username: ");
    
        username = inputReader.nextLine();
        
        List<String> followers = new ArrayList<String>();
        
        int count = 0;
        
        Document instaFollowers = Jsoup.connect("https://www.galleryofsocial.com/user/" + username + "/followers/").get();
        Document instaFollowings = Jsoup.connect("https://www.galleryofsocial.com/user/" + username + "/following/").get();
        
        /*
         * Adds all the followers' names to a string list.
         */
        for (Element name : instaFollowers.select(".em-web")) {
            String followersName = name.select("span:nth-of-type(1)").text();
            followers.add(followersName);
        }
        
        /*
         * Checks the followings' names and if the followings' names are in the followers' namelist.
         * If there is someone who you follow but they don't follow you back, the program prints their name and add 1 to the counter.
         */
        for (Element name : instaFollowings.select(".em-web")) {
            String followingName = name.select("span:nth-of-type(1)").text();
                if (!followers.contains(followingName)) {
                    System.out.println(followingName);
                    count += 1;
                }
        }
        System.out.println("\nYou're not followed back by: " + count + " people\n");
        
    }
}
