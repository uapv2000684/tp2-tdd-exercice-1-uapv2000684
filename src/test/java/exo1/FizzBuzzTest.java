package exo1;


import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {
	FizzBuzz fizzbuzz=new FizzBuzz();
	
	@Test
	void doitRetourner1AvecEntree1() {
		assertTrue(fizzbuzz.getResult(1).equals("1"));
	}

	@Test
	void doitRetourner1AvecEntree2() {
		assertTrue(fizzbuzz.getResult(2).equals("2"));
	}
	
	@Test
	void doitRetourner1AvecEntree3() {
		assertTrue(fizzbuzz.getResult(3).equals("Fizz"));
	}
	
	@Test
	void doitRetourner1AvecEntree5() {
		assertTrue(fizzbuzz.getResult(5).equals("Buzz"));
	}
	
	@Test
	void doitRetourner1AvecEntree9() {
		assertTrue(fizzbuzz.getResult(9).equals("Fizz"));
	}
	
	@Test
	void doitRetourner1AvecEntree10() {
		assertTrue(fizzbuzz.getResult(10).equals("Buzz"));
	}
	
	@Test
	void doitRetourner1AvecEntree15() {
		assertTrue(fizzbuzz.getResult(15).equals("FizzBuzz"));
	}
	
	@Test
	void doitRetourner1AvecEntree0() {
		assertTrue(fizzbuzz.getResult(0).equals("FizzBuzz"));
	}
	
	void shouldReturn0WhenEmpty() {
		assertTrue(fizzbuzz.getResultexo2("") == 0);
	}
	void shouldReturn1WhenI() {
		assertTrue(fizzbuzz.getResultexo2("I") == 1);
	}
	void shouldReturn5WhenV() {
		assertTrue(fizzbuzz.getResultexo2("V") == 5);
	}
	
}
