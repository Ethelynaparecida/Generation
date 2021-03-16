package com.helloworld.hello.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class controller {
@GetMapping("/hello")
public String sayHello()
{
	return "Para essa atividade utilizei a mentalidade de persistencia e a habilidade de atenção aos detalhes";
	}
}
