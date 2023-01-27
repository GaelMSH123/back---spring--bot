package com.example.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongo.documentos.books;

public interface BooksRepository extends MongoRepository<books, Integer> {

}
