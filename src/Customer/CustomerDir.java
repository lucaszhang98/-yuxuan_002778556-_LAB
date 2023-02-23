/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import java.util.ArrayList;

/**
 *
 * @author lucaszhang
 */
public class CustomerDir {
    ArrayList<Customer> cd;
    public CustomerDir() {
        this.cd = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCd() {
        return cd;
    }

    public void setCd(ArrayList<Customer> cd) {
        this.cd = cd;
    }
    public Customer createCustomer(String id, String name) {
        Customer c = new Customer();
        c.setId(id);
        c.setName(name);
        
        this.cd.add(c);
        return c;
    }
}
