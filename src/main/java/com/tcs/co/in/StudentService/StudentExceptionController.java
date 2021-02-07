package com.tcs.co.in.StudentService;



import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentExceptionController {
	
   @ExceptionHandler(value = StudentNotFoundException.class)
    public ResponseEntity<Object> exception(StudentNotFoundException exception) {
		      return new ResponseEntity<>(new ExceptionMessage(404 , "Not Found", "Student not found", "/student/{id}" ), HttpStatus.NOT_FOUND);
	 }

}
