package design_principles;


/* This code is for the user interface layer */


import java.util.Scanner;
public class calc_ui {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers for the operands: ");
		int first_operand = sc.nextInt();
		int second_operand = sc.nextInt();
		op_scan obj = new op_scan(first_operand, second_operand);
		System.out.println("You have the following options available: ");
		System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide");
		System.out.println("Choose any option: ");
		int opt = sc.nextInt();
		operation op = new operation();
		obj.result = op.calculate(obj.op1, obj.op2, opt);
		if(obj.result==-1)
			System.out.println("Choose the correct option\n Program Terminated");
		else
			System.out.println("Result is: "+obj.result);
		sc.close();
	}

}

