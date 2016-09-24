package com.hanbit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	
public static void main(String[] args) {
	
	ApplicationContext applicationContext
		=new ClassPathXmlApplicationContext
				("spring/applicationContext-core.xml");
	
	//FirstBean oldBean = new FirstBean();
	//FirstBean oldBean2 = new FirstBean();
	
	//System.out.println(oldBean.getValue());
	//System.out.println(oldBean2.getValue());
	
	//FirstBean springBean = applicationContext.getBean(FirstBean.class);
	//FirstBean springBean2 = applicationContext.getBean(FirstBean.class);

	//System.out.println(springBean.getValue());
	//System.out.println(springBean2.getValue());
	
	FirstBean springBean = applicationContext.getBean(FirstBean.class);

	springBean.callSecond();
}
}
