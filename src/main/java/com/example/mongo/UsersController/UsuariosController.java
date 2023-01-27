package com.example.mongo.UsersController;

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

import com.example.mongo.UsersRepository.UsuarioRepository;

import com.example.mongo.usersDocuments.Usuarios;


@RestController
@RequestMapping("/users")
public class UsuariosController {
	@Autowired
	private UsuarioRepository usarioRepo;
	@PostMapping
	public ResponseEntity<?> saveUser(@RequestBody Usuarios usuario){
		try {
			Usuarios usersave = usarioRepo.save(usuario);
			return new ResponseEntity<Usuarios>(usersave, HttpStatus.CREATED);
		} catch (Exception e){
			return new ResponseEntity<String>(e.getCause().toString(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping
	public ResponseEntity<?> findAllUsers(){
		try {
			List<Usuarios> datausers = usarioRepo.findAll();
			return new ResponseEntity<List<Usuarios>>(datausers, HttpStatus.OK);
		} catch (Exception e){
			return new ResponseEntity<String>(e.getCause().toString(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@PutMapping
	public ResponseEntity<?> updateUser(@RequestBody Usuarios usuario){
		try {
			Usuarios usersave = usarioRepo.save(usuario);
			return new ResponseEntity<Usuarios>(usersave, HttpStatus.CREATED);
		} catch (Exception e){
			return new ResponseEntity<String>(e.getCause().toString(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> DeleteUser(@PathVariable("id") Integer id){
		try {
			usarioRepo.deleteById(id);
			return new ResponseEntity<String>("Usuario Eliminado", HttpStatus.OK);
		} catch (Exception e){
			return new ResponseEntity<String>(e.getCause().toString(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

	
	


}
