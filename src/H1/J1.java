package H1;

import java.util.Arrays;
import java.util.Scanner;

public class J1
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] x = new int[10];
		for (int i = 0; i < x.length; i++)
		{
			System.out.println("Please input number : ");
			x[i] = sc.nextInt();
		}

		for (int j = 0; j < x.length; j++)
		{
			for (int i = 0; i < x.length - 1 - j; i++)
			{
				if (x[i] < x[i + 1])
				{
					int t = x[i];
					x[i] = x[i + 1];
					x[i + 1] = t;
				}
			}
		}
		
		System.out.print(Arrays.toString(x));

	}

}
