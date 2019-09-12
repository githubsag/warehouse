package com.agtech.warehouse.domain;

public class Greeting {

	private final Long Id;
	private final String content;
	
	public Long getId() {
		return Id;
	}
	
	public Greeting(Long id, String content) {
		super();
		Id = id;
		this.content = content;
	}

	public Greeting() {
		super();
		this.Id = -1L;
		this.content="";
	}
	
	public String getContent() {
		return content;
	}	
}
