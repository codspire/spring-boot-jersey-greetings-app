package com.codspire.helloservice.domain;

import java.util.Date;

public class Greeting {
	private String message;
	private Date responseTime;

	public String getMessage() {
		return message;
	}

	public Date getResponseTime() {
		return responseTime;
	}

	public Greeting() {
	}

	public Greeting(String message, Date responseTime) {
		super();
		this.message = message;
		this.responseTime = responseTime;
	}

	@Override
	public String toString() {
		return String.format("Message = %s, responseTime=%s", message, responseTime);
	}
}
