package Week3.MovieCollection;

import java.util.ArrayList;
import java.util.List;

public class Movies {

    private String name;
    private int releaseYear;
    private String genre;
    private double imdbRating;

    public Movies(String name, int releaseYear, String genre, double imdbRating){
        this.name = name;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.imdbRating = imdbRating;
    }

    public double getImdbRating(){
        return imdbRating;
    }

    public int getReleaseYear(){
        return releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public static List<Movies> filterByGenre (List<Movies> movies, String genreToFilter){
        List<Movies> filteredMovies = new ArrayList<>();
        for(Movies m : movies){
            if(genreToFilter.equals(m.getGenre())){
                filteredMovies.add(m);
            }
        }
        return filteredMovies;

    }

    @Override
    public String toString() {
        return name + " - " + releaseYear + " - " + genre + " - " + imdbRating;
    }
}
