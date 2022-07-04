import java.util.Scanner;
public class MovieDriver {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner (System.in);
		String yesORno, title, rating;
		int soldTickets;
		do
		{
		Movie movie = new Movie();
		System.out.println("Please enter a movie title: ");
		title = keyboard.nextLine();
		movie.setTitle(title);
		System.out.println("Please enter the movie's rating: ");
		rating = keyboard.nextLine();
		movie.setRating(rating);
		System.out.print("Please enter the tickets sold for this movie at the theater: ");
		soldTickets = keyboard.nextInt();
		movie.setSoldTickets(soldTickets);
		System.out.println(movie.toString());
		System.out.println("Please enter 'yes' if you would like to repeat this program, \n"
				+ "and anything else to terminate it: ");
		yesORno=keyboard.next();
		keyboard.nextLine();
		}while(yesORno.equals("yes"));
		
		
		
		
	}

}
