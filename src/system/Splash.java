package system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {
    public Splash() {
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/icon/splash/Splash.jpg"));
        Image imageOne = imageIcon.getImage().getScaledInstance(600, 400, Image.SCALE_DEFAULT);
        ImageIcon scaledIcon = new ImageIcon(imageOne);

        JLabel imageLabel = new JLabel(scaledIcon);
        add(imageLabel);
        setSize(400, 400);//
        setLocation(500, 200);//frame location x and y axis from top left or right
        setVisible(true);// hamesha set visble neche he rahega iske upr sab images wala content ayegaa ,nichee rahega warna frame pr visible image ya jo bhii h visible nhi hogaa
        try {
            Thread.sleep(3000);//frame will  hold for 2 sec then it will automatically close
            setVisible(false);
            new Login();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Splash();//3.created a splash object
    }

}
