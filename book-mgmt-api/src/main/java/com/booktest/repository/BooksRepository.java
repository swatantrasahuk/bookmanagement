package com.booktest.repository;

import com.booktest.model.Books;
import org.springframework.data.repository.CrudRepository;
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}
