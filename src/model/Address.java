/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lucaszhang
 */
public class Address {
    String streetName;
    long ApartmentNumber;
    String City;
    int ZipCode;
    
    public Address(){

    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public long getApartmentNumber() {
        return ApartmentNumber;
    }

    public void setApartmentNumber(long ApartmentNumber) {
        this.ApartmentNumber = ApartmentNumber;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public int getZipCode() {
        return ZipCode;
    }

    public void setZipCode(int ZipCode) {
        this.ZipCode = ZipCode;
    }
}
