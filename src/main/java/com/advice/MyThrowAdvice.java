package com.advice;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

/**
 * spring 中schema-base异常通知的方法
 * 
 * @author Administrator
 *
 */
public class MyThrowAdvice implements ThrowsAdvice {
	//spring 倒叙检查方法所以同时存的的时候应该是调用这个方法
	public void afterThrowing(Method m, Object[] args, Object target, Exception ex) {
		System.out.println("执行异常通知 通过schema-base方式" + ex.getMessage());
	}

}
