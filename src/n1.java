import java.util.Scanner;
// input String and tranfers to charecter and next to reverse.
public class n1
{
	public static void main(String[] args)
	{
		Scanner n = new Scanner(System.in);
		String getN = n.nextLine();
		
		String [] a1 = getN.toCharArray();
	
		System.out.println("before reverse");
		for (int i = 0; i < a1.length; i++)
		{
			System.out.print(a1[i] + "");
		}
		System.out.println();

		System.out.println("after reverse");
		for (int i = a1.length-1; i > -1; i--)
		{
			System.out.print(a1[i] + "");
		}

	}

}
