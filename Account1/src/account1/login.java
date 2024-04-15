/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package account1;

import javax.swing.JOptionPane;

/**
 *
 * @author abrah
 */
public class login {

    //4 Variables 
    //Private so only this class can use them
        private String userName;
        private String password;
        private String firstName;
        private String lastName;
        
    //Constructor for each variable
    public login(String username, String password, String firstname, String lastname) {
        this.userName = username;
        this.password = password;
        this.firstName = firstname;
        this.lastName = lastname;
    }
    
    //Get and set each variable

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    //create a check userName method
    //This method ensures username contains an underscore(_) and is no more than 5 characters
    public boolean checkUserName(){
            return this.userName.contains("_") && this.userName.length() <= 5; 
    }
    
    //create a checkPasswordComplexity method
    //This method ensures:
    //password must be 8 characters long
    //contain capital letter, number and special character
    public boolean checkPasswordComplexity(){
        
        String regex="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
return password.matches(regex);
        }

    /*
    Title: Java regex validate password examples
    Author: Mkyong
    Date: 12 April 2024
    Code version: 1
    Availability: https://mkyong.com/regular-expressions/how-to-validate-password-with-regular-expression/
    */
    
    
    
    //Create a method to register user
    // This method returns necessary registration messages:
    //username or password is incorrectly formated and these two conditions need to be met
    public String registerUser(){
       
        if(!checkUserName()){
            return "Username or password is not correctly formatted, please ensure that your username contains an underscore and is no longer than 5 characters  or that password contains at least 8 characters, a capital and lower letter and a special character ";
        }
        
        else if(checkPasswordComplexity()){
            return "Password and Username is correctly formatted";
        } else {
            return "Your account has been registered successfully";
        }
        
        /*
        Title: Method to register user using JOptionPane on java
        Author: OpenAI (Provided by ChatGPT)
        Date: 08 April 2024
        Code cersion: 1
        Availability: OpenAI
        */
    }
    
    //create method to verify login details
    /* public boolean loginUser (){
        userName = JOptionPane.showInputDialog("Please enter username for login");
        password = JOptionPane.showInputDialog("Please enter password");
        
        {
            return (userName.equals(this.userName) && password.equals(this.password));
        }
    }*/
    
    
    //Create a method to login user
    //This verifies the login details and ensures they meet stored details
    public boolean loginUser(){
        userName = JOptionPane.showInputDialog("Please enter username for login");
        password = JOptionPane.showInputDialog("Please enter password");
        if ((userName.equals(this.userName) && password.equals(this.password))){
            JOptionPane.showMessageDialog(null,"Welcome back, "+firstName+" "+lastName+  ",It is great seeing you again" + ".");
            return true;
        }
        else
            return false;
                    
  
    }
    
    //Create method return login status
    //This returns messages for the messages login successful or login failed
    public String returnLoginStatus()
    {
        
        if(loginUser())
        {
            return "Login successful.";
        }
    else
        {
            return "Login failed.";
        }
    
    }
    
    //This method is to display login message
    public void loginMessage(){
        JOptionPane.showMessageDialog(null,returnLoginStatus());
    }
    

}
       

    
    

    
  
    
        
