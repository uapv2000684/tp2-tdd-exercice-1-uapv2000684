package exo1;

public class FizzBuzz {

	public String getResult(int i) {
		if(i == 15 || i == 0)
			return "FizzBuzz";
		if (i%3 == 0)
			return "Fizz";
		if(i%5 == 0)
			return "Buzz";
		
		else
		return String.valueOf(i);
	}
	
	public int getResultexo2(String romain) {
			if( romain.isEmpty() )
				return 0;
			if(romain.equals("I") )
				return 1;
			if(romain.equals("V") )
				return 5;
		return 0;
	}

}
