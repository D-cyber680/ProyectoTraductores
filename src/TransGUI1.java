import javax.swing.*;
import java.awt.*;

public class TransGUI1 {
    JFrame frame;
    JPanel panel;
    JButton b1;
    JButton b2;
    public TransGUI1()
    {
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(1000,800);
        frame.setTitle("Traductor Descriptivo-Algebraico");
    }
    public void setGUI()
    {
        panel = new JPanel();
        panel.setLayout(new GridLayout(3,2,1,1));
        JButton b1 = new JButton("traducir");
        JButton b2 = new JButton("crearfile");
        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        panel.add(b1);
        panel.add(b2);
        frame.add(panel);
    }
}
