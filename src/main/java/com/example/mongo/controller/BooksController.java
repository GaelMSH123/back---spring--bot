package com.example.mongo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongo.documentos.books;
import com.example.mongo.repository.BooksRepository;

@RestController
@RequestMapping("/books")
public class BooksController {
	
	@Autowired
	private BooksRepository bookRepo;
	@PostMapping
	public ResponseEntity<?> saveBook(@RequestBody books book){
		try {
			books booksave = bookRepo.save(book);
			return new ResponseEntity<books>(booksave, HttpStatus.CREATED);
		} catch (Exception e){
			return new ResponseEntity<String>(e.getCause().toString(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping
	public ResponseEntity<?> findAllBooks(){
		try {
			List<books> databooks = bookRepo.findAll();
			return new ResponseEntity<List<books>>(databooks, HttpStatus.OK);
		} catch (Exception e){
			return new ResponseEntity<String>(e.getCause().toString(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping
	public ResponseEntity<?> updateBook(@RequestBody books book){
		try {
			books booksave = bookRepo.save(book);
			return new ResponseEntity<books>(booksave, HttpStatus.CREATED);
		} catch (Exception e){
			return new ResponseEntity<String>(e.getCause().toString(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> DeleteBook(@PathVariable("id") Integer id){
		try {
			
			bookRepo.deleteById(id);
			return new ResponseEntity<String>("Libro Eliminado", HttpStatus.OK);
		} catch (Exception e){
			return new ResponseEntity<String>(e.getCause().toString(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
}
