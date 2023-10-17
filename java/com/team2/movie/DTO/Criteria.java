package com.team2.movie.DTO;

import org.springframework.web.util.UriComponentsBuilder;

import lombok.Data;

@Data
public class Criteria {

	//?��?�� ?��?���?
	private int pageNum;
	//?��?��?���??�� 보여�? 게시�? ?��
	private int amount;
	
	private String type;
	//�??��?�� ?��?��?��
	private String keyword;

	//기본 ?��?��?�� -> 기본 ?��?�� : pageNum = 1, amount = 10
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
