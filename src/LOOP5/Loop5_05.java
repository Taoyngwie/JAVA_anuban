package LOOP5;

public class Loop5_05
{
	public static void main(String[] args)
	{
		int n = 2;
		while (n <= 100)
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
			}
			n++;

		}

	}

}
