package com.springBoot.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.springBoot.Entities.Books;
import com.springBoot.Repository.BooksRepository;

@Service
public class BooksService {
	
	@Autowired
	BooksRepository booksRepository;
	
	public List<Books> getAllBooks(){
		
		
		return booksRepository.findAll();
		
		 
	}
	public Books getBooksById(int id) {
		return booksRepository.findById(id).get();
	}
	
	public void delete(int id) {
		
		booksRepository.deleteById(id);
		
	}
	public void saveOrUpdate(Books books) {
		
		booksRepository.save(books);	
	}
	
	public void update(Books books) {
		
		booksRepository.save(books);
		
	}
	


}
