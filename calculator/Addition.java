package calculator;

public class Addition {
	private int number1,number2;
	
	Addition(){} //Empty default constructor
	
	Addition(int number1, int number2){
		this.number1=number1;
		this.number2=number2;
	}
	
	int add(){
		return number1+number2;
	}
}