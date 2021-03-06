package com.tw.pathashala.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class AvailableMovieTest {
    @Test
    public void testForBookReturningMovieDetails() {
        RentableItem movie = new AvailableMovie("Inception", "Hari", 2015, 9);

        String movieDetails = movie.toString();
        String expectedMovieDetails = "| Inception                               | Hari                                   | 2015     | 9  |";

        assertEquals(expectedMovieDetails, movieDetails);
    }

    @Test
    public void testForMovieDetailsConsistsDirectorName() {
        RentableItem movie = new AvailableMovie("Inception", "Hari", 2015, 9);

        String movieDetails = movie.toString();
        String director = "Hari";

        assertTrue(movieDetails.contains(director));
    }

    @Test
    public void testForMovieDetailsConsistsMovieName() {
        RentableItem movie = new AvailableMovie("Inception", "Hari", 2015, 9);

        String movieDetails = movie.toString();
        String movieName = "Inception";

        assertTrue(movieDetails.contains(movieName));
    }

    @Test
    public void testForMovieDetailsConsistsReleaseYear() {
        RentableItem movie = new AvailableMovie("Inception", "Hari", 2015, 9);

        String movieDetails = movie.toString();
        Integer year = 2015;

        assertTrue(movieDetails.contains(year.toString()));
    }

    @Test
    public void testForMovieDetailsConsistsMovieRating() {
        RentableItem movie = new AvailableMovie("Inception", "Hari", 2015, 9);

        String movieDetails = movie.toString();
        Integer rating = 9;

        assertTrue(movieDetails.contains(rating.toString()));
    }

    @Test
    public void testForMovieDetailsNotHavingFutureReleaseYear() {
        RentableItem movie = new AvailableMovie("Inception", "Hari", 2015, 9);

        boolean movieYearInFuture = movie.isYearInFuture();
        boolean expectedResult = false;

        assertEquals(expectedResult, movieYearInFuture);
    }

    @Test
    public void testForMovieDetailsHavingFutureDateOfPublication() {
        RentableItem movie = new AvailableMovie("Inception", "Hari", 2016, 9);

        boolean movieYearInFuture = movie.isYearInFuture();
        boolean expectedResult = true;

        assertEquals(expectedResult, movieYearInFuture);
    }

    @Test
    public void shouldReturnCheckedOutBookOnCheckOut() {
        RentableItem movie = new AvailableMovie("Inception", "Hari", 2016, 9);

        RentableItem checkedOutMovie = movie.checkOut();

        assertEquals("com.tw.pathashala.models.CheckedOutMovie", checkedOutMovie.getClass().getName());
    }

    @Test
    public void shouldReturnNullOnReturn() {
        RentableItem movie = new AvailableMovie("Inception", "Hari", 2016, 9);

        RentableItem returnMovie = movie.returnItem();

        assertNull(returnMovie);
    }
}