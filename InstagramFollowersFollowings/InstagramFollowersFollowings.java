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
 * @version 28.3.2019
 * In this program you can find out does someone who you follow, follow you back. The program uses Jsoup library by parsing different information.
 * First the program parses the user's ID from the Instagram page then inputs the ID to pictame website where you can check your follower and followings.
 * The downsides are that the profile needs to be public and you can only have around 200 followers/followings because pictame shows only that much in one page.
 * Pictame follower/following pages don't go in any logic order so it's hard to check rest of the pages.
 * One solution might be that this program requires Instagram API and then check the followers and followings by using it.
 */
public class InstagramFollowersFollowings {

    public static void main(String[] args) throws IOException {
        
        long userID = 0;
        String username = null;
        
        Scanner inputReader = new Scanner(System.in);
        System.out.print("Please enter your Instagram username: ");

        username = inputReader.nextLine();
        
        Document user = Jsoup.connect("https://www.instagram.com/"+ username).get();
        
        /*
         * Gets user's ID from Instagram's source code.
         */
        for (Element element : user.getElementsByTag("script")) {                
            for (DataNode node : element.dataNodes()) {
                if (node.getWholeData().contains("logging")) {
                    String data = node.getWholeData();
                    int alkuID = data.indexOf("id") + 17;
                    userID = Long.parseLong(data.substring(alkuID, data.indexOf("\"", alkuID)));
                }
            }         
      }
        
        
        List<String> followers = new ArrayList<String>();
        
        int count = 0;
        
        Document instaFollowers = Jsoup.connect("https://www.pictame.com/user/" + username + "/followers/"+ userID).get();
        Document instaFollowings = Jsoup.connect("https://www.pictame.com/user/" + username + "/followings/"+ userID).get();
        
        Elements followerNames = instaFollowers.select("[title]");
        Elements followingNames = instaFollowings.select("[title]");
        
        /*
         * Adds all the followers' names to a string list.
         */
        for (Element name : followerNames) {
            followers.add(name.attr("title"));
        }
        
        /*
         * Checks the followings' names and if the followings' names are in the followers' namelist.
         * If there is someone who you follow but they don't follow you back, the program prints their name and add 1 to the counter.
         */
        for (Element name : followingNames) {
            if (!followers.contains(name.attr("title"))) {
                System.out.println(name.attr("title"));
                count += 1;
            }
        }
        System.out.println("\nYou're not followed back by: " + count + " people");
        
    }

}
