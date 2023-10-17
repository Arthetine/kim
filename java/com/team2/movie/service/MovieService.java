package com.team2.movie.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.office.library.MovieDTO;
import com.team2.movie.DTO.Criteria;
import com.team2.movie.vo.MovieVo;

import org.springframework.web.multipart.MultipartFile;


public interface MovieService {
	
//	public MovieVo getMovie(Long md_num);
//	public Test getTest(Long id);
	
//	public List<MovieVo> getMovieList();
	
	public List<MovieVo> getRankList();
	
	public List<MovieVo> getCommingList();
	
	public List<MovieVo> getRecommendList();
	public List<MovieVo> getRecommendList(int g_num);

	public int getTotal(Criteria cri);
	public List<MovieVo> getSearchList(Criteria cri);
	
	//insert
	public Integer insertMovieDetails(MovieVo movieVo);
	public Integer insertMovieInfo(MovieVo movieVo);
	
	//�쁺�쁽�뵪 異붽�遺�遺�
	public List<MovieVo> getMovieList();
	
//	List<MovieVo> getRankList();
	
	public List<MovieVo> getAllMovieList();
	
	public List<MovieVo> getMovieListByCategory(String category);	
	
	public List<MovieVo> getMovieListByFilter(Map<String, List<String>> filter);		
	 
	public List<MovieVo> getMovieById(String MovieId);
	
	public List<MovieVo> setNewMovie(MovieVo movieVo);
	
	public List<MovieVo> setUpdateMovie(MovieVo movieVo);
	
	public List<MovieVo> setDeleteMovie(String movieID);

	public List<MovieVo> getScreeningList();
	
}
