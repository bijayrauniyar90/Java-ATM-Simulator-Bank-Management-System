package bank.management.system;

// Database Connectivity
// JDBC Connectivity - How the java project will be coonected with database
import javax.swing.*;
import java.awt.*;
import java.util.*; // Random class is in util package
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {
    
    // Global Declaration
     long random;
     JTextField nameTextField;
     JTextField fatherTextField;
     JTextField emailTextField;
     JTextField addressTextField;
     JTextField cityTextField;
     JTextField pinTextField;
     JTextField stateTextField;
     JRadioButton male, female, other, married, unmarried;
     JDateChooser dateChooser;
     JButton next;
    
    SignupOne(){
        
        setLayout(null);
        
        // Form will always take random Application form no. 
        Random ran = new Random();
        
        // What will be the size of random number, We'll take that Random Number
        // For converting Negative no. into positive, We use Math.abs (Math Absolute)
        // Math.abs(ran.nextLong() % 9000L) + 1000L --> It will take only 3- 4 digit numbers
        // System.out.println(Math.abs(ran.nextLong() % 9000L) + 1000L );
        random = Math.abs((ran.nextLong() % 9000L) + 1000L );
        
        // Label for Application Number
        JLabel formno = new JLabel("APPLICATION FORM NO. " + random );
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        
        // For using setBounds we have to make setlayout(null) after contructor in above
        formno.setBounds(140, 20, 600, 40);
        add(formno);
        
        // Label for Personal Details & page No.
        JLabel personalDetails = new JLabel("Page 1 : Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);
        
        
        
        // Label for Name
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 200, 30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setBounds(300, 140, 400, 30);
        nameTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(nameTextField);
        
        
        // Label for Father's Name
        // fname
        JLabel fatherName = new JLabel("Father's Name:");
        fatherName.setFont(new Font("Raleway", Font.BOLD, 20));
        fatherName.setBounds(100, 190, 200, 30);
        add(fatherName);
        
        fatherTextField = new JTextField();
        fatherTextField.setBounds(300, 190, 400, 30);
        fatherTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(fatherTextField);
        
        // Label for Date Of Birth
        // dob
        JLabel dateOfBirth = new JLabel("Date OF Birth:");
        dateOfBirth.setFont(new Font("Raleway", Font.BOLD, 20));
        dateOfBirth.setBounds(100, 240, 200, 30);
        add(dateOfBirth);
        
        // To choose Data we have to add Jar file named jcalender and have to import com.toedter.calendar.JDateChooser;
        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 240, 400, 30);
        add(dateChooser);        
        
        // Label for Gender
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
        // Radio Button for Gender
        male = new JRadioButton("Male");
        male.setBackground(Color.WHITE);
        male.setBounds(300, 290, 120, 30);
        add(male);
        
        
        female = new JRadioButton("Female");
        female.setBackground(Color.WHITE);
        female.setBounds(450, 290, 120, 30);
        add(female);
        
        // Radio Button to select only one gender at a time - we do by making group
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        
        // Label for Email Address
        JLabel emailAddress = new JLabel("Email Address:");
        emailAddress.setFont(new Font("Raleway", Font.BOLD, 20));
        emailAddress.setBounds(100, 340, 200, 30);
        add(emailAddress);
        
        emailTextField = new JTextField();
        emailTextField.setBounds(300, 340, 400, 30);
        emailTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(emailTextField);
        
        
        // Label for Martial Status
        JLabel martialStatus = new JLabel("Martial Status:");
        martialStatus.setFont(new Font("Raleway", Font.BOLD, 20));
        martialStatus.setBounds(100, 390, 200, 30);
        add(martialStatus);
      
        // Radio Button for Gender
        married = new JRadioButton("Married");
        married.setBackground(Color.WHITE);
        married.setBounds(300, 390, 100, 30);
        add(married);
        
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBackground(Color.WHITE);
        unmarried.setBounds(450, 390, 100, 30);
        add(unmarried);
        
        other = new JRadioButton("Other");
        other.setBackground(Color.WHITE);
        other.setBounds(630, 390, 100, 30);
        add(other);
        
        // Radio Button to select only one gender at a time - we do by making group
        ButtonGroup martialGroup = new ButtonGroup();
        martialGroup.add(married);
        martialGroup.add(unmarried);
        martialGroup.add(other);
        
        // Label for Address
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setBounds(300, 440, 400, 30);
        addressTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(addressTextField);
        
        
        
        // Label for City
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setBounds(300, 490, 400, 30);
        cityTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cityTextField);
        
        
        // Label for Pin Code
        JLabel pinCode = new JLabel("Pin Code:");
        pinCode.setFont(new Font("Raleway", Font.BOLD, 20));
        pinCode.setBounds(100, 540, 200, 30);
        add(pinCode);
        
        pinTextField = new JTextField();
        pinTextField.setBounds(300, 540, 400, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinTextField);
        
        
        // Label for State
        JLabel state = new JLabel("state:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 590, 200, 30);
        add(state);      
        
        stateTextField = new JTextField();
        stateTextField.setBounds(300, 590, 400, 30);
        stateTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(stateTextField);
        
        // For Next Button
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        
        
        
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
    
    @Override public void actionPerformed(ActionEvent ae){
        String formno = "" + random; // long --> When we double quote And add + then it is converted to String
        String name = nameTextField.getText(); // setText
        String fatherName = fatherTextField.getText();
        String dateOfBirth = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected()){
            gender = "Male";
            
        }   else if (female.isSelected()){
            gender = "Female";
        }
        
        String emailAddress = emailTextField.getText();
        String martialStatus = null;
        if (married.isSelected()){
            martialStatus = "Married";
        }   else if (unmarried.isSelected()){
            martialStatus = "Unmarried";
        }   else if (other.isSelected()){
            martialStatus = "Other";
        }   
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pinCode = pinTextField.getText();
        
        // Validation Mandatory**** Section - We can add for any same like
        try {
            if (name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required");
            
            }   else {
                Connectivity c = new Connectivity();
                String query = "INSERT INTO signup VALUES ('" + formno + "', '" + name + "', '" + fatherName + "', '" + dateOfBirth + "', '" + gender + "', '" + emailAddress + "', '" + martialStatus + "', '" + address + "', '" + city + "', '" + pinCode + "', '" + state + "')";
//                c.s.getConnection();
                c.s.executeUpdate(query);
                
                
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            
            }
            
        
        }   catch (Exception e){
            System.out.println(e);
        
        }
    
    }
    
  
    public static void main(String args[]){
        
        new SignupOne();
    }
    
}
