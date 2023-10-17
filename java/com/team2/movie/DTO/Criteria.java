package com.team2.movie.DTO;

import org.springframework.web.util.UriComponentsBuilder;

import lombok.Data;

@Data
public class Criteria {

	//?˜„?ž¬ ?Ž˜?´ì§?
	private int pageNum;
	//?•œ?Ž˜?´ì§??‹¹ ë³´ì—¬ì¤? ê²Œì‹œë¬? ?ˆ˜
	private int amount;
	
	private String type;
	//ê²??ƒ‰?–´ ?‚¤?›Œ?“œ
	private String keyword;

	//ê¸°ë³¸ ?ƒ?„±?ž -> ê¸°ë³¸ ?„¸?Œ… : pageNum = 1, amount = 10
	public Criteria() {
		this(1, 10);
	}

	public Criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}
	
	public String[] getTypeArr() {

		return type == null ? new String[] {} : type.split("");
	}

	public String getListLink() {

		UriComponentsBuilder builder = UriComponentsBuilder.fromPath("")
				.queryParam("pageNum", this.pageNum)
				.queryParam("amount", this.getAmount())
				.queryParam("type", this.getType())
				.queryParam("keyword", this.getKeyword());

		return builder.toUriString();

	}
}
