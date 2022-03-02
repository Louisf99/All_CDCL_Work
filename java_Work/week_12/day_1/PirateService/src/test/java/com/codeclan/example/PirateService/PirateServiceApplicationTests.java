package com.codeclan.example.PirateService;

import com.codeclan.example.PirateService.Models.Pirate;
import com.codeclan.example.PirateService.Repositories.PirateRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)

@SpringBootTest
class PirateServiceApplicationTests {
	@Autowired
	PirateRepository pirateRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createPirate(){
		Pirate jack = new Pirate("jack", "sparrow", 32);
		pirateRepository.save(jack);
	}
}
