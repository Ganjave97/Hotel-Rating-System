package com.lcwd.user.service.exception;

public class ResourceNotFoundException extends RuntimeException {
	//extra properties that you want to manage
	public ResourceNotFoundException() {
		super("Resource Not Found");
	}
	
	public ResourceNotFoundException (String message) {
		super(message);
	}

}
