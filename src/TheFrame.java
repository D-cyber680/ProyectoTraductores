import javax.swing.*;
import java.awt.*;

public class TheFrame extends JFrame {
    public TheFrame(){
        this.setTitle("Traductor Descriptivo-Algebraico");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1000,800);
        this.setVisible(true);
        //layout
        this.setLayout(null);
        ImageIcon image = new ImageIcon("logo.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(Color.WHITE);


    }

}
