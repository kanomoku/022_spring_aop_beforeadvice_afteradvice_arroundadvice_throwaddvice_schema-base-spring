package com.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyBeforeAdvice implements MethodBeforeAdvice {

	/**
	 * 切点方法对象
	 *切点方法参数
	 *调用切点方法的那个对象
	 */
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("-----------------------------------------执行前置通知开始");
		
		System.out.println("切点方法对象  "+arg0+"    方法名"+arg0.getName());
		if (arg1!=null && arg1.length>0) {
			System.out.print(arg1);
			System.out.println("  切点方法参数"+arg1[0]);
		} else {
			System.out.print(arg1);
			System.out.println("  没有参数");
		}
		System.out.println("调用方法的那个对象"+arg2);
		
		System.out.println("-----------------------------------------执行前置通知结束");
	}

}
