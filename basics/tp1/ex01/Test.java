import java.util.Scanner ;

public class Test
{
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner (System.in);
		int[] nums = new int[3];
		for(int i =0 ; i < 3 ; i++)
		{
			System.out.print("Enter an integer: ");
			nums[i] = scanner.nextInt();
		} 
		scanner.close();
		int max = nums[0];
		int min = nums[0];
		for(int i = 1 ; i < 3 ; i++)
		{
			if(nums[i] > max)
				max = nums[i];
			if(nums[i] < min)
				min = nums[i];
		}

		System.out.println("max = " + max + " min = " + min);
	}
}