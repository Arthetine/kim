package com.team2.movie.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.team2.movie.DTO.MovieDTO;

public interface MovieService {
	
	public List<MovieDTO> getMovieList();
	
	List<MovieDTO> getRankList();
	
	List<MovieDTO> getAllMovieList();
	
	List<MovieDTO> getMovieListByCategory(String category);	
	
	List<MovieDTO> getMovieListByFilter(Map<String, List<String>> filter);		
	 
	List<MovieDTO> getMovieById(String MovieId);
	
	List<MovieDTO> setNewMovie(MovieDTO movieDTO);
	
	List<MovieDTO> setUpdateMovie(MovieDTO movieDTO);
	
	List<MovieDTO> setDeleteMovie(String movieID);

	List<MovieDTO> getScreeningList();

}