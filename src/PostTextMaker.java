import twitter4j.*;
/*import org.jibble.jmegahal.*;*/

import java.io.*;
import java.util.List;

/**
 * Created by mhallot on 8/25/16.
 */
public class PostTextMaker {

    JMegaHal hal = new JMegaHal();
    Twitter twitter = TwitterFactory.getSingleton();

    String makeMarkov() throws IOException{

        try {
            getTimeline(); //get first 10 posts in the twitter feed.
        } catch (TwitterException e) {
            e.printStackTrace();
        }

        //hal.addDocument("file:///home/meyerhallot/IdeaProjects/memebot9000/Sheck.txt");
        //hal.addDocument("file:///home/meyerhallot/IdeaProjects/memebot9000/feed.txt");
        //hal.addDocument("file:///home/meyerhallot/IdeaProjects/memebot9000/samuraiCop.txt");
        hal.addDocument("file:///home/meyerhallot/IdeaProjects/memebot9000/feed.txt");
        String sentence = hal.getSentence();

        if (sentence.length()>=140) { //makes sure the sentance is bellow twitter's 140 characters
            sentence= sentence.substring(0,140);
            System.out.println(sentence);
        }
        return sentence;
    }

    void getTimeline() throws TwitterException, FileNotFoundException {
        // The factory instance is re-useable and thread safe.
        List<Status> statuses = twitter.getHomeTimeline();
        System.out.println("Showing home timeline.");
        for (Status status : statuses) {
            System.out.println(status.getText());
            hal.add(status.getText());
            try(FileWriter fw = new FileWriter("feed.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw))
            {
                out.println(status.getText());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    void creatPost(){
        Status status = null;
        try{
            status = twitter.updateStatus(makeMarkov());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TwitterException e) {
            e.printStackTrace();
        }

    }


}
