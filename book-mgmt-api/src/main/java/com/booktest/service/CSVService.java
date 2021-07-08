package com.booktest.service;

import com.booktest.helper.CSVHelper;
import com.booktest.model.Books;
import com.booktest.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class CSVService {
  @Autowired
  BooksRepository repository;

  public void save(MultipartFile file) {
    try {
      List<Books> books = CSVHelper.uploadCSVFile(file.getInputStream());
      repository.saveAll(books);
    } catch (IOException e) {
      throw new RuntimeException("fail to store csv data: " + e.getMessage());
    }
  }
}
