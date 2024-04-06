package bank.management.system;

// Frame can be made with the help of Swing
// Swing package comes from extended for so we write " javax "
// For Specific importing we use import javax.swing.JFrame
// For selecting all package we use .* i.e. import javax.swing.*

import javax.swing.*;  // It is used to include all the packages of JFrame

import java.awt.*;     // Image class is here so we import java.awt.*;
import java.awt.event.*; // ActionListener Interface is in java.awt.event.* package


// Inheritance Concept - JFrame is a part of swing class which we haveto import from swing Class
    public class Login extends JFrame implements ActionListener {
    
    // Globally Defined of buttons
    JButton login, logup, clear;
    
    // Globally declaration of text field
    JTextField cardTextField;
    
    // For password we use JPasswordField
    JPasswordField pinTextField;
    
    
    Login(){
        
        // For Title we use setTitle(""); Function
        setTitle("AUTOMATED TELLER MACHINE");
        
        // By Default Image is center align if we want to make Bound then we'll use SetLayout
        setLayout(null);
        
        // For Image we use ImageIcon Class
        // Image will come from system so there is one class called ClassLoader
        // & there is one static method called getsystemResource("address of image")
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/scale image.png"));
        
        // For Changing or scaling the image --> We have to make object of Image Class
        // We have to import image class from import java.awt.*
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        
         // We can place ImageIcon in JLabel but we cannot put Image in JLabel so make convert Image into ImageIcon
        ImageIcon i3 = new ImageIcon(i2);
        
        // We cannot directly place an icon in Frame 
        // we have to put in JLabel
        // After converting we pass the i3 object
        JLabel label = new JLabel(i3);
        
        // We can change the location of image So there is lebel we change the label location
        // It takes four arguments 
        // i)Distance from left Hand side
        // ii) Distance from Upwards Direction
        // iii) Width
        // iv) Height
        // Note: By Default it is center align so we'll use custom layout So make the SetLayout(null) in above 
        label.setBounds(70,10,100,100);
        
        // When we have to place Component in Frame we use add() Function
        add(label);
        
        // Main use of JLabel - With the help of JLabel we can write any content in the fame
        JLabel text = new JLabel("Welcome to ATM");
        
        // For changing the Font
        text.setFont(new Font("Osward", Font.BOLD,38));
        
        // We have to set Bounce bcoz we set set=null so we have to write everything ownself
        // 3rd Argument is Label Length we take more so that it will cover all text
        text.setBounds(200, 40, 400, 40);
        add(text);
        
        // Take new Label for ATM Card No. 
        // 3rd Argumet is about Height so we have to take more as 40 is height from y and 40 is text size so total 80
        // so we take more than 80 to make clear visible of text
        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway", Font.BOLD,28));
        cardno.setBounds(120, 150, 150, 30);
        add(cardno);
        
        // For text field sideby Cardno & pin. It is swing so we use J in beginning
        // 120+150=270 
        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 250, 30);
        // For changing the size of font in text field
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardTextField);
        
        // Take new Label for PIN Number
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD,28));
        pin.setBounds(120, 220, 250, 30);
        add(pin);
        
        // PIN Text Field
        // 120 + 120 = 240 
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 250, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinTextField);

     
        // For Log in Button
        login = new JButton("SIGN IN");
        // 1st: from x , 2nd: from y : 3rd: length , 4th: breadth
        login.setBounds(300, 300, 100, 30);   // 2nd arg. ---> 220 + 30 = 250 so gap is 50 so we write 300
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        //For Action of Button
        login.addActionListener(this);
        add(login);
        
         // For Log up Button
        logup = new JButton("SIGN UP");
        // 1st: from x , 2nd: from y : 3rd: length , 4th: breadth
        logup.setBounds(430, 300, 100, 30);   // 2nd arg. ---> 220 + 30 = 250 so gap is 50 so we write 300
        logup.setBackground(Color.BLACK);
        logup.setForeground(Color.WHITE);
        logup.addActionListener(this);
        add(logup);
        
         // For CLEAR Button
        clear = new JButton("CLEAR");
        // 1st: from x , 2nd: from y : 3rd: length , 4th: breadth
        clear.setBounds(300, 350, 230, 30);   // 2nd arg. ---> 220 + 30 = 250 so gap is 50 so we write 300
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        // FOR ACTION OF THE BUTTON - WE implements ActionListener in public class
        
        
        // For changing the color of Frame We have to pick up the whole frame We use getContentPaane()
        getContentPane().setBackground(Color.WHITE);
        
        
        // Function for Dimesnsion of Frame in Length and Breadth
        setSize(800,480);
        
        
        // To specify from where Frame will open then we use setLocation(from x, from y) Function
        setLocation(350, 200);
        
        
        // By Default Frame is hidden from user so we have to make visible
        // By Default is is top left Origin
        // So we make Function setVisible(true) for showing the Frame
        setVisible(true);
        
        
    }
    
    // If we have any interface & we want to implemet that interface then we have to override all methods which are 
    // present in that interface
    
    @Override public void actionPerformed(ActionEvent ae){
        // ae is the object of ActionEvent class
        // What actions we want to do with button is the real use of actiona performed function
        // Every button is locally defined so we have to make globally defined the button
        // ActionEvent tells about on which component action is performed
        if (ae.getSource() == clear){
            // Call the both globally text field
            cardTextField.setText("");
            pinTextField.setText("");
            
        }else if (ae.getSource() == login){
            
        } else if (ae.getSource() == logup){
            // For accessing text field we need globally access of text field
            
        }
        
        
    }
    public static void main(String args[]){
        
        // With the help of swing we make the frame for Log In
        // First we make object of the class
        // When we make object, constructor is called So we write everything in constructor i.e. Login(){}
        // Making Object when we make it, it'll call main function 
        new Login();
    
    }
}
