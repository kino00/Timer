import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.util.ArrayList;
import java.time.LocalDateTime;

class Viewer extends JFrame{
    private JPanel panel;
    private JLabel label;
    private ArrayList<TimeDate> list;
    
    Viewer(String title){
        super(title);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        setSize(200, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        panel = new JPanel();
        label = new JLabel("");
        panel.add(label);
        this.add(panel);
        this.setVisible(true);
        list = new ArrayList<TimeDate>();
    }
    public void creTime(TimeDate tDate){
        list.add(tDate);
    }
    public void delList(TimeDate tDate){
        list.removeIf(l -> l.getTime() <= 0);
    }
    public void upDate(){
        StringBuilder buf = new StringBuilder();
        buf.append("<html><body><h2>");
        for(TimeDate t: list){
            buf.append(String.format("%02d:%02d",t.getTime()/60 ,t.getTime()%60));
            buf.append("<br />");
        }
        buf.append("</h2></body></html>");
        label.setText(buf.toString());
    }
    
    public int getsSize(){
        return list.size();
    }
}
