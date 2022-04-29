
public class A17
{
	public static void main(String[] args)
	{
		int i = 1;
		while (i <= 99)
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
			}
			i++;
		}
	}

}
