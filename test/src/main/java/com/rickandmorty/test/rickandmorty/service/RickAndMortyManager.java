package com.rickandmorty.test.rickandmorty.service;

import org.springframework.stereotype.Service;

import com.rickandmorty.test.rickandmorty.dto.CharacterApiDto;
import com.rickandmorty.test.rickandmorty.dto.CharacterDto;
import com.rickandmorty.test.rickandmorty.dto.LocationApiDto;

@Service
public interface RickAndMortyManager {
	
	CharacterDto parseApiDataToCharacterDto(CharacterApiDto characterApiDto,LocationApiDto location);

}
