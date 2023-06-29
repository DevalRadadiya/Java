import java.util.Random;
import java.util.Scanner;
class Game
{
	public static void main(String[] str)
	{
		int computerInput;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 0 for Rock, 1 for paper, 2 for Scissor");
		int userInput=sc.nextInt();
		
		Random random=new Random();
		computerInput=random.nextInt();
		
		if(userInput==computerInput)
		{
			System.out.println("Draw");
		}
		else if(userInput==0 && computerInput==2 || userInput==1 && computerInput==0 
				|| userInput==2 && computerInput==1)
		{
			System.out.println("You Win");
		}
		else
		{
			System.out.println("Computer Win");
		}
		System.out.println("Computer Choice : "+computerInput);
		if(computerInput==0)
		{
				System.out.println("Computer Choice : Rock");
		}
		else if(computerInput==1)
		{
				System.out.println("Computer Choice : Paper");
		}
		else if(computerInput==2)
		{
				System.out.println("Computer Choice : Scissors");	
		}
	}
}