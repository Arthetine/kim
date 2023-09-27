package com.team2.movie.exception;


@SuppressWarnings("serial")
public class MovieIdException extends RuntimeException {

    private String movieId;

    public MovieIdException(String movieId) {  //�깮�꽦�옄
        this.movieId = movieId;
    }

    public String getMovieId() {  //Getter() 硫붿꽌��?
        return movieId;
    }
}