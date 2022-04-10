import java.util.Scanner;

public class MovieDriver {
	
	
	
	public static void main(String[] args) {
		
		// object of type scanner to read input
		Scanner sc = new Scanner(System.in);
		
		//
		Movie movie = new Movie(); 
		
		// declare char y
		char loop = 'y';
		
		do {
		System.out.println("Enter the title of a movie");
		String movieInput = sc.nextLine();
		movie.setTitle(movieInput);
		
	
		System.out.println("Enter the movie's rating");
		String movieRate = sc.nextLine();
		movie.setRating(movieRate);
		
		System.out.println("Enter the number of tickets sold");
		int ticketSold = sc.nextInt();
		movie.setSoldTickets(ticketSold);
		
		System.out.println(movie.toString());
		
		System.err.println("Do you want to enter another Movie: y or n");
		loop = sc.next().charAt(0);
		sc.nextLine();
		
		//while loop if input is y then the loop is true which repeats
		//n is false so so skips
		}while( loop == 'y');
		
		System.out.println("Goodbye");
	}
	
	
	

}
