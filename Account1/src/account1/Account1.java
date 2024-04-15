/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package account1;

import javax.swing.JOptionPane;
/**
 *
 * @author abrah
 */
public class Account1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Call all of our variables to be displayed: first name, last name, usrrname and password
        String firstName=JOptionPane.showInputDialog("Please enter your first name");
        String lastName=JOptionPane.showInputDialog("Please enter your last name"); 
        String userName=JOptionPane.showInputDialog("Please enter your username");
        String password=JOptionPane.showInputDialog("Please enter your password");
        
        //Call an object to display our methods: registerUser
        //This will display users registration
        login obj = new login(userName,password,firstName,lastName);
        String registrationMessage = obj.registerUser();
        JOptionPane.showMessageDialog(null, registrationMessage);
        
        //This will display users login
//        boolean LoggedIN = obj.loginUser(JOptionPane.showInputDialog("Please enter username for login"),
//        JOptionPane.showInputDialog("Please enter password"));
//        if(LoggedIN)
//        {
//            JOptionPane.showMessageDialog(null,"Welcome: " + obj.getLastName() + ", it is great to see you again");
//        }
//        else
//        {
//            JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again");
//        } 

        //This calls on the object to display method: LoginMessage
        obj.loginMessage();

    }
}

