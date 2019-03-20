package calculator;

import java.util.Scanner;

public class Calculator {
	static int value1,value2;
	static Scanner sc;
	public static void main(String args[]){
		
		int option;
		
		additionTestCases();
		multiplicationTestCases();
		divisionTestCases();
		
		
	}
	static void getInput(){
		System.out.println("Enter two values to perform operation");
		value1=sc.nextInt();
		value2=sc.nextInt();
	}
	
	static void additionTestCases(){
		//Case 1:
		Addition addition=new Addition(0,0);
		if(addition.add()==0)
			System.out.println("Correct output for "+0+" and "+0);
		else
			System.out.println("Wrong output for "+0+" and "+0);
		
		//case 2
		addition=new Addition(-3,2);
		if(addition.add()==-1)
			System.out.println("Correct output for "+(-3)+" and "+2);
		else
			System.out.println("Wrong output for "+(-3)+" and "+2);
		
		//case 3
		addition=new Addition(5,2);
		if(addition.add()==7)
			System.out.println("Correct output for "+value1+" and "+value2);
		else
			System.out.println("Wrong output for "+value1+" and "+value2);
		
	}
	
	static void multiplicationTestCases(){
		//case 1:
		Multiplication multiplication=new Multiplication(0,0);
		if(multiplication.multiply()==0)
			System.out.println("Correct output for "+0+" and "+0);
		else
			System.out.println("wrong output for "+0+" and "+0);
		
		//case 2
		multiplication=new Multiplication(5,0);
		if(multiplication.multiply()==0)
			System.out.println("Correct output for "+5+" and "+0);
		else
			System.out.println("Wrong output for "+5+" and "+0);
		
		//case 3
		multiplication=new Multiplication(7,3);
		if(multiplication.multiply()==21)
			System.out.println("Correct output for "+7+" and "+3);
		else
			System.out.println("Wrong output for "+7+" and "+3);
	}
	
	static void divisionTestCases(){
		//case 1
		Division division=new Division(5,0);
		try{
			division.divide();
			System.out.println("Wrong output for "+5+" and "+0);
		}
		catch(ArithmeticException e){
			System.out.println("Correct output for "+5+" and "+0);
		}
		
		//case 2
		
		division=new Division(10,5);
		if(division.divide()==2)
			System.out.println("Correct output for "+10+" and "+5);
		else
			System.out.println("Wrong output for "+10+" and "+5);
	}
}