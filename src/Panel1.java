import javax.swing.*;
import java.awt.*;

public class Panel1 extends JPanel {
    public Panel1(){
        this.setLayout(new GridLayout(3,2,1,1));
        JButton b1 = new JButton("traducir");
        JButton b2 = new JButton("crearfile");
        this.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        this.add(b1);
        this.add(b2);

//        this.setBounds(0,0,1000,1000);
//        this.setBackground(Color.GRAY);
//        this.setLayout(new GridLayout(3,2));
//        JButton translate = new JButton("Traducir");
//        JButton createFile = new JButton("Crear archivo");
//        this.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
//        this.add(translate);
//        this.add(createFile);



    }
}
