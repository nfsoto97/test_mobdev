package com.rickandmorty.test.rickandmorty.dto;

import java.util.ArrayList;


public class CharacterApiDto {
		  private Integer id;
		  private String name;
		  private String status;
		  private String species;
		  private String type;
		  private OriginApiDto origin;
		  private ArrayList<Object> episode = new ArrayList<Object>();
		  
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getSpecies() {
			return species;
		}
		public void setSpecies(String species) {
			this.species = species;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public OriginApiDto getOrigin() {
			return origin;
		}
		public void setOrigin(OriginApiDto origin) {
			this.origin = origin;
		}
		public ArrayList<Object> getEpisode() {
			return episode;
		}
		public void setEpisode(ArrayList<Object> episode) {
			this.episode = episode;
		}
		  
		  
		  
		}
