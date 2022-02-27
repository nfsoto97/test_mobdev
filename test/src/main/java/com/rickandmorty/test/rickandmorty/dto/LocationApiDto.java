package com.rickandmorty.test.rickandmorty.dto;

import java.util.ArrayList;

public class LocationApiDto {
		  private float id;
		  private String name;
		  private String type;
		  private String dimension;
		  ArrayList<String> residents = new ArrayList<String>();
		  
		  
		public float getId() {
			return id;
		}
		public void setId(float id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getDimension() {
			return dimension;
		}
		public void setDimension(String dimension) {
			this.dimension = dimension;
		}
		public ArrayList<String> getResidents() {
			return residents;
		}
		public void setResidents(ArrayList<String> residents) {
			this.residents = residents;
		}
		  
		  
}
