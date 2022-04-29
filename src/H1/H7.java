package H1;

import java.util.Scanner;

public class H7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] x = new int[10];
		for (int i = 0; i < x.length; i++)
		{
			System.out.print("input number : ");
			x[i] = sc.nextInt();
		}

		int sum = 1;
		for (int i = 0; i < x.length; i++)
		{
			sum *= x[i];
		}
		System.out.println(sum);
	}

}
