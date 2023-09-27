package com.team2.movie.Mapper;

import java.util.*;

import com.team2.movie.DTO.MovieDTO;

public interface MovieMapper {
		
		public List<MovieDTO> getMovieList();
		
		public List<MovieDTO> getAllMovieList();
		
		public List<MovieDTO> getRankList();
		
		public List<MovieDTO> getScreeningList();
		
		public List<MovieDTO> getCommingList();

		public List<MovieDTO> getRecommendList();
		
		public List<MovieDTO> getRecommendList(int g_num);

		public List<MovieDTO> getcategory();

		public List<MovieDTO> getMovieById();

		public List<MovieDTO> getMovieListByFilter();

		public List<MovieDTO> setNewMovie();

		public List<MovieDTO> setUpdateMovie();

		public List<MovieDTO> setDeleteMovie();	
		
		

	}