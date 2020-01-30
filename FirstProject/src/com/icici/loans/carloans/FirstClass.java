package com.icici.loans.carloans;

public class FirstClass 
{
	int a=10,b=20,c;  // properties
	
	public void add()
	{
		c=a+b;
		System.out.println("Addition of A & B is : " + c);
	}
	
	public void sub()
	{
		c=a-b;
		System.out.println("sub of A & B is : " + c);
	}
	

	public static void main(String[] args) 
	{
		FirstClass obj = new FirstClass();
		obj.add();
		obj.sub();
		
		FirstClass f1=new FirstClass();
		f1.add();
		f1.sub();
		
	}

}
