import java.util.Scanner ;


public class Test
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter un nombre");
		int t = sc.nextInt();
		sc.close();
		// prime or not 
		for(int i = 2 ; i < t  / 2  ; i++ )
		{
			if(t % i == 0)
			{
				System.out.println("not prime");
				return ;
			}
			
		}
		int flag =0;
		System.out.println("prime");
		for(int i = 1 ; i < t ; i++)
		{
			flag = 0;
			for(int j = 2 ; j < i ; j++)
			{
				if(i % j == 0 && flag ==0 )
					flag = 1;
			}
			if(flag == 0)
			{
				System.out.println(i);
			}
		}

	}
}
