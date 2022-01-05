package br.com.brunoti.TDDandBDD;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void ExpectedSum() throws Exception {
		int i = 10;
		int j = 5;

		Calculator calculator = new Calculator();

		int sum = calculator.sum(i, j);

		assertEquals(15, sum);
	}

	@Test
	public void ExpectedMinus() throws Exception {
		int i = 10;
		int j = 5;

		Calculator calculator = new Calculator();

		int minus = calculator.minus(i, j);

		assertEquals(5, minus);
	}

	@Test
	public void ExpectedMultiply() {
		int i = 10;
		int j = 5;

		Calculator calculator = new Calculator();

		int multiply = calculator.multiply(i, j);

		assertEquals(50, multiply);
	}

	@Test
	public void ExpectedDivision() throws Exception {
		int i = 10;
		int j = 5;

		Calculator calculator = new Calculator();

		int div = calculator.division(i, j);

		assertEquals(2, div);
	}

	@Test
	public void evaluatesExpression() throws Exception {
		String expression = "1+2+3";

		Calculator calculator = new Calculator();

		int sum = calculator.evaluate(expression);

		assertEquals(6, sum);
	}
	
}