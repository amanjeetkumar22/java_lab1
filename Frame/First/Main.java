package Frame.First;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class Main{

    public static void main (String[]args){

        // JLabel label = new JLabel("HELLO AMAN");

        JLabel label = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.pink,7);

        label.setText("HELLO AMAN");
        ImageIcon mohpic= new ImageIcon("moh.jpg");
        label.setIcon(mohpic);
        label.setHorizontalTextPosition(JLabel.CENTER);        // label.setHorizontalTextPosition(JLabel.LEFT);
        // label.setHorizontalTextPosition(JLabel.RIGHT);//Bydefault it is in right side
        label.setVerticalTextPosition(JLabel.TOP);//CENTER or BOTTOM

        label.setForeground(new Color (0x00ff00));
        label.setFont(new Font("MV Boli",Font.PLAIN,50));

        label.setIconTextGap(20);
        // label.setIconTextGap(-25);

        label.setBackground(Color.black);
        label.setOpaque(true);

        label.setBorder(border);

        label.setVerticalAlignment(JLabel.TOP);//text and image allign
        label.setHorizontalAlignment(JLabel.RIGHT);//within label
        // label.setBounds(0,0,250,250);//x y position within frame and  dimension(width , height)

        JFrame frame= new JFrame();
        frame.setTitle("First");
        // frame.setSize(500,500);
        // frame.setLayout(null);for cordinate
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.pink);
        // frame.getContentPane().setBackground(Color.white);
        ImageIcon icon =new ImageIcon("images.jpg");
        frame.setIconImage(icon.getImage());
        frame.add(label);

        frame.pack();

    }
}