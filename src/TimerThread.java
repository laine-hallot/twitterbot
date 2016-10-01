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
        public void run(){
            PostTextMaker bullshit = new PostTextMaker();

            //new ImageCompositor();
            Twitter twitter = TwitterFactory.getSingleton();
            PostTextMaker test = new PostTextMaker();


            Status status = null;
            try {
                status = twitter.updateStatus(test.makeMarkov());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (TwitterException e) {
                e.printStackTrace();
            }

        }

}
