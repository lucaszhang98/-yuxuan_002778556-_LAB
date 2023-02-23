/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;

import java.util.ArrayList;

/**
 *
 * @author lucaszhang
 */
public class BookDir {
    ArrayList<Book> bd;
    public BookDir() {
        this.bd = new ArrayList<Book>();
    }

    public ArrayList<Book> getBd() {
        return bd;
    }

    public void setBd(ArrayList<Book> bd) {
        this.bd = bd;
    }
    
    public Book createBook(String id, String name, String Author, String Genre, String price, String status) {
        Book book = new Book();
        book.setId(id);
        book.setName(name);
        book.setGenre(Genre);
        book.setAuthor(Author);
        book.setPrice(price);
        book.setStatus(status);
        
        this.bd.add(book);
        return book;
    }
    
    public Book findById(String id) {
        for(Book d: this.bd) {
            if(d.getId().equals(id)) {
                return d;
            }
        }
        
        return null;
    }
    
    public Boolean checkUnique(String string) {
        for(Book b: this.bd) {
            if(b.getStatus().equals(string)) {
                return false;
            }
        }
        
        return true;
    }
}
