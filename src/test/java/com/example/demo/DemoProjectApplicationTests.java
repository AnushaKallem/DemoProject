package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.controller.HelloController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoProjectApplicationTests {

	
	 @Autowired
	  private HelloController controller;
	 private TestRestTemplate restTemplate;
	 
	@Test
	public void contextLoads() {
		assertThat(controller).isNotNull();
	   
	}
	
	@Test
	public void contextLoads1() {
		assertThat(this.restTemplate.getForObject("http://localhost:" + 8080 + "/",
                String.class)).contains("Welcome back");
	   
	}

}

