package newPackage;
import newPackage.MovieTitleGenerator;
public class MovieTitleApp {
	public static void main(String[] args)
	{
		MovieTitleGenerator movieName = new MovieTitleGenerator();
		System.out.println("Your new movie title is : \t"+movieName.getMovTitle());
	}
}