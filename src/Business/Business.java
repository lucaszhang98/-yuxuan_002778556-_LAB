/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Author.AuthorDir;
import Book.BookDir;
import Customer.CustomerDir;
import Genre.GenreDir;
import Rental.RentalDir;
import librarian.librarianDir;

/**
 *
 * @author lucaszhang
 */
public class Business {
    private UserAccountDir uad;
    private AuthorDir ad;
    private BookDir bd;
    private CustomerDir cd;
    private GenreDir gd;
    private RentalDir rd;
    private librarianDir ld;
    
    public Business() {
        this.uad = new UserAccountDir();
        this.ad = new AuthorDir();
        this.bd = new BookDir();
        this.cd = new CustomerDir();
        this.gd = new GenreDir();
        this.rd = new RentalDir();
        this.ld = new librarianDir();
        
        UserAccount user = this.uad.createUserAccount("admin", "admin", "sysadmin");
    }
    
    public static Business getBusinessInstance() {
        
        return new Business();
    }

    public UserAccountDir getUad() {
        return uad;
    }

    public void setUad(UserAccountDir uad) {
        this.uad = uad;
    }

    public AuthorDir getAd() {
        return ad;
    }

    public void setAd(AuthorDir ad) {
        this.ad = ad;
    }

    public BookDir getBd() {
        return bd;
    }

    public void setBd(BookDir bd) {
        this.bd = bd;
    }

    public CustomerDir getCd() {
        return cd;
    }

    public void setCd(CustomerDir cd) {
        this.cd = cd;
    }

    public GenreDir getGd() {
        return gd;
    }

    public void setGd(GenreDir gd) {
        this.gd = gd;
    }

    public RentalDir getRd() {
        return rd;
    }

    public void setRd(RentalDir rd) {
        this.rd = rd;
    }

    public librarianDir getLd() {
        return ld;
    }

    public void setLd(librarianDir ld) {
        this.ld = ld;
    }
    
}
