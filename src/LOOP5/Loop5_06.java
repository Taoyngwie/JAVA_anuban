package LOOP5;

public class Loop5_06
{
	public static void main(String[] args)
	{
		int prime_count = 0;
		int n = 2;
		while (prime_count < 100)
		{
			int count = 0;
			int i = 2;
			while (i < n)
			{
				if (n % i == 0)
				{
					count++;
					break;
				}
				i++;
			}
			if (count == 0)
			{
				System.out.println(n);
				prime_count++;
			}
			n++;

		}

	}

}
