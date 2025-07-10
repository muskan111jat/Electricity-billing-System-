import javax.swing.*;
import java.awt.*;

class Login extends JFrame {
    JTextField userText, passwordText;//declared globally as we will use it for jdbc connection etc
    Choice loginChoice;//to create dropdown for login as what?
    JButton loginButton, cancelButton, SignupButton;

    Login() {
        super(" Login");//super should be the firststatement in the constuctor rule of java otherwise error
        getContentPane().setBackground(Color.LIGHT_GRAY);
        JLabel username = new JLabel("Username");// to make any test visible we use jframe
        username.setBounds(300, 60, 100, 20);
        add(username);


        userText = new JTextField();
        userText.setBounds(400, 60, 150, 20);//x axis badhegaa username 300 h  to text field
        add(userText);


        JLabel password = new JLabel("Password");// to make any test visible we use jframe
        password.setBounds(300, 100, 100, 20);
        add(password);


        passwordText = new JTextField();
        passwordText.setBounds(400, 100, 150, 20);//x axis badhegaa username 300 h  to text field
        add(passwordText);


        JLabel loggin = new JLabel("Loggin in As");// to make any test visible we use jframe
        loggin.setBounds(300, 140, 100, 20);
        add(loggin);//add frame


        loginChoice = new Choice();
        loginChoice.add("Admin");
        loginChoice.add("Customer");
        loginChoice.setBounds(400, 140, 150, 20);
        add(loginChoice);


        loginButton = new JButton("Login");
        loginButton.setBounds(330, 180, 100, 20);
        add(loginButton);//to add button

        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(460, 180, 100, 20);
        add(cancelButton);

        SignupButton = new JButton("Signup");
        SignupButton.setBounds(400, 215, 100, 20);
        add(SignupButton);



        ImageIcon profileOne = new ImageIcon(ClassLoader.getSystemResource("icon/splash/profile2.png"));//
        Image profileTwo = profileOne.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        // to scale image on frame or set it on frame
        ImageIcon fprofileOne = new ImageIcon(profileTwo);//
        JLabel profilelabel = new JLabel(fprofileOne);
        profilelabel.setBounds(5, 5, 250, 250);
        add(profilelabel);

        setSize(640, 300);
        setLocation(400, 200);
        setLayout(null);//it means we have remove the default layout i.e-Border and set null there
        setVisible(true);

}


    public static void main(String[] args) {
        new Login();
    }
}




