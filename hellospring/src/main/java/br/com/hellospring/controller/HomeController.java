package br.com.hellospring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller-> Possui o mesmo comportamento que a servlet, conectando o cliente ao servidor.
@RestController//Rest -> Abstrai algumas annotations auxiliares para exibição de informações na tela.

 
public class HomeController {
		
	@RequestMapping("/")//Mapeia o endpoint (identificação de funcionalidade na url)que será usada na aplicação.
	//@ResponseBody -> Usado em conjunto com @Controller para exibição de informações da tela.
	
	public String homeMessage() {
		return "Hello World";
	}
	
	
	
}
