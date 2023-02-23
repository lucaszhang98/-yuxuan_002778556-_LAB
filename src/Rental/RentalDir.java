/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rental;

import java.util.ArrayList;

/**
 *
 * @author lucaszhang
 */
public class RentalDir {
    ArrayList<Rental> rd;
    public RentalDir() {
        this.rd = new ArrayList<Rental>();
    }

    public ArrayList<Rental> getRd() {
        return rd;
    }

    public void setRd(ArrayList<Rental> rd) {
        this.rd = rd;
    }
}
