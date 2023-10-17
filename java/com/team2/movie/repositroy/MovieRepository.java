package com.team2.movie.repositroy;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.office.library.MovieDTO;

@Repository
public interface MovieRepository {

	List<MovieDTO> getRankList();

	List<MovieDTO> getMovieListByCategory(String category);

	List<MovieDTO> getMovieListByFilter(Map<String, List<String>> filter);

	MovieDTO getMoiveById(String movie);

	void setUpdateMovie(MovieDTO movie);

	void setDeleteMovie(String movieID);

}