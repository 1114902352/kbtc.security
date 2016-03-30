package com.ai.test.controller;

import javax.annotation.PostConstruct;

public class TestLifeCycle {

	private Integer number;

	public TestLifeCycle() {
		System.out.println("执行构造器" + number);
	}

	@PostConstruct
	public void init() {
		System.out.println("执行init" + number);
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		System.out.println("执行SetNumber");
		this.number = number;
	}

}
