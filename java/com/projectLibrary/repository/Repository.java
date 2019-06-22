package com.projectLibrary.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.projectLibrary.Model.Library;

public interface Repository extends JpaRepository<Library, Long> {

	
	}

