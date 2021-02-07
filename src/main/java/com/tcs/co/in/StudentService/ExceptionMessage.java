package com.tcs.co.in.StudentService;

import java.time.LocalDateTime;


public class ExceptionMessage {
	
	private  LocalDateTime timestamp;
	private int status;
	private String error;
	private String message;
	private String path;
	
	public ExceptionMessage(int status,String error, String message, String path)
	{
		this.setTimestamp();
		this.setStatus(status);
		this.setError(error);
		this.setMessage(message);
		this.setPath(path);
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp() {
		this.timestamp = LocalDateTime.now();
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
