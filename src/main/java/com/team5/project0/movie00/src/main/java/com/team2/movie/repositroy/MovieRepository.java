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
    
    //��ũ ����Ʈ�� �ʿ���rk>
    
    List<MovieDTO> getRankList();  


}