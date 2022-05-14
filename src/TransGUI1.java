import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TransGUI1 {
    JFrame frame;
    JPanel panel;
    String game_desc;
    Game new_game;
    public TransGUI1()
    {
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(800,500);
        frame.setTitle("Traductor Descriptivo-Algebraico");
    }
    public void setGUI()
    {
        panel = new JPanel();
        panel.setLayout(new GridLayout(3,2,10,10));
        panel.setBackground(Color.LIGHT_GRAY);
        JLabel l1 = new JLabel("PARTIDA EN NOTACION DESCRIPTIVA");
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setVerticalAlignment(JLabel.CENTER);
        l1.setFont(new Font("Serif", Font.PLAIN, 20));
        JLabel l2 = new JLabel("PARTIDA EN NOTACION ALGEBRAICA");
        l2.setHorizontalAlignment(JLabel.CENTER);
        l2.setVerticalAlignment(JLabel.CENTER);
        l2.setFont(new Font("Serif", Font.PLAIN, 20));

        JButton b3 = new JButton("TRADUCIR");
        b3.setFont(new Font("Serif", Font.PLAIN, 24));
        JButton b4 = new JButton("CREAR ARCHIVO");



        b4.setFont(new Font("Serif", Font.PLAIN, 24));

        JTextArea ta1 = new JTextArea(10,10);
        ta1.setFont(new Font("Serif", Font.PLAIN, 18));
        ta1.setLineWrap(true);
        ta1.setWrapStyleWord(true);
        JScrollPane ta1s = new JScrollPane(ta1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);


        JTextArea ta2 = new JTextArea(5,10);
        ta2.setFont(new Font("Serif", Font.PLAIN, 18));
        ta2.setEditable(false);
        ta2.setLineWrap(true);
        ta2.setWrapStyleWord(true);
        JScrollPane ta2s = new JScrollPane(ta2,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        b3.addActionListener(e -> {
            game_desc = ta1.getText();
            new_game = new Game(game_desc);
            ta2.setText(new_game.listToGameAlg());
            //System.out.println("contents = " + game_desc);
        });

        panel.add(l1); panel.add(l2); panel.add(ta1s); panel.add(ta2s);panel.add(b3);panel.add(b4);
        frame.add(panel);
        frame.show();
    }
}
