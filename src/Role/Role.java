/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Business.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author lucaszhang
 */
public abstract class Role {
    static String[] roles = {"sysadmin", "librarian", "customer" };

    public static String[] getRoles() {
        return roles;
    }
    
    
    public abstract JFrame getWorkArea(System system, UserAccount useraccount);
    
}
