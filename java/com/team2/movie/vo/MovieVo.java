package com.team2.movie.vo;

import java.util.*;
import lombok.*;

import org.springframework.web.multipart.MultipartFile;

@Data
public class MovieVo {

	// 영화 장르
	private Long g_num;					
	private String genre;				//장르

	// 영화 세부정보
	private Long md_num;				//영화정보 고유번호
	private String md_director;			//감독
	private String md_actor;			//배우
	private String md_text;				//내용?
	private String md_runtime;			//상영시간
	private String md_grade;			//상영등급

	// 영화 정보 테이블
	private Long mi_num;				//영화정보 고유번호
	private String mi_title;			//제목
	private int mi_condition;			//개봉상태 
	private float mi_total_point;		//인기순
	private MultipartFile mi_thumbnail;	//미리보기 섬네일
	private Date mi_regDate;			//영화 등록일
	private Date mi_updatedate;			//개봉일
	
	//새로 추가 	
	private Date mi_ranklist;			//랭크 리스트 추가 
	private Date mi_recommendlist;		//추천 영화 리스크 추가
	private Date mi_totalpage;			//토탈 페이지
	
//	private String fileName = mi_thumbnail.getOriginalFilename();
	
}
