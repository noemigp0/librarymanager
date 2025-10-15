package com.practice.librarymanager.model;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Date;
import java.util.Objects;

public class Book extends Product{
    @Size(min = 13, max = 13, message = "ISBN code must to contain 13 digits")
    private Integer isbnNumber;
    @NotNull
    @NotBlank(message = "The author name cannot be null")
    private String author;
    @NotNull
    @NotBlank(message = "The publisher name cannot be null")
    private String publisher;
    private int stock;
    @NotNull
    @NotBlank(message = "Purchase date cannot be null")
    private Date purchaseDate;
    private String genre;
    public Book(Integer isbnNumber, String author, String publisher, int stock, Date purchaseDate, String genre){
        this.isbnNumber = isbnNumber;
        this.author = author;
        this.publisher = publisher;
        this.stock = stock;
        this.purchaseDate = purchaseDate;
        this.genre = genre;
    }
    public Integer getIsbnNumber() {
        return this.isbnNumber;
    }
    public void setIsbnNumber(Integer isbnNumber){
        this.isbnNumber = isbnNumber;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getPublisher(){
        return this.publisher;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public int getStock(){
        return this.stock;
    }
    public void setStock(){
        this.stock = stock;
    }
    public Date getPurchaseDate(){
        return this.purchaseDate;
    }
    public void setPurchaseDate(Date purchaseDate){
        this.purchaseDate = purchaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    //In to string method, think that you want to print an object with all the data of this model
    @Override
    public String toString(){
        return "Book {" +
                "ISBN number: "+isbnNumber+ "\n"+
                "Author: "     +author+ "\n"+
                "Publisher: "  +publisher+ "\n"+
                "Stock: "  +stock+ "\n"+
                "Purchase date: "  +purchaseDate+ "\n"+
                "Genre: "          +genre+ "\n"+"}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return stock == book.stock && isbnNumber.equals(book.isbnNumber) && author.equals(book.author) && publisher.equals(book.publisher) && purchaseDate.equals(book.purchaseDate) && genre.equals(book.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isbnNumber, author, publisher, stock, purchaseDate, genre);
    }
}
