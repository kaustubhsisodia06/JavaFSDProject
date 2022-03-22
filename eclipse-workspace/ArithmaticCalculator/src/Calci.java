import java.util.Scanner;

public class Calci
{
	public static void main(String[] args) 
		
	{
		Scanner sc=new Scanner(System.in);
	        	int i=sc.nextInt();
				int j=sc.nextInt();
				String ch=sc.next();
				if(ch=="+")
				{
					System.out.println(i+j);
				}
				else if(ch=="-")
				{
					System.out.println(i-j);
					
				}
				else if(ch=="*")
				{
					System.out.println(i*j);
				}
				else
				{
					System.out.println(i/j);
				}
	}

}
