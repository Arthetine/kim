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
	  private MovieVo vo;  // Vo �� ����
	  
	  //�� ���� ���� �� �ߴ� ����
	  @RequestMapping("main/main.do")  //����Ʈ ���� 
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
	      List<MovieVo> totalpage=dao.movieTotalPage(); //���� ������
	      List<MovieVo> tList=dao.RankList(); //��ũ 5�� 
	     
	      List<MovieVo> rList=dao.RecommendList(); //��õ 
	      	   
	      // content.jsp
	      model.addAttribute("curpage", curpage);
	      model.addAttribute("totalpage", totalpage);
	      model.addAttribute("mList", mList); //���� �ߴ�
	      model.addAttribute("tList", tList); //��ũ
	     
	      model.addAttribute("rList", rList); //��õ
	      return "main";
	  }
	}
