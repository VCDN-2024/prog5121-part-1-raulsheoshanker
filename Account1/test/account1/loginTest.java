/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package account1;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author abrah
 */
public class loginTest {
    
   
    @Test
    public void testGetUserName() {
       
        login instance = new login("Kyl_1","Password","John"," Smith");
        
        assertTrue(instance.checkUserName());
        
    }

      @Test
    public void testGetUserNameInvalid() {
       
        login instance = new login("Kyl%1","Password","John"," Smith");
        
        assertFalse(instance.checkUserName());
        
    }
    
         @Test
    public void testCheckPasswordInvalid() {
       
        login instance = new login("Kyl%1","Password","John"," Smith");
        
        assertFalse(instance.checkPasswordComplexity());
        
    }
    
          @Test
    public void testCheckPasswordValid() {
       
        login instance = new login("Kyl%1","Ch&&sec99!","John"," Smith");
        
        assertTrue(instance.checkPasswordComplexity());
        
    }
    
          @Test
     public void testLoginUserValid() {
       
        login instance = new login("Kyl%1","Ch&sec9","John"," Smith");
        
        assertTrue(instance.loginUser());
        
    }
     
          @Test
     public void testLoginUserInvalid() {
       
        login instance = new login("Kyl%1","Ch&sec9","John"," Smith");
        
        assertFalse(instance.checkPasswordComplexity());
        
    }
    
}
