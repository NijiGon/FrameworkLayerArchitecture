package LatihanQuiz2.Proxy.proxy;

import LatihanQuiz2.Proxy.model.Movie;

import java.util.HashMap;

public class MovieProxy implements IDisplayable {
    HashMap<String, Movie> database;
    public MovieProxy(){
        database = new HashMap<>();
        database.put("avengars", new Movie("Avengars", "is an American superhero film"));
        database.put("tem and jorry", new Movie("Tem & Jorry", "is an American cartoon film about a cat and a mouse"));
        database.put("crayon sinchon", new Movie("Crayon Sinchon", "is a popular cartoon from Japan also called anime, is about a 5 year old kid"));
    }
    @Override
    public void display(String title){
        title = title.toLowerCase();
        if(database.containsKey(title)){
            Movie movie = database.get(title);
            System.out.println("Movie Name: " + movie.getName());
            System.out.println("Movie Description: " + movie.getDescription());
        }
        else{
            System.out.println("movie not found!");
        }
    }
}
