/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syn
 */
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class RingingCentre {
 
    private Map<Bird, List<String>> observationLocations;
 
    public RingingCentre() {
        observationLocations = new HashMap<Bird, List<String>>();
    }
 
    public void observe(Bird bird, String location) {
        if (!observationLocations.containsKey(bird)) {
            observationLocations.put(bird, new ArrayList<String>());
        }
        observationLocations.get(bird).add(location);
    }
 
    public void observations(Bird bird) {
        if (!observationLocations.containsKey(bird)) {
            System.out.println(bird + " observations: 0");
            return;
        }
 
        System.out.println(bird + " observations: " + observationLocations.get(bird).size());
        for (String location : observationLocations.get(bird)) {
            System.out.println(location);
        }
    }
}
