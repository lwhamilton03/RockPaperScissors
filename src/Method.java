
import java.util.Random;
import java.util.Scanner;

public class Method {
 	
	Scanner scan = new Scanner(System.in); //SCANNER NEEDS FIXING 
	Random rand = new Random(); 
	
	public void game(int num) 
	{
		
		int total = 0; 
		int winComputer = 0; 
		int ties = 0; 
		int winHuman = 0; 
		int rock = 0; 
		int scissors = 0; 
		int paper = 0;
		
		
		System.out.println("Are you ready to play?");
		
		for(int i = 0; i < num; i++)
		{
			
			System.out.println("Go again... 3...2...1...");
			Integer computer = rand.nextInt(3) + 1;
			
			//System.out.println(computer);
			//System.out.println(i);
			
			//System.out.println(computer);
			
			String play = scan.nextLine(); 
			
			if (play.equals("quit")) 
			{
				System.out.println("You have  quit the game");
				System.out.println("Total Number of games = " + total);
				System.out.println("Total Number of Human Wins = " + winHuman);     //Add percentages
				System.out.println("Total Number of Computer Wins = " + winComputer);
				System.out.println("Total Number of Ties = " + ties);
				System.out.println("Total Number of Rocks = " + rock);
				System.out.println("Total Number of Scissors = " + scissors);
				System.out.println("Total Number of Paper = " + paper);
				
				break;
			}
			
			else if (play.equals("rock") && computer.equals(1))//rock v rock
			{
				System.out.println("Human: Rock, Computer: Rock, It's a tie!!");
				ties = ties + 1; 
				total = total + 1;
				rock = rock + 2;
			}
			
			else if (play.equals("scissors") && computer.equals(2)) //scissors v s 
			{
				System.out.println("Human: Scissors, Computer: Scissors, It's a tie!!");
				ties = ties + 1; 
				total = total + 1;
				scissors = scissors + 2; 
			}
			
			else if (play.equals("paper") && computer.equals(3)) //paper v paper
			{
				System.out.println("Human: Paper, Computer: Paper, It's a tie!!");
				ties = ties + 1; 
				total = total + 1; 
				paper = paper + 2; 
			}
			
			else if (play.equals("rock") && computer.equals(2))
			{
				System.out.println("Human: Rock, Computer: Scissors, Human WINS!");
				winHuman = winHuman + 1; 
				total = total + 1; 
				rock++; 
				scissors++; 
			}
			
			else if (play.equals("rock")&& computer.equals(3))
			{
				System.out.println("Human: Rock Computer: Paper, Computer WINS!");
				winComputer = winComputer + 1; 
				total = total + 1; 
				rock++; 
				paper++; 
			}
			else if (play.equals("scissors")&& computer.equals(1))
			{
				System.out.println("Human: Scissors, Computer: Rock, Computer WINS!");
				winComputer = winComputer + 1; 
				total = total + 1;
				rock++; 
				scissors++; 
			}
			
			else if (play.equals("scissors") && computer.equals(3))
			{
				System.out.println("Human: Scissors, Computer: Paper, Human WINS!");
				winHuman = winHuman + 1; 
				total = total + 1; 
				scissors++; 
				paper++; 
			}
			
			else if (play.equals("paper") && computer.equals(1))
			{
				System.out.println("Human: Paper, Computer: Rock, Computer WINS!");
				winHuman = winHuman + 1; 
				total = total + 1;
				paper++; 
				rock++; 
			}
			
			else if (play.equals("paper") && computer.equals(2))
			{
				System.out.println("Human: Paper, Computer: Scissors, Human WINS!");
				winHuman = winHuman + 1; 
				total = total + 1;
				paper++; 
				scissors++; 
			}
			
		}
		
		System.out.println(num + " games played! Here are the results!");
		System.out.println("Total Number of games = " + total);
		System.out.println("Total Number of Human Wins = " + winHuman);     //Add percentages
		System.out.println("Total Number of Computer Wins = " + winComputer);
		System.out.println("Total Number of Ties = " + ties);
		System.out.println("Total Number of Rocks = " + rock);
		System.out.println("Total Number of Scissors = " + scissors);
		System.out.println("Total Number of Paper = " + paper);
		
	
	}

	}
	 

	










