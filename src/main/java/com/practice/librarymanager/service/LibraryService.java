package com.practice.librarymanager.service;

import com.practice.librarymanager.model.Book;
import com.practice.librarymanager.model.Magazine;
import com.practice.librarymanager.model.Publication;

import java.util.List;

public interface LibraryService {
    String addPublication(Publication publication);
    List<Book> getAllBooks();
    List<Magazine> getAllMagazines();
    List<Publication> searchByAuthor();
    List<Publication> searchByPublisher();
    List<Book> getByAuthor();
}
