package com.team2.movie.repositroy;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.github.mustachejava.Code;
import com.team2.movie.DTO.MovieDTO;

@Repository
public interface MovieRepository  {
	
    List<MovieDTO> getAllMovieList();	

    boolean existsByRating(Code rating);

    void deleteByMovieId(Long movieId);
    
    List<MovieDTO> getRankList();    
    List<MovieDTO> getMovieListByCategory(String category);
    List<MovieDTO> getMovieListByFilter(Map<String, List<String>> filter);
    MovieDTO getBookById(String movie);
    void setUpdateMovie(MovieDTO movie);
    void setDeleteMovie(String movieID);      
    
}
