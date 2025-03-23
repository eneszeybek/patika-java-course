package Week3.MovieCollection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Movies> movieList = new ArrayList<>();

        movieList.add(new Movies("The Godfather", 1972, "Crime", 9.2));
        movieList.add(new Movies("The Silence of the Lambs", 1991, "Thriller", 8.6));
        movieList.add(new Movies("Gladiator", 2000, "Action", 8.5));
        movieList.add(new Movies("Batman Begins", 2005, "Action", 8.2));
        movieList.add(new Movies("Groundhog Day", 1993, "Comedy", 8.0));

        movieList.sort(Comparator.comparing(Movies::getImdbRating).reversed());
        System.out.println("IMDb puanına göre sıralama: (Büyükten küçüğe)");
        movieList.forEach(System.out::println);

        movieList.sort(Comparator.comparing(Movies::getReleaseYear));
        System.out.println("\nÇıkış tarihine göre artan sıralama: (Küçükten büyüğe)");
        movieList.forEach(System.out::println);

        String genreToFilter = "Action";
        List<Movies> filteredMovies = Movies.filterByGenre(movieList, genreToFilter);

        System.out.println("\n" + genreToFilter + " türündeki filmler:");
        filteredMovies.forEach(System.out::println);

    }
}
