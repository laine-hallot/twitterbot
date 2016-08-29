import rita.RiLexicon;
import rita.RiMarkov;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

import java.util.List;

/**
 * Created by mhallot on 8/25/16.
 */
public class PostTextMaker {
    String memes = "eeeeee";

    void getTimeline() throws TwitterException {
        Twitter twitter = TwitterFactory.getSingleton();
        List<Status> statuses = twitter.getHomeTimeline();
        for (Status status : statuses) {
            System.out.println(status.getText());
        }

        /*RiMarkov e = new RiMarkov(1);
        e.loadText(memes);
        e.generateSentence();*/
    }

}
