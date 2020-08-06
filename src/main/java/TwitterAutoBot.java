import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import java.io.*;
import java.nio.charset.Charset;

public class TwitterAutoBot {
//".properties" file in resources need to include keys and tokens
  /*  debug=true
    oauth.consumerKey="consumer key goes here"
    oauth.consumerSecret="secret key goes here"
    oauth.accessToken="access token goes here"
    oauth.accessTokenSecret= "secret token goes here"
   */
    public static void main(String[] args) {
       // tweetLines();
        System.out.println(TweetCombosRandom.getRandomTweet());
        sendTweet(TweetCombosRandom.getRandomTweet());
    }

    private static void sendTweet(String line) {
        Twitter twitter = TwitterFactory.getSingleton();
        Status status;
        try {
            status = twitter.updateStatus(line);
            System.out.println(status);
        } catch (TwitterException e) {;
            e.printStackTrace();
        }
    }

}
