package calculator;

public class Division {
	private int dividend,divisor;
	Division(){} //Empty default constructor
	
	Division(int dividend, int divisor){
		this.dividend=dividend;
		this.divisor=divisor;
	}
	
	int divide() throws ArithmeticException {
		return dividend/divisor; //If the divisor is zero, it will implicitly raise exception
	}
}