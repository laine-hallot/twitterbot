import java.util.Timer;

public class MyBot{

	public static void main(String[] args) {
		Timer timer = new Timer();
		TimerThread postEveryHoure = new TimerThread();

		timer.schedule(new TimerThread(),0,360000);

		ImageCompositor image = new ImageCompositor();
	}
}