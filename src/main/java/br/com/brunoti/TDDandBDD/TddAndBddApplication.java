package br.com.brunoti.TDDandBDD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TddAndBddApplication {

	public static void main(String[] args) {

		SpringApplication.run(TddAndBddApplication.class, args);

		//Calculator.resultCalculator();
		Authentication.login("bruno@brunoti.com.br", "trocar#12345");
	}

}