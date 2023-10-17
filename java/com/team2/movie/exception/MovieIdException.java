package com.team2.movie.exception;


@SuppressWarnings("serial")
public class MovieIdException extends RuntimeException {

    private String movieId;

    public MovieIdException(String movieId) {  //예외 처리
        this.movieId = movieId;
    }

    public String getMovieId() {  //Getter()  예외
        return movieId;
    }
}