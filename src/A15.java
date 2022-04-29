import java.util.Scanner;

public class A15
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input number : ");
		int num = sc.nextInt();
		int sum = 0;
		int i = 1;
		while (i <= num)
		{
			if (num % i == 0)
			{
				sum++;
			}
			i++;
		}
		System.out.println(sum);

	}

}
