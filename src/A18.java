
public class A18
{
	public static void main(String[] args)
	{
		int Count_prime = 0;
		int i = 0;
		while (Count_prime <= 99)
		{
			int count = 0;
			int j = 1;
			while (j <= i + 1)
			{
				if (i % j == 0)
				{
					count++;
				}
				j++;
			}
			if (count == 2)
			{
				System.out.println(i);
				Count_prime++;

			}
			i++;
		}
	}

}
