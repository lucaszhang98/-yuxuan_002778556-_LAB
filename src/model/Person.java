/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lucaszhang
 */
public class Person {
    long NUID;
    String FirstName;
    String LastName;
    String CollegeName;
    ContactInformation officeInfor;
    ContactInformation personalInfor;
    Address currentAddress;
    Address permanentAddress;
    
    public Person() {
        officeInfor = new ContactInformation();
        personalInfor = new ContactInformation();
        currentAddress = new Address();
        permanentAddress = new Address();
    }

    public long getNUID() {
        return NUID;
    }

    public void setNUID(long NUID) {
        this.NUID = NUID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getCollegeName() {
        return CollegeName;
    }

    public void setCollegeName(String CollegeName) {
        this.CollegeName = CollegeName;
    }

    public ContactInformation getOfficeInfor() {
        return officeInfor;
    }

    public void setOfficeInfor(ContactInformation officeInfor) {
        this.officeInfor = officeInfor;
    }

    public ContactInformation getPersonalInfor() {
        return personalInfor;
    }

    public void setPersonalInfor(ContactInformation personalInfor) {
        this.personalInfor = personalInfor;
    }

    public Address getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(Address currentAddress) {
        this.currentAddress = currentAddress;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }
}
