import java.util.Scanner;
public class MovieDriver_Task1 {
	public static void main(String[] args)
	{
		Scanner keyboard1 = new Scanner (System.in);
		Scanner keyboard2 = new Scanner (System.in);
		Scanner keyboard3 = new Scanner (System.in);
		Movie movie = new Movie();
		System.out.println("Please enter a movie title: ");
		String title = keyboard1.nextLine();
		movie.setTitle(title);
		System.out.println("Please enter the movie's rating: ");
		String rating = keyboard2.nextLine();
		movie.setRating(rating);
		System.out.print("Please enter the tickets sold for this movie at the theater: ");
		int soldTickets = keyboard3.nextInt();
		movie.setSoldTickets(soldTickets);
		System.out.println(movie.toString());
		
		
		
		
	}

}
