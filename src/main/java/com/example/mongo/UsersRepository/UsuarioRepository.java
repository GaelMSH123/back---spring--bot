package com.example.mongo.UsersRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongo.usersDocuments.Usuarios;

public interface UsuarioRepository extends MongoRepository<Usuarios, Integer>{

}
