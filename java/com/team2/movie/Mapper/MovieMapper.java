package com.team2.movie.Mapper;

import java.util.*;

import com.team2.movie.vo.MovieVo;


public interface MovieMapper {
		
		public List<MovieVo> getMovieList();
		
		public List<MovieVo> getAllMovieList();
		
		public List<MovieVo> getRankList();
		
		public List<MovieVo> getCommingList();

		public List<MovieVo> getRecommendList(); //추천 리스트
		
		public List<MovieVo> getRecommendList(int g_num);

		public List<MovieVo> getcategory();

		public List<MovieVo> getMovieById();

		public List<MovieVo> getMovieListByFilter();

		public List<MovieVo> setNewMovie();

		public List<MovieVo> setUpdateMovie();

		public List<MovieVo> setDeleteMovie();

		//추가		
		public List<MovieVo> getMovieTotalPage();	//메이 페이지 
		
		
		
		
	


	}