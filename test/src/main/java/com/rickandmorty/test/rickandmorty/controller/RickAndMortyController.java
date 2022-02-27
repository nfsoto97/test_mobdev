package com.rickandmorty.test.rickandmorty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.rickandmorty.test.rickandmorty.dto.CharacterApiDto;
import com.rickandmorty.test.rickandmorty.dto.CharacterDto;
import com.rickandmorty.test.rickandmorty.dto.LocationApiDto;
import com.rickandmorty.test.rickandmorty.service.RickAndMortyManager;
@Service 
@RestController
@RequestMapping("/api")
public class RickAndMortyController {
	@Autowired
	private RickAndMortyManager service;
	
	String url="https://rickandmortyapi.com/api";

	@GetMapping(value="/character/{idCharacter}")
	public ResponseEntity<?> ObtenerCasosEmpresa(@PathVariable("idCharacter") Integer idCharacter){
		try {
			RestTemplate rest=new RestTemplate();
			CharacterApiDto result=rest.getForObject(url+"/character/"+idCharacter,CharacterApiDto.class);
			LocationApiDto resultLocations=new LocationApiDto();
			if(result.getOrigin().getUrl()!="") {
				resultLocations=rest.getForObject(result.getOrigin().getUrl(),LocationApiDto.class);
			}
			CharacterDto character = service.parseApiDataToCharacterDto(result, resultLocations);
			return new ResponseEntity<CharacterDto>(character, HttpStatus.OK);	
		}catch(Exception e){
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}
