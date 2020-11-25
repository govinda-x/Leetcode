import java.util.Scanner;

class Life
{	
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		int[] a = new int[100];
		int i,temp=0;
		System.out.println("Enter Numbers: ");
		for(i = 0 ; i<=100; i++)
		{	
			a[i]= sc.nextInt();
			temp++;	
			if(a[i]==42)
			{	
				break;	
			}		
		}
		for(i=0; i<temp-1;i++)
		{
			System.out.println(a[i]+"\n");		
		}

	}
}