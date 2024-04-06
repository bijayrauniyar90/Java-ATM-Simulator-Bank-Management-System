package bank.management.system;

// Database Connectivity
// JDBC Connectivity - How the java project will be coonected with database
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    
    // Global Declaration
     long random;
     JTextField panTextField, aadharTextField;
     JRadioButton seniorYes, seniorNo, existingAccountYes, existingAccountNo;
     JComboBox religionTextField, categoryTextField, incomeTextField, educationalTextField, occupationTextField;
     JButton next;
     String formno;
    
    SignupTwo(String formno){

        this.formno = formno;
        
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        // Label for Personal Details & page No.
        JLabel personalDetails = new JLabel("Page 2 : Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);
        
        
        
        // Label for Religion
        JLabel religionLabel = new JLabel("Religion:");
        religionLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        religionLabel.setBounds(100, 140, 200, 30);
        add(religionLabel);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religionTextField = new JComboBox(valReligion);
        religionTextField.setBounds(300, 140, 400, 30);
        religionTextField.setBackground(Color.WHITE);
        add(religionTextField);
        
        
        // Label for category
        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100, 190, 200, 30);
        add(category);
        
        String valcategory[] = {"General", "OBC", "SC", "ST", "Others"};        
        categoryTextField = new JComboBox(valcategory);
        categoryTextField.setBounds(300, 190, 400, 30);
        categoryTextField.setBackground(Color.WHITE);
        add(categoryTextField);
        
        // Label for Income
        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100, 240, 200, 30);
        add(income);
        
        String incomecategory[] = {"Null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000"};
        incomeTextField = new JComboBox(incomecategory);
        incomeTextField.setBounds(300, 240, 400, 30);
        incomeTextField.setBackground(Color.WHITE);
        add(incomeTextField);       
        
        // Label for Educational
        JLabel educational = new JLabel("Educational");
        educational.setFont(new Font("Raleway", Font.BOLD, 20));
        educational.setBounds(100, 290, 200, 30);
        add(educational);
        
        String educationalcategory[] = {"Non-Graduation", "Graduate", "Post-Graduation", "Doctrate", "Others"};
        educationalTextField = new JComboBox(educationalcategory);
        educationalTextField.setBounds(300, 315, 400, 30);
        educationalTextField.setBackground(Color.WHITE);
        add(educationalTextField); 
        
       
        
        // Label for Qualification
        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100, 315, 200, 30);
        add(qualification);
        
        
        
        // Label for Occupation
        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100, 390, 200, 30);
        add(occupation);
        
        String occupationcategory[] = {"Self-Employed", "Bussiness", "Student", "Retired", "Others"};
        occupationTextField = new JComboBox(occupationcategory);
        occupationTextField.setBounds(300, 390, 400, 30);
        occupationTextField.setBackground(Color.WHITE);
        add(occupationTextField); 
      
     
        
        // Label for Pan Number
        JLabel panNumber = new JLabel("Pan Number:");
        panNumber.setFont(new Font("Raleway", Font.BOLD, 20));
        panNumber.setBounds(100, 440, 200, 30);
        add(panNumber);
        
        panTextField = new JTextField();
        panTextField.setBounds(300, 440, 400, 30);
        panTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(panTextField);
        
        
        
        // Label for Adhar Number
        JLabel adharNumber = new JLabel("Aadhar Number:");
        adharNumber.setFont(new Font("Raleway", Font.BOLD, 20));
        adharNumber.setBounds(100, 490, 200, 30);
        add(adharNumber);
        
        aadharTextField = new JTextField();
        aadharTextField.setBounds(300, 490, 400, 30);
        aadharTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(aadharTextField);
        
        
        // Label for Senior Citizen
        JLabel seniorCitizen = new JLabel("Senior Citizen:");
        seniorCitizen.setFont(new Font("Raleway", Font.BOLD, 20));
        seniorCitizen.setBounds(100, 540, 200, 30);
        add(seniorCitizen);
        
        
        // Radio Button for Senior Citizen - YES
        seniorYes = new JRadioButton("Yes");
        seniorYes.setBackground(Color.WHITE);
        seniorYes.setBounds(300, 540, 100, 30);
        add(seniorYes);
        
        
        // Radio Button for Senior Citizen - NO
        seniorNo = new JRadioButton("No");
        seniorNo.setBackground(Color.WHITE);
        seniorNo.setBounds(450, 540, 100, 30);
        add(seniorNo);
        
        // Radio Button to select only one gender at a time - we do by making group
        ButtonGroup seniorGroup = new ButtonGroup();
        seniorGroup.add(seniorYes);
        seniorGroup.add(seniorNo);
        
        
        // Label for Existing Account
        JLabel existingAccount = new JLabel("Existing Account:");
        existingAccount.setFont(new Font("Raleway", Font.BOLD, 20));
        existingAccount.setBounds(100, 590, 200, 30);
        add(existingAccount);     
        
        // Radio Button for Senior Citizen - YES
        existingAccountYes = new JRadioButton("Yes");
        existingAccountYes.setBackground(Color.WHITE);
        existingAccountYes.setBounds(300, 590, 100, 30);
        add(existingAccountYes);
        
        
        // Radio Button for Senior Citizen - NO
        existingAccountNo = new JRadioButton("No");
        existingAccountNo.setBackground(Color.WHITE);
        existingAccountNo.setBounds(450, 590, 100, 30);
        add(existingAccountNo);
        
        // Radio Button to select only one gender at a time - we do by making group
        ButtonGroup accpountGroup = new ButtonGroup();
        accpountGroup.add(existingAccountYes);
        accpountGroup.add(existingAccountNo);
        
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
        String religionLabel = (String)religionTextField.getSelectedItem(); // setText
        String scategory = (String)categoryTextField.getSelectedItem();
        String sincome = (String)incomeTextField.getSelectedItem();
        String seducation = (String)educationalTextField.getSelectedItem();
        String soccupation = (String)occupationTextField.getSelectedItem();
        
        String seniorcitizen = null;
        if (seniorYes.isSelected()){
            seniorcitizen = "Yes";
            
        }   else if (seniorNo.isSelected()){
            seniorcitizen = "No";
        }
        
        String existingaccount = null;
        if (existingAccountYes.isSelected()){
            existingaccount = "Yes";
        }   else if (existingAccountNo.isSelected()){
            existingaccount = "No";
        }
        
        String span = panTextField.getText();
        String saadhar = aadharTextField.getText();
        
        // Validation Mandatory**** Section - We can add for any same like
        try {
                Connectivity c = new Connectivity();
                String query = "INSERT INTO signuptwo VALUES ('" + formno + "', '" + religionTextField + "', '" + categoryTextField + "', '" + incomeTextField + "', '" + educationalTextField + "', '" + occupationTextField + "', '" + panTextField + "',  '" + aadharTextField + "',)";
//                c.s.getConnection();
                c.s.executeUpdate(query);
            
            }
        } catch (Exception e){
            System.out.println(e);
        
        }
    
    }
    
  
    public static void main(String args[]){
        
        new SignupTwo("");
    }
    
}
