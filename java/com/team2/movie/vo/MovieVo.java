package com.team2.movie.vo;

import java.util.*;
import lombok.*;

import org.springframework.web.multipart.MultipartFile;

@Data
public class MovieVo {

	// ��ȭ �帣
	private Long g_num;					
	private String genre;				//�帣

	// ��ȭ ��������
	private Long md_num;				//��ȭ���� ������ȣ
	private String md_director;			//����
	private String md_actor;			//���
	private String md_text;				//����?
	private String md_runtime;			//�󿵽ð�
	private String md_grade;			//�󿵵��

	// ��ȭ ���� ���̺�
	private Long mi_num;				//��ȭ���� ������ȣ
	private String mi_title;			//����
	private int mi_condition;			//�������� 
	private float mi_total_point;		//�α��
	private MultipartFile mi_thumbnail;	//�̸����� ������
	private Date mi_regDate;			//��ȭ �����
	private Date mi_updatedate;			//������
	
	//���� �߰� 	
	private Date mi_ranklist;			//��ũ ����Ʈ �߰� 
	private Date mi_recommendlist;		//��õ ��ȭ ����ũ �߰�
	private Date mi_totalpage;			//��Ż ������
	
//	private String fileName = mi_thumbnail.getOriginalFilename();
	
}
