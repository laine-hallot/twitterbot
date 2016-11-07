import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.TwitterException;

import java.io.IOException;
import java.util.TimerTask;

/**
 * Created by meyerhallot on 10/1/16.
 */
public class TimerThread extends TimerTask{

        @Override
        public void run() {
            PostTextMaker test = new PostTextMaker();
            test.creatPost();
        }
}
