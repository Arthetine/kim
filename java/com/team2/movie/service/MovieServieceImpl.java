package com.team2.movie.service;

import java.util.*;
import lombok.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.office.library.MovieDTO;
import com.team2.movie.Mapper.MovieMapper;

import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class MovieServieceImpl implements MovieService {
	
	@Setter(onMethod_ = @Autowired)
	private MovieMapper movieMapper;
	
	@Override
	public List<MovieDTO> getAllMovieList() {
		// TODO Auto-generated method stub
		
		log.info("getAllMovieList.....");
		
		return movieMapper.getMovieList();
		
	}
	
	
	@Override
	public List<MovieDTO> getRankList() {
		
		log.info("getRankList........");
		
		return movieMapper.getRankList();
	
	}
	
	

	@Override
	public List<MovieDTO> getMovieListByCategory(String category) {
		// TODO Auto-generated method stub
		
		log.info("category.....");
		
		return movieMapper.getcategory();
		
	}

	@Override
	public List<MovieDTO> getMovieListByFilter(Map<String, List<String>> filter) {
		// TODO Auto-generated method stub
		
		log.info("getMovieListByFilter.....");
		
		return movieMapper.getMovieListByFilter();
		
	}
	

	@Override
	public List<MovieDTO> getMovieList() {
		// TODO Auto-generated method stub
		
		log.info("getMovieList.....");
		
		return movieMapper.getMovieList();
	}


	@Override
	public List<MovieDTO> getMovieById(String movieId) {
		// TODO Auto-generated method stub
		
		log.info("getMovieById.....");
		
		return movieMapper.getMovieById();
	}
// 내가 필요한 부분이 아닌거 같음
	@Override
	public List<MovieDTO> setNewMovie(MovieDTO movieDTO) {
		// TODO Auto-generated method stub
		log.info("setNewMovie.....");
		
		return movieMapper.setNewMovie();

	}

	@Override
	public List<MovieDTO> setUpdateMovie(MovieDTO movieDTO) {
		// TODO Auto-generated method stub
		log.info("setUpdateMovie.....");
		
		return movieMapper.setUpdateMovie();
	}

	@Override
	public List<MovieDTO> setDeleteMovie(String movieID) {
		// TODO Auto-generated method stub
		log.info("setDeleteMovie.....");
		
		return movieMapper.setDeleteMovie();
	}


	@Override
	public List<MovieDTO> getScreeningList() {
		// TODO Auto-generated method stub
		return null;
	}

}
