package Timer;
import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;
public class tiempo {
    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask tarea = new TimerTask() {
            public void run() {
                System.out.println("Esta tarea se ejecuto en " + new Date());
            }
            
        }; timer.scheduleAtFixedRate(tarea, 0, 2000);
    }
}
