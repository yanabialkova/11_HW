package ru.netology.movie;

public class MovieManager {

    private int range;
    public MovieManager() {
        range = 10;
    }

    public MovieManager(int range) {
        this.range = range;
    }

    private String[] movies = new String[0];

    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {

        int resultLength;
        if (movies.length < range) {
            resultLength = movies.length;
        } else {
            resultLength = range;
        }

        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}
