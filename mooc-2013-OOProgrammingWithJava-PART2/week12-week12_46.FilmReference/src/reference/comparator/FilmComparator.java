/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;
import java.util.*;
import reference.domain.Film;
import reference.domain.Rating;
/**
 *
 * @author Syn
 */
public class FilmComparator implements Comparator<Film>{
    
    private Map<Film, List<Rating>> ratings;
    
    public FilmComparator(Map<Film, List<Rating>> ratings){
        this.ratings = ratings;
    }
    
    public int compare(Film film1, Film film2){
        int average1 = averageRating(this.ratings.get(film1));
        int average2 = averageRating(this.ratings.get(film2));
        
        if(average1 == average2){
            return 0;
        }
        else if(average1 > average2){
            return -1;
        }
        return 1;
    }
    
    public int averageRating(List<Rating> rating){
        int average = 0;
        for(Rating r: rating){
            average += r.getValue();
        }
        return average/rating.size();
    }
}
