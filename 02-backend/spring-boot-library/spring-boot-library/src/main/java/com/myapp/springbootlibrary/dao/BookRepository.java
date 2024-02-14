package com.myapp.springbootlibrary.dao;

import com.myapp.springbootlibrary.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
