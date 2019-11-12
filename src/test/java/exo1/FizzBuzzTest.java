package exo1;


import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@Test
	void doitRetourner1AvecEntree1() {
//		fail("Not yet implemented");
		FizzBuzz fizzbuzz=new FizzBuzz();
		assertTrue(fizzbuzz.getResult(1)=="1");
	}

}
