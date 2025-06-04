package IO_Operators;

import java.lang.*;
import java.util.*;

class IO_Operations
{
	public static void main(String[] arg)
	{
		Scanner s = new Scanner(System.in);

		String operation;
		int a, b, c;
		
		operation = s.nextLine();
		a = s.nextInt();
		b = s.nextInt();

		c = a+b;
		System.out.println(operation + " gives " + c);
	}
}