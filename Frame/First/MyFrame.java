package Frame.First;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("First GUI 2nd");
        this.setSize(420,420);
        this.setVisible(true);

        // this.setResizable(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        // this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        ImageIcon icon = new ImageIcon("images.jpg");
        // ImageIcon icon = new ImageIcon(SwingDemo.class.getResource("images.jpg"));
        this.setIconImage(icon.getImage());

        this.getContentPane().setBackground(Color.BLACK);
        this.getContentPane().setBackground(Color.green);
        this.getContentPane().setBackground(Color.green);
        this.getContentPane().setBackground(new Color(52, 13, 121));//rgb color code
        this.getContentPane().setBackground(Color.gray);
        this.getContentPane().setBackground(new Color(0x012345));// hexadecimal color coding
    }

}