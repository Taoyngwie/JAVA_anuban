import java.util.Scanner;

public class try2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Input something : ");
		try
		{
			int x = sc.nextInt();
			System.out.println(x);
		} catch (Exception e)
		{
			System.out.println("Please enter integer number !!");
		}

	}
}
