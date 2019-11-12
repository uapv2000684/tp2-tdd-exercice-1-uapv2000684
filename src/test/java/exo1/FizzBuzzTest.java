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
	
}
