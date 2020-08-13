package com.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MyAfterAdvice implements AfterReturningAdvice{

	/**
	 * 返回值
	 *切点方法对象 
	 *切点对象参数 
	 *调用切点方法的那个对象 
	 */
	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("-----------------------------------------执行后置通知开始");

		//返回值
		System.out.println("arg0"+arg0);
		//切点方法对象
		System.out.println("arg1"+arg1);
		//切点对象参数
		System.out.println("arg2"+arg2);
		//调用切点方法的那个对象
		System.out.println("arg3"+arg3);
		
		System.out.println("-----------------------------------------执行后置通知结束");
	}

}
