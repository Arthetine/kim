package com.team2.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.team2.movie.DTO.Criteria;
import com.team2.movie.DTO.PageDTO;
import com.team2.movie.service.MovieService;
import com.team2.movie.vo.MemberVO;
import com.team2.movie.vo.MovieVo;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/movie/*")
public class AllMovieController {

	@Autowired
	private MovieService movieService;

	//��ũ ������
	@GetMapping("/rank")
	public String rankPage(Model model) {
		System.out.println("[AllMovieController] RackPage()");

		List<MovieVo> list = movieService.getRankList();

		model.addAttribute("rank", list);

//		 ?��중에 주석처리 
		for (MovieVo movieVo : list) {
			log.info(movieVo);
		}

//		String nextPage = "movie/test";
		String nextPage = "board/ranking";
		return nextPage;
	}

	// �󿵿��� ������
	@GetMapping("/comming")
	public String commingPage(Model model) {
		System.out.println("[AllMovieController] commingPage()");

		List<MovieVo> list = movieService.getCommingList();

		model.addAttribute("comming", list);

		// ?��중에 주석처리
		for (MovieVo movieVo : list) {
			log.info(movieVo);
		}

//		String nextPage = "movie/test";
		String nextPage = "board/commingsoon";

		return nextPage;
	}

	// ��õ��ȭ ������
	@GetMapping("/recommend")
	public String recommendPage(MemberVO member, Model model) {
		System.out.println("[AllMovieController] RecommendPage()");

//		List<MovieVo> list = movieService.getRecommendList(2);
		List<MovieVo> list = movieService.getRecommendList(member.getG_num());

		model.addAttribute("recommend", list);

		// ?��중에 주석처리
		for (MovieVo movieVo : list) {
			log.info(movieVo);
		}

//		String nextPage = "movie/test";
		String nextPage = "board/recommend";

		return nextPage;
	}

	//�˻� ��� ������
	@GetMapping("/search")
	public String movieSearchList(Model model, @ModelAttribute("cri") Criteria cri) throws Exception {

		log.info("[AllMoviecontroller] movieSearchList()");

		model.addAttribute("search", movieService.getSearchList(cri));

		List<MovieVo> list = movieService.getSearchList(cri);
		for (MovieVo movieVo : list) {
			log.info(movieVo);
		}

		int total = movieService.getTotal(cri);
		log.info("total : " + total);

//		PageDTO pageMaker = new PageDTO(cri, 5);
		PageDTO pageMaker = new PageDTO(cri, total);

		model.addAttribute("pageMaker", pageMaker);
		log.info("amount : " + pageMaker.getCri().getAmount());
		log.info("pageNum : " + pageMaker.getCri().getPageNum());
		log.info("keyword : " + pageMaker.getCri().getKeyword());
		log.info("type : " + pageMaker.getCri().getType());
		log.info("listLink : " + pageMaker.getCri().getListLink());

		String nextPage = "board/search";

		return nextPage;
	}

	// ���� �� ��� ������
	@GetMapping("/now")
	public String nowPage(Model model) {
		System.out.println("[AllMovieController] nowPage()");

		List<MovieVo> list = movieService.getMovieList();

		model.addAttribute("now", list);

//		?��중에 주석처리 
		for (MovieVo movieVo : list) {
			log.info(movieVo);
		}

//		String nextPage = "movie/test";
		String nextPage = "board/nowplaying";
		return nextPage;
	}

}
