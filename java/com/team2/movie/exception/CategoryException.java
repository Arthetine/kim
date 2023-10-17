package com.team2.movie.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="��û�� ��ȭ�� ã�� �� �����ϴ�.")
public class CategoryException extends RuntimeException{

}
