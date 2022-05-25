import java.util.Scanner;


public class RandomNumberGuesser {

	
	public static void main(String[] args) {
		
		//scanner
		Scanner sc = new Scanner(System.in);
		//attributes
		int randNum;
		int nextGuess;
		char answer;

		
		//initialize rng class
		RNG rng = new RNG();
		
		
		do {
			int highGuess = 100;
			int lowGuess = 0;
			randNum = rng.rand();
			rng.resetCount();
			
			System.out.println("Enter the first guess");
			nextGuess = sc.nextInt();
			
			//checking
			//System.out.println(RNG.inputValidation(nextGuess, lowGuess, highGuess));
			do {
				
				if(nextGuess < randNum) {
					
					if(RNG.inputValidation(nextGuess, lowGuess, highGuess)) {
						
						if(nextGuess <= randNum && (randNum-nextGuess) < (randNum-lowGuess)) {
							
						lowGuess = nextGuess;
						
						}
						
						
					}
					
					System.out.println("number of guess is: " + RNG.getCount());
					System.out.println("Your number is to low, try again.");
					System.out.println("Enter your next guess between " + lowGuess + " and "+ highGuess);
					nextGuess = sc.nextInt();
					
				} else if(nextGuess > randNum){
					
					if(RNG.inputValidation(nextGuess, lowGuess, highGuess)) {
						
						if(nextGuess >= randNum && (nextGuess - randNum) < (highGuess - randNum)) {
							
							highGuess = nextGuess;
						}
						
						
						
					}
					
					//due to input being greater than the randNum
					System.out.println("number of guess is " + RNG.getCount());
					System.out.println("Your guess is to high");
					System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
					nextGuess = sc.nextInt();

					
				}
				
			}while(nextGuess != randNum);
			
			
			System.out.println("Congradulations your have guess was right!");
			System.out.println("Would your like to try again? (y or n)");
			answer = sc.next().charAt(0);
			
			
		}while( answer == 'y' );
		
		
		System.out.println("Thanks for playing");
		
	}
}
