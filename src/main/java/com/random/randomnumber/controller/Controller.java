package com.random.randomnumber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.random.randomnumber.NumberService;
import com.random.randomnumber.dto.NumberDto;


@RestController
@RequestMapping("/")
public class Controller {
	
	@Autowired
	NumberService numberService;

	@GetMapping
	public ModelAndView getIndex() {
		var modelAndView = new ModelAndView("index");
		return modelAndView;
	}
	
	
	@PostMapping("/number")
	public Long getRandom(@RequestBody NumberDto numberDto) {
		try {
			var numeroAleatorio = numberService.getNumber(numberDto);
			return numeroAleatorio;
		} catch (RuntimeException e) {
			System.out.println("Change Decimal Numbers");
			return null;
		}
		
	}
	
	
}
