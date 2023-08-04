package com.octopus.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.octopus.dslist.dto.GameMinDTO;
import com.octopus.dslist.entities.Game;
import com.octopus.dslist.repositories.GameRepository;

//Anotacao sobre ser um componente do sistema.
@Component 
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll()	{
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
