import com.sun.xml.internal.ws.util.StringUtils;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import org.jibble.jmegahal.*;

import java.io.IOException;
import java.util.List;

/**
 * Created by mhallot on 8/25/16.
 */
public class PostTextMaker {


    String makeMarkov() throws IOException{
        JMegaHal hal = new JMegaHal();

        hal.addDocument("file:///home/meyerhallot/IdeaProjects/memebot9000/feed.txt");
        String sentence = hal.getSentence();
        if (sentence.length()>=140) {
            sentence= sentence.substring(0,140);
            System.out.println(sentence);
        }
        return sentence;
    }

    List getTimeline() throws TwitterException {
        Twitter twitter = TwitterFactory.getSingleton();
        List<Status> statuses = twitter.getHomeTimeline();
        return statuses;
    }

}
