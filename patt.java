import java.util.Scanner;
class patt
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	      	int n = sc.nextInt();
	      	int i,j,k;
	     	for(i=1;i<=n;i++)
	       	{
	           	for(k=i;k<n;k++)
		{
			System.out.print(" ");
		}
		for(j=1;j<=(2*i-1);j++)
		{
		 if(j==1||i==n||j==(2*i-1))
		{
		 	System.out.print("*");
		}
		else
		{
		 	System.out.print(" ");
		}
		}
	                		System.out.println( );
	
		}
	}
}



		