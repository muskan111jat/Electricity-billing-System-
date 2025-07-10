package system;

import javax.swing.*;

import javax.swing.JFrame;

class Login extends JFrame {
    Login() {
        setSize(500, 500);
        setVisible(true);
        try {
            Thread.sleep(3000);//frame will  hold for 2 sec then it will automatically close
            setVisible(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}



