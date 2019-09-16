package com.example.PhoneKart.DTO;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductTO implements Serializable {

	private LifeProducts life;
	
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String name;
	
	private String tools;
	
	private Long playing;
	
	@Autowired
	public void setLifeProducts(LifeProducts x) {
		this.life = x;
	}
	
	public LifeProducts getLifeProducts() {
		return this.life;
	}
	
	public String getTools() {
		return tools;
	}
	public void setTools(String tools) {
		this.tools = tools;
	}
	public Long getPlaying() {
		return playing;
	}
	public void setPlaying(Long playing) {
		this.playing = playing;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		
}
