package com.practice.librarymanager.model;

import java.util.Objects;

public abstract class Publication {
    private String title;
    private String publisher;
    private Integer year;//todo research if this value may be null
    private int isbnCode;

    public Publication(){}
    public Publication(String title, String publisher, int year, int isbnCode){
        if(title == null || title.isBlank())
            throw new IllegalArgumentException("The title cannot be null");
        this.title = title;

        if(publisher == null || publisher.isBlank())
            throw new IllegalArgumentException("The publisher cannot be null");
        this.publisher = publisher;
        this.year = year;
        this.isbnCode = isbnCode;

    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        if(title == null || title.isBlank())
            throw new IllegalArgumentException("The title cannot be null");
        this.title = title;
    }
     public String getpublisher(){ return publisher;}
     public void setpublisher(String publisher){
        if(publisher == null || publisher.isBlank())
            throw  new IllegalArgumentException("The publisher cannot be null");
        this.publisher = publisher;
     }
     public int getYear(){
        return this.year;
     }
     public void setYear(int year){
        this.year = year;
     }
     public int getISBN(){
       return isbnCode;
     }
     public void setISBN(int isbnCode){
        this.isbnCode = isbnCode;
     }

     @Override
     public String toString(){
        return "Publication{"+
                "title= " + title+", "+
                "publisher= " + publisher+", " +
                "year= " + year + ", " +
                "ISBN code= " + isbnCode +"}";
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publication that = (Publication) o;
        return isbnCode == that.isbnCode && title.equals(that.title) && publisher.equals(that.publisher) && Objects.equals(year, that.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publisher, year, isbnCode);
    }
}
