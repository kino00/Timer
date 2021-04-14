import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Times{
    private Viewer view;
    
    public static void main(String[] args){
        new Times();
    }
    
    public Times(){
        int zero = 0;
        int thou = 1000;
        view = new Viewer("timer");
        Scanner scan = new Scanner(System.in);
        while(true){
            String number = scan.nextLine();
            int sizes = view.getsSize();
            if(sizes >= 10) continue;
            Timer timer = new Timer();
            TimersTask t = new TimersTask(Integer.valueOf(number).intValue() , timer);
            timer.scheduleAtFixedRate(t, zero, thou);
        }
    }
    public class TimersTask extends TimerTask{
        private Timer timer;
        private TimeDate tDate;
        
        TimersTask(int aTime, Timer aTimer) {
            tDate = new TimeDate(LocalDateTime.now(),aTime);
            timer = aTimer;
            view.creTime(tDate);
        }
        
        public void run() {
            if(tDate.getTime() <= 0){
                view.delList(tDate);
                timer.cancel();
            }
            view.upDate();
            tDate.decremant();
        }
    }
}
