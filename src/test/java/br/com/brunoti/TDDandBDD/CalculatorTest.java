package br.com.brunoti.TDDandBDD;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	int valueA = 10;
	int valueB = 5;

	Calculator calculator = new Calculator();

	@Test
	public void ExpectedSum() throws Exception {
		int sum = calculator.sum(valueA, valueB);

		assertEquals(15, sum);
	}

	@Test
	public void ExpectedMinus() throws Exception {
		int minus = calculator.minus(valueA, valueB);

		assertEquals(5, minus);
	}

	@Test
	public void ExpectedMultiply() {
		int multiply = calculator.multiply(valueA, valueB);

		assertEquals(50, multiply);
	}

	@Test
	public void ExpectedDivision() throws Exception {
		int div = calculator.division(valueA, valueB);

		assertEquals(2, div);
	}

	@Test
	public void evaluatesExpression() throws Exception {
		String expression = "1+2+3";

		int sum = calculator.evaluate(expression);

		assertEquals(6, sum);
	}
	
}