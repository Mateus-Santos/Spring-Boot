package com.octopus.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.octopus.dslist.entities.Game;


public interface GameRepository extends JpaRepository<Game, Long> {
	
	
}
