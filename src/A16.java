import java.util.Scanner;

public class A16
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input number : ");
		int count = 0;
		int num = sc.nextInt();
		int i = 1;
		while (i <= num)
		{
			if (num % i == 0)
			{
				count++;
			}
			i++;
		}
		if (count == 2)
		{
			System.out.println("Is prime");
		} else
		{
			System.out.println("Is not prime");
		}
	}

}
