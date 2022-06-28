package ru.netology.movie;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MovieTest {

    @Test
    public void addMovie() {
        MovieManager film = new MovieManager();

        film.add("First");
        film.add("Second");
        film.add("Third");

        String[] expected = {"First", "Second", "Third"};
        String[] actual = film.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowNumberOfMovie() {
        MovieManager film = new MovieManager(3);

        film.add("First");
        film.add("Second");
        film.add("Third");

        String[] expected = {"Third", "Second", "First"};
        String[] actual = film.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowNumberOfMovieMore_10() {
        MovieManager film = new MovieManager(11);

        film.add("First");
        film.add("Second");
        film.add("Third");
        film.add("Fourth");
        film.add("Fifth");
        film.add("Sixth");
        film.add("Seventh");
        film.add("Eighth");
        film.add("Nineth");
        film.add("Tenth");
        film.add("Eleventh");

        String[] expected = {"Eleventh","Tenth", "Nineth", "Eighth", "Seventh", "Sixth", "Fifth", "Fourth",
                "Third", "Second", "First"};
        String[] actual = film.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowNumberOfMovieWithoutRange() {
        MovieManager film = new MovieManager();

        film.add("First");
        film.add("Second");
        film.add("Third");
        film.add("Fourth");


        String[] expected = {"Fourth", "Third", "Second", "First"};
        String[] actual = film.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
