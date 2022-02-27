package com.rickandmorty.test.rickandmorty.serviceImpl;

import org.springframework.stereotype.Service;

import com.rickandmorty.test.rickandmorty.dto.CharacterApiDto;
import com.rickandmorty.test.rickandmorty.dto.CharacterDto;
import com.rickandmorty.test.rickandmorty.dto.LocationApiDto;
import com.rickandmorty.test.rickandmorty.dto.OriginDto;
import com.rickandmorty.test.rickandmorty.service.RickAndMortyManager;

@Service
public class RickAndMortyImpl implements RickAndMortyManager{

	@Override
	public CharacterDto parseApiDataToCharacterDto(CharacterApiDto characterApiDto, LocationApiDto location) {
		// TODO Auto-generated method stub
		CharacterDto character= new CharacterDto();
		OriginDto origin= new OriginDto();
		character.setId(characterApiDto.getId());
		character.setName(characterApiDto.getName());
		character.setSpecies(characterApiDto.getSpecies());
		character.setStatus(characterApiDto.getStatus());
		character.setType(characterApiDto.getType());
		character.setEpisode_count(characterApiDto.getEpisode().size());
		
		origin.setUrl(characterApiDto.getOrigin().getUrl());
		origin.setName(characterApiDto.getOrigin().getName());
		if(location.getName()!=null) {
			origin.setDimension(location.getDimension());
			origin.setResidents(location.getResidents());
		}
		character.setOrigin(origin);
		
		return character;
	}

}
