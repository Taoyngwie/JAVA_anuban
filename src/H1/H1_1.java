package H1;

import java.util.Iterator;
import java.util.Scanner;

public class H1_1
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] x = new int[5];
		for (int i = 0; i < x.length; i++)
		{
			x[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = x.length - 1; i > 0; i--)
		{
			System.out.print(x[i] + (i!=1 ? "," : ""));
		}

	}

}
