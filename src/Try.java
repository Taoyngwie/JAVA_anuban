import java.util.Scanner;

public class Try 
{
	public static void main(String[] args)
	{
		final int maxarry = 6;
		Scanner Sc = new Scanner(System.in);
		int[] KeepArray = new int[maxarry];
		for (int i = 1; i < maxarry; i = i + 1)
		{
			try
			{

				System.out.print("|�ô��͹������ | " + "\n��سһ�͹�����Ū�Դ����Ţ : ");
				int x = Sc.nextInt();
				KeepArray[i] = x;
			} catch (Exception e)
			{
				System.out.println("\n ���˹���աٺ͡����֧��������� !!");
				break;

			}
		}
		
		for (int j = 1; j < maxarry; j++)
		{
			System.out.println("������: "+KeepArray[j]);
		}
	}
}
