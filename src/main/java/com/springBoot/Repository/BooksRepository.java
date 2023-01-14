package com.springBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.springBoot.Entities.Books;

public interface BooksRepository  extends JpaRepository<Books, Integer>{

}
