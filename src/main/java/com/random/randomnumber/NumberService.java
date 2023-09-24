package com.random.randomnumber;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.random.randomnumber.dto.NumberDto;
import com.random.randomnumber.entity.NumberEntity;
import com.random.randomnumber.repository.NumberRepository;

@Service
public class NumberService {

	
	@Autowired
	NumberRepository numberRepository;
	
	public Long getNumber(NumberDto numberDto) throws RuntimeException{
			Random random = new Random();
			int min = (int) Math.pow(10, numberDto.number() - 1);
			int max = (int) Math.pow(10, numberDto.number()) - 1;  
			Long numeroAleatorio = random.nextLong(max - min + 1) + min;
			for (int i = 0; i < 999; i++) {
				if (numberRepository.findByNumber(numeroAleatorio) != null) {
					numeroAleatorio = random.nextLong(max - min + 1) + min;
				} else {
					break;
				}
			}
			var numberRandom = new NumberEntity(numeroAleatorio);
			numberRepository.save(numberRandom);
			return numeroAleatorio;
		
	}
}
