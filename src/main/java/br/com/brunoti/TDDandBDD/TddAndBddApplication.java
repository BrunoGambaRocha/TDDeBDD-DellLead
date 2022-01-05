package br.com.brunoti.TDDandBDD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TddAndBddApplication {

	public static void main(String[] args) {

		SpringApplication.run(TddAndBddApplication.class, args);

		resultCalculator();
	}

	public static void resultCalculator() {
		int i = 10;
		int j = 5;
		
		Calculator calculator = new Calculator();

		System.out.println(calculator.evaluate("1+2+3"));
		System.out.println(calculator.sum(i, j));
		System.out.println(calculator.minus(i, j));
		System.out.println(calculator.multiply(i, j));
		System.out.println(calculator.division(i, j));
	}

}