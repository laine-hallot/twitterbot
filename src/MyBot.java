import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

import java.io.IOException;

public class MyBot{

	public static void main(String[] args) throws TwitterException{

		PostTextMaker bullshit = new PostTextMaker();

		//new ImageCompositor();
		Twitter twitter = TwitterFactory.getSingleton();
		PostTextMaker test = new PostTextMaker();

		try {
			test.makeMarkov();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}