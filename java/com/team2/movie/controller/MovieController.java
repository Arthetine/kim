package com.team2.movie.controller;

import java.util.*;
import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.team2.movie.DAO.MovieDAO;
import com.team2.movie.vo.MovieVo;

import lombok.*;
import lombok.extern.log4j.Log4j;

@Controller
public class MovieController {
	  @Autowired
	  private MovieDAO dao;
	  
	  @Autowired
	  private MovieVo vo;  // Vo 와 동일
	  
	  //맨 위에 메인 에 뜨는 아이
	  @RequestMapping("main/main.do")  //사이트 변경 
	  public String main_main(String page, Model model)
	  {
	      if(page==null)
	          page="1";
	      int curpage=Integer.parseInt(page);
	      Map map=new HashMap();
	      int rowSize=12;
	 
	      int start=(rowSize*curpage)-(rowSize-1);
	      int end=rowSize*curpage;
	      map.put("start", start);
	      map.put("end", end);
	      List<MovieVo> mList=dao.MovieList(map);
	      for(MovieVo dao:mList){
	          String s=dao.getMi_title();
	          if(s.length()>20){
	              s=s.substring(0,17)+"...";
	              dao.setMi_title(s);
	          }
	      }
	      List<MovieVo> totalpage=dao.movieTotalPage(); //메인 메이지
	      List<MovieVo> tList=dao.RankList(); //랭크 5개 
	     
	      List<MovieVo> rList=dao.RecommendList(); //추천 
	      	   
	      // content.jsp
	      model.addAttribute("curpage", curpage);
	      model.addAttribute("totalpage", totalpage);
	      model.addAttribute("mList", mList); //맨위 뜨는
	      model.addAttribute("tList", tList); //랭크
	     
	      model.addAttribute("rList", rList); //추천
	      return "main";
	  }
	}
