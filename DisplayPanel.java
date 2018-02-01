package solarcartelem;

//Used for Graphics
import javax.swing.*;
import java.awt.*;

public class DisplayPanel {
    private JFrame Telem;
    private JPanel MainPanel;
    private JButton b1;
    private JLabel ll;
    
    public DisplayPanel(){
        gui();
    }
    public void gui(){
        //Making the Frame
        Telem= new JFrame("Telemetry"); //Calls the window Telemetry
        Telem.setVisible(true);
        Telem.setSize(800,600); //Sets the pixel size (width,length)
        Telem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Closes the frame when you press the close button
        

        MainPanel= new JPanel(); 
        MainPanel.setBackground(Color.WHITE);
        
        Telem.add(MainPanel); //Add the panel to the frame
    }
}

