package exo1;

public class FizzBuzz {

	public String getResult(int i) {
		if(i%3 == 0 || i%15 == 0)
			return "FizzBuzz";
		if (i%3 == 0)
			return "Fizz";
		if(i%5 == 0)
			return "Buzz";
		
		else
		return String.valueOf(i);
	}

}
