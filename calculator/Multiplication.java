package calculator;

public class Multiplication {
	private int number1,number2;
	
	Multiplication(){} //Empty default constructor
	
	Multiplication(int number1, int number2){
		this.number1=number1;
		this.number2=number2;
	}
	
	int multiply(){
		return number1*number2;
	}
}