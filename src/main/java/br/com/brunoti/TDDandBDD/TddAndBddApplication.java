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
		int valueA = 10;
		int valueB = 5;
		String expression = "1+2+3";
		
		Calculator calculator = new Calculator();

		System.out.println(calculator.sum(valueA, valueB));
		System.out.println(calculator.minus(valueA, valueB));
		System.out.println(calculator.multiply(valueA, valueB));
		System.out.println(calculator.division(valueA, valueB));
		System.out.println(calculator.evaluate(expression));
	}

}