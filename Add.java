import java.util.*;

class Add
{
	public static void main(String args[])
	{
		int[] C = new int[1000]; 
		int[] A = new int[1000];
		int[] B = new int[1000];
		System.out.println("Enter set of Number: ");
		Scanner sc =new Scanner(System.in);
		int i, t = sc.nextInt();
		System.out.println("Enter Numbers to be added: ");
		for(i = 0 ; i<t ; i++)
		{		
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
			if(A[i]>=1 && A[i]<=10000 && B[i]>=1 && B[i]<=10000)
			{
				C[i] = A[i]+B[i];
			}
			else
			{
				System.out.println("Enter Number between 1 and 10000");
				i--;
				continue;
			}
		}
		System.out.println("Additions: ");
		for(i = 0 ; i<t; i++)
		{	
			System.out.println(C[i]); 
		}
	}
}