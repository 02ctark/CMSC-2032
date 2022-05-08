import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Movie m = new Movie();
		
		String input = "";
		
		char hi;
		
		do {
		System.out.println("Enter the title of a movie");
		input = sc.nextLine();
		m.setTitle(input); 
		
		System.out.println("Enter the movie's rating");
		String rating = sc.nextLine();
		m.setRating(rating);
		
		System.out.println("Enter the number of tickets sold at AMC");
		int tick = sc.nextInt();
		m.setSoldTickets(tick);
		
		//print out to string
		System.out.println(m.toString());
		
		
		System.out.println("Do you want to enter another set of data");
		hi = sc.next().toLowerCase().charAt(0);
		sc.nextLine();
		
		}while(hi == 'y');
		
		
		System.out.println("Goodbye");
		
	}

	
}
