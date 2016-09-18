/*import rita.RiLexicon;
import rita.RiMarkov;*/
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

import java.util.List;

/**
 * Created by mhallot on 8/25/16.
 */
public class PostTextMaker {
    List getTimeline() throws TwitterException {
        Twitter twitter = TwitterFactory.getSingleton();
        List<Status> statuses = twitter.getHomeTimeline();
        return statuses;
    }

}
