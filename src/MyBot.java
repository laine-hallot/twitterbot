import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class MyBot{

	public static void main(String[] args) throws TwitterException{

		PostTextMaker bullshit = new PostTextMaker();

		new ImageCompositor();
		Twitter twitter = TwitterFactory.getSingleton();
		PostTextMaker test = new PostTextMaker();
		test.getTimeline();

		//Status status = twitter.updateStatus(bullshit.tweetString);
		System.out.println("Done.");
	 }
}
