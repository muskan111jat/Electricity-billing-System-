package electricity.billing.system;
import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {
    public Splash() {
        ImageIcon imageIcon =new ImageIcon(getClass().getResource("/icon/splash/Splash.jpg"));
        Image imageOne=imageIcon.getImage().getScaledInstance(600,400, Image.SCALE_DEFAULT);
        JLabel imageLabel =new JLabel(imageIcon);
        ImageIcon scaledIcon =new ImageIcon(imageOne);
        JLabel imageLabel2 =new JLabel(scaledIcon);
        add(imageLabel2);
        try{
Thread.sleep(3000);
setVisible(false);
        }
        catch(Exception e){
        e.printStackTrace();

        }



setSize(400,400);//
setLocation(500,200);//
setVisible(true);// hamesha set visble neche he rahega iske upr sab images wala content ayegaa ,nichee rahega warna frame pr visible image ya jo bhii h visible nhi hogaa

    }
    public static void main(String[] args) {
    new Splash();//3.crested a splash object
    }

}
