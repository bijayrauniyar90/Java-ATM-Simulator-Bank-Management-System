package bank.management.system;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;

// In JDBC Connectivity there are five steps
// i) Register the Driver
// ii) Create Connection
// iii) Create Statement
// iv) Execute Query
// v) Close Connection

// We have to import library mySQL Server
import java.sql.*;


// first of all we do create Connectivity
public class Connectivity {
    
    // ii) Create the coonection
    Connection c;
    
    // iii) Create Statement
    Statement s;
    
    // First we make constructor
    public Connectivity(){
        
        // Then We use exceptional Handling bcoz mySQL is external entity So there is chance of error
        // of runtime errors to catch the errors we use exception Handling
        try{
            // Now we make register the Driver
            // To register the driver there is a class called Class.forName(drive name);
            //Class.forName(com.mysql.cj.jdbc.Driver);
            
            // ii) Create the coonection
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Aang@123");
            
            // iii) Create Statement
            s = c.createStatement();
            
        } catch(Exception e){
            System.out.println(e);
        }
        
        
    
    
    
    }
    
    
}