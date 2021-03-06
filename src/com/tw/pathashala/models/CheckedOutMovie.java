package com.tw.pathashala.models;

import static com.tw.pathashala.constants.Constants.*;

public class CheckedOutMovie extends RentableItem {
    private Integer rating;
    private String name;
    private String director;
    private Integer year;

    public CheckedOutMovie(String name, String director, Integer year, Integer rating) {
        super(name, director, year);
        this.rating = rating;
        this.name = name;
        this.director = director;
        this.year = year;
    }

    @Override
    public RentableItem checkOut() {
        return null;
    }

    @Override
    public RentableItem returnItem() {
        return new AvailableMovie(name, director, year, rating);
    }

    @Override
    public String getSuccessMessage() {
        return MOVIE_RETURN_SUCCESS_MESSAGE;
    }

    @Override
    public String getFailMessage() {
        return MOVIE_RETURN_FAIL_MESSAGE;
    }

    @Override
    public String toString() {
        return String.format(MOVIE_FORMAT, name, director, year, rating);
    }
}
