 package com.projectLibrary.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectLibrary.Model.Library;
import com.projectLibrary.service.Service;
import com.projrctLibrary.Exception.InvalidNameException;

@RestController
@RequestMapping("projectLibrary")
public class Controller {

	
	

		@Autowired
		
		Service service;
		
		@PostMapping("add")
		private Library insert(@RequestBody Library library) throws InvalidNameException {
			return service.add(library);
		}
		
		@GetMapping("getall")
		private List<Library> getall(){
			return service.get();
		}
		@GetMapping("getbyid/{id}")
		private Optional<Library> getbyid(@PathVariable long id){
			return service.getby(id);
		}
		@DeleteMapping("delete/{id}")
		private Library delete(@PathVariable long id, Library library) {
			return service.del(library);
		}
		@DeleteMapping("deleteall")
		private void deleteall() {
			service.deleteall();
		}
		@PutMapping("update/{id}")
		private Library update(@PathVariable long id, @RequestBody Library library) {
		
			return service.up(library);
		}

	}

		
