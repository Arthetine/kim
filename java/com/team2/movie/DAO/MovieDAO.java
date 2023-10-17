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
    
    //��ũ
    public List<MovieVo> RankList(){
        return mapper.getRankList();
    }
    //��õ ����Ʈ
    public List<MovieVo> RecommendList() {
    	return mapper.getRecommendList();
    }
    
    //�椤 ������
	public List<MovieVo> movieTotalPage() {
		return mapper.getMovieTotalPage();
	}
	//��ȭ ����Ʈ
	public List<MovieVo> MovieList(Map map) {
		return mapper.getMovieList();
	}
    
}