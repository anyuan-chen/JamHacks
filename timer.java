import java.util.Timer;
import java.util.TimerTask;

public class countdown {
static int interval;
static Timer timer;

public static void main(String[] args) {
    System.out.print("Time Left = ");
    String secs = "30";
    int delay = 1000;
    int period = 1000;
    timer = new Timer();
    interval = Integer.parseInt(secs);
    System.out.println(secs);
    timer.scheduleAtFixedRate(new TimerTask() {

        public void run() {
            System.out.println("Time Left = " + (setInterval()));
        }
    }, delay, period);
}
    private static final int setInterval() {
        if (interval == 1)
            timer.cancel();
        return --interval;
    }
}