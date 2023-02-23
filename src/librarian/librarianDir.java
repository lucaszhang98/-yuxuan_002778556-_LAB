/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarian;

import java.util.ArrayList;

/**
 *
 * @author lucaszhang
 */
public class librarianDir {
    ArrayList<librarian> ld;
    public librarianDir() {
        this.ld = new ArrayList<librarian>();
    }

    public ArrayList<librarian> getLd() {
        return ld;
    }

    public void setLd(ArrayList<librarian> ld) {
        this.ld = ld;
    }
    public librarian createlibrarian(String id, String name) {
        librarian l = new librarian();
        l.setId(id);
        l.setName(name);
        
        this.ld.add(l);
        return l;
    }
}
