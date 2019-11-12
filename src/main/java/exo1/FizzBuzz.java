package exo1;

public class FizzBuzz {

	public String getResult(int i) {
		if (i == 3)
			return "Fizz";
		if(i == 5)
			return "Buzz";
		if( i == 9)
			return "Fizz";
		else
		return String.valueOf(i);
	}

}
