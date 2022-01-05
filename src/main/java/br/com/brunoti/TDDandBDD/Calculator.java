package br.com.brunoti.TDDandBDD;

public class Calculator {

	public int evaluate(String expression) {
		int sum = 0;

		for (String summand : expression.split("\\+"))
			sum += Integer.valueOf(summand);

        return sum;
	}

    public int sum(int i, int j) {
        return i + j;
    }

    public int minus(int i, int j) {
        return i - j;
    }

    public int multiply(int i, int j) {
        return i * j;
    }

    public int division(int i, int j) {
        return i / j;
    }
	
}