import java.util.ArrayList;

public class TweetCombosRandom {


    public static String getRandomTweet(){
        ArrayList<String> lyrics = new ArrayList<>();
        lyrics.add("we");
        lyrics.add("are");
        lyrics.add("best");
        lyrics.add("friends");
        lyrics.add("you are awesome");
        lyrics.add("you are alright");
        lyrics.add("best friend");
        lyrics.add("you're a goddess");
        lyrics.add("my best friend");
        lyrics.add("Im so Hyped RN");
        lyrics.add("im so hyped right now");
        lyrics.add("im so hyped right now🐋");
        lyrics.add("🐊");
        lyrics.add("univocity");
        lyrics.add("😍");
        lyrics.add("rewind");
        lyrics.add("unison");
        lyrics.add("*being a-okay*");
        lyrics.add("showing the way home");
        lyrics.add("we will ride or die till we transcend");
        lyrics.add("aka forever");

        String randomTweet =
                lyrics.get((int) (Math.random()*lyrics.size())) +"\n"+ lyrics.get((int) (Math.random()*lyrics.size())) + "\n" +
                lyrics.get((int) (Math.random()*lyrics.size())) + "\n-Mabi";

        return randomTweet;
    }
}
