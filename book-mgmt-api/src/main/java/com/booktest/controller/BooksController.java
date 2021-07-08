package com.booktest.controller;

import com.booktest.model.Books;
import com.booktest.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//mark class as Controller
@RestController
public class BooksController 
{
//autowire the BooksService class
@Autowired
BooksService booksService;
//creating a get mapping that retrieves all the books detail from the database 
@GetMapping("/book")
private List<Books> getAllBooks() 
{
return booksService.getAllBooks();
}

//creating a get mapping that retrieves the detail of a specific book
@GetMapping("/book/{isbn}")
private Books getBooks(@PathVariable("isbn") int isbn)
{
return booksService.getBooksById(isbn);
}
//creating a delete mapping that deletes a specified book
@DeleteMapping("/book/{isbn}")
private void deleteBook(@PathVariable("isbn") int isbn)
{
booksService.delete(isbn);
}

//creating post mapping that post the book detail in the database
@PostMapping("/books")
private int saveBook(@RequestBody Books books) 
{
booksService.saveOrUpdate(books);
return books.getISBN();
}

//creating put mapping that updates the book detail 
@PutMapping("/books")
private Books update(@RequestBody Books books) 
{
booksService.saveOrUpdate(books);
return books;
}
}
