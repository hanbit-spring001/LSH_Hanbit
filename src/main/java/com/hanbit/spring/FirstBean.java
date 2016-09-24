package com.hanbit.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class FirstBean {
	
	private SecondBean secondBean;
	
	private int value;
	
	@Autowired
	public void setSecondBean(SecondBean secondBean) {
		this.secondBean = secondBean;
	}

	public void callSecond() {
		System.out.println(value++);
		secondBean.printName();
	}

}
