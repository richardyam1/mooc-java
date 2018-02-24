/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;
import reference.comparator.FilmComparator;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Syn
 */
public class Reference{
    
    private RatingRegister register;
    
    public Reference(RatingRegister register){
        this.register = register;
    }
    
    public Film recommendFilm(Person person){
        Person person1 = person;
        Person person2 = null;
        int mostSimilar = 0;
        
        Map<Film, List<Rating>> filmRatings = this.register.filmRatings();
        List<Film> films = new ArrayList<Film>();
        for(Film f : filmRatings.keySet()){
            films.add(0, f);
        }
        
        List<Person> reviewers = this.register.reviewers();
        reviewers.remove(person);
    
        Map<Film, Rating> pRating1 = this.register.getPersonalRatings(person);
        if(pRating1.isEmpty()){
            Collections.sort(films, new FilmComparator(filmRatings));
            return films.get(0);
        }
        

        for(Person p : reviewers){
            int similar = 0;
            Map<Film, Rating> temp = this.register.getPersonalRatings(p);
            for(Film f : films){       
                
                if(this.register.getRating(person1, f) != Rating.NOT_WATCHED && this.register.getRating(p, f) != Rating.NOT_WATCHED){
                    int rating1 = pRating1.get(f).getValue();
                    int rating2 = temp.get(f).getValue();
                    similar += (rating1 * rating2);
                }
            }
            if(similar > mostSimilar){
                mostSimilar = similar;
                person2 = p;
            }
        }
        
       Map<Film, Rating>  pRating2 = this.register.getPersonalRatings(person2);
       List<Film> person2Films = new ArrayList<Film>();
       
       for(Film f : pRating2.keySet()){
           if(pRating2.get(f).getValue() >= 1){
                person2Films.add(f);
           }
       }
 
       
       for(Film f : person2Films){
           if(!pRating1.containsKey(f)){
               return f;
           }
       }

   
        return null;

    }
}
