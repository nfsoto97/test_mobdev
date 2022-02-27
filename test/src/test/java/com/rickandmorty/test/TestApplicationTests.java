package com.rickandmorty.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rickandmorty.test.rickandmorty.controller.RickAndMortyController;

@SpringBootTest
class TestApplicationTests {
	@Autowired
	private RickAndMortyController controller;
	@Test
	void contextLoads() throws Exception {
		assertThat(controller).isNotNull();

	}

}
