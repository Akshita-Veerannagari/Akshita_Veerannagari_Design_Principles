package design_principles;

/* This code is the Business Logic Layer */

public class operation {
	int calculate(int a, int b, int c)
	{
		switch(c)
		{
			case 1: return a+b;
			case 2: return a-b;
			case 3: return a*b;
			case 4: return a/b;
			default : return -1;
		}
	}
}
