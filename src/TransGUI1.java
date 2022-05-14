import javax.swing.*;
import java.awt.*;

public class TransGUI1 {
    JFrame frame;
    JPanel panel;

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
        panel.setLayout(new GridLayout(3,2,10,10));
        JLabel l1 = new JLabel("Notacion Descriptiva");
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setVerticalAlignment(JLabel.CENTER);

        JLabel l2 = new JLabel("Notacion Algebraica");
        l2.setHorizontalAlignment(JLabel.CENTER);
        l2.setVerticalAlignment(JLabel.CENTER);

        JButton b3 = new JButton("traducir");
        JButton b4 = new JButton("crearfile");

        JTextArea ta1 = new JTextArea(10,10);
        ta1.setFont(new Font("Serif", Font.PLAIN, 18));
        ta1.setLineWrap(true);
        ta1.setWrapStyleWord(true);
        JScrollPane ta1s = new JScrollPane(ta1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);


        JTextArea ta2 = new JTextArea(5,10);
        ta2.setEditable(false);
        ta2.setLineWrap(true);
        ta2.setWrapStyleWord(true);
        JScrollPane ta2s = new JScrollPane(ta2,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        panel.add(l1); panel.add(l2); panel.add(ta1s); panel.add(ta2s);panel.add(b3);panel.add(b4);
        frame.add(panel);
        frame.show();
    }
}
