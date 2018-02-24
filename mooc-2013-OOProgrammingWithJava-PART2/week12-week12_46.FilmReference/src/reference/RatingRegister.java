/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;
import java.util.*;
import reference.domain.Film;
import reference.domain.Rating;
import reference.domain.Person;
/**
 *
 * @author Syn
 */
public class RatingRegister {
    
    private Map<Film, List<Rating>> ratings;
    private Map<Person, Map<Film, Rating>> personalRatings;
    
    public RatingRegister(){
        this.ratings = new HashMap<Film, List<Rating>>();
        this.personalRatings = new HashMap<Person, Map<Film, Rating>>();
    }
    
    public void addRating(Film film, Rating rating){
        if(!this.ratings.containsKey(film)){
            List<Rating> filmRating = new ArrayList<Rating>();
            filmRating.add(rating);
            this.ratings.put(film, filmRating);
        }
        else{
            List<Rating> filmRating = this.ratings.get(film);
            filmRating.add(rating);
            this.ratings.put(film, filmRating);
        }
    }
    
    public List<Rating> getRatings(Film film){
        return this.ratings.get(film);
    }
    
    public Map<Film, List<Rating>> filmRatings(){
        return this.ratings;
    }
    
    public void addRating(Person person, Film film, Rating rating){
        if(!this.personalRatings.containsKey(person)){
            Map<Film, Rating> pRating = new HashMap<Film, Rating>();
            pRating.put(film, rating);
            this.personalRatings.put(person, pRating);
        }
        else{
            Map<Film, Rating> pRating = this.personalRatings.get(person);
            pRating.put(film, rating);
            this.personalRatings.put(person, pRating);
        }
        addRating(film, rating);
    }
    
    public Rating getRating(Person person, Film film){
        Map<Film, Rating> pRating = this.personalRatings.get(person);
        if(!pRating.containsKey(film)){
            return Rating.NOT_WATCHED;
        }
        else{
            return pRating.get(film);
        }
    }
    
    public Map<Film, Rating> getPersonalRatings(Person person){
        if(this.personalRatings.get(person) == null){
            return Collections.emptyMap();
        }
        return this.personalRatings.get(person);
    }
    
    public List<Person> reviewers(){
        List<Person> reviewers = new ArrayList<Person>();
        for(Person key : this.personalRatings.keySet()){
            reviewers.add(key);
        }
        return reviewers;
    }
}
