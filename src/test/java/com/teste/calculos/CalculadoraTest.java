package com.teste.calculos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	@DisplayName (" Teste 5 + 5 = 10")
	void testSum() {

		Calculadora calc = new Calculadora();
		double valor1 = 5D;
		double valor2 = 5D;
		double esperado = 10D;

		double resultado = calc.sum(valor1, valor2);

		assertEquals(esperado,resultado, " 5 + 5 = 10");

	}
	@Test
	@DisplayName (" Teste 7 - 3 = 4")
	void testSub () {

		Calculadora calc = new Calculadora();
		double valor1 = 7D;
		double valor2 = 3D;
		double esperado = 4D;

		double resultado = calc.sub(valor1, valor2);

		assertEquals(esperado,resultado, " 7 - 3 = 4");
	}
	@Test
	@DisplayName (" Teste 2 * 5 = 10")
	void testMult () {

		Calculadora calc = new Calculadora();
		double valor1 = 2D;
		double valor2 = 5D;
		double esperado = 10D;

		double resultado = calc.mult(valor1, valor2);

		assertEquals(esperado,resultado, " 2 * 5 = 10");
	}
	@Test
	@DisplayName (" Teste 8 / 4 = 2")
	void testDiv () {

		Calculadora calc = new Calculadora();
		double valor1 = 8D;
		double valor2 = 4D;
		double esperado = 2D;

		double resultado = calc.div(valor1, valor2);

		assertEquals(esperado,resultado, " 8 - 4 = 2");
	}

}
