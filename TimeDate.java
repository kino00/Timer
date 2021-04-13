import java.time.LocalDateTime;

public class TimeDate{
    private LocalDateTime sTime;
    private int time;
    
    TimeDate(LocalDateTime ldTime, int aTime){
        sTime = ldTime;
        time = aTime;
    }
    
    public void setlTime(LocalDateTime ldTime){
        sTime = ldTime;
    }
    
    public void setTime(int aTime){
        time = aTime;
    }
    
    public void decremant(){
        time--;
    }
    
    public int getTime(){
        return time;
    }
}
