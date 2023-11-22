package com.example.webException;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.Exception.ErreurMessage;
import com.example.demo.Exception.Exception404;

@RestControllerAdvice
public class WebException404 {
	@ExceptionHandler(value=Exception404.class)
   public  ResponseEntity<Object> erreur404(Exception404 exception404){ 
	   ErreurMessage erreurMessage= new ErreurMessage(new Date(),exception404.getMessage(),404);
	   return new ResponseEntity<Object>(erreurMessage,HttpStatus.NOT_FOUND);};
}
