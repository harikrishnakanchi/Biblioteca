package com.tw.pathashala.models;

import java.util.Calendar;

import static com.tw.pathashala.constants.Constants.*;

public abstract class Book {
    private String name;
    private String author;
    private Integer yearOfPublication;

    public Book(String name, String author, Integer yearOfPublication) {
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return String.format(FORMAT, name, author, yearOfPublication);
    }

    public boolean isPublicationYearInFuture() {
        Integer year = Calendar.getInstance().get(Calendar.YEAR);
        return year < yearOfPublication;
    }

    public abstract Book checkOut();

    public abstract Book returnBook();

    public boolean isYourName(String name) {
        return this.name.equals(name);
    }

    public Boolean isNull() {
        return false;
    }
}
