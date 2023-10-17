package com.team2.movie.DAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team2.movie.Mapper.MovieMapper;
import com.team2.movie.vo.MovieVo;

@Repository
public class MovieDAO {
    @Autowired
    private MovieMapper mapper;
    public List<MovieVo> movieListData(Map map){
        return mapper.getMovieList();
    }
//
//    public int movieTotalPage(){
//        return mapper.movieTotalPage();
//    }
    
    //랭크
    public List<MovieVo> RankList(){
        return mapper.getRankList();
    }
    //추천 리스트
    public List<MovieVo> RecommendList() {
    	return mapper.getRecommendList();
    }
    
    //멩ㄴ 페이지
	public List<MovieVo> movieTotalPage() {
		return mapper.getMovieTotalPage();
	}
	//영화 리스트
	public List<MovieVo> MovieList(Map map) {
		return mapper.getMovieList();
	}
    
}