package com.projectLibrary.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projectLibrary.Model.Library;
import com.projectLibrary.repository.Repository;
import com.projrctLibrary.Exception.InvalidNameException;


@Component
public class Service {

			@Autowired
			Repository repository;

			public Library add(Library library) throws InvalidNameException {
				
				if(library.getBookName().equalsIgnoreCase("modi")) {
					
						throw new InvalidNameException("very dangerous word"+library.getBookName());
					
					}
				
				else {
					System.out.println("continue process");
				}
				
				
				return repository.save(library);
			}
			
			public List<Library> get() {
				return repository.findAll();
			}
			public Optional<Library> getby(long library){
			return  repository.findById(library);
			}  
			public Library del(Library library) {
				repository.delete(library);
				return library;
			}
			public void deleteall() {
				repository.deleteAll();
			}
			public Library up(Library library) {
				return repository.save(library);
			}

		}
			
