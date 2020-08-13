package com.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


/**
 * 环绕通知
 * 把前置通知和后置通知都写到一起
 * 
 * @author Administrator
 *
 */
public class MyArroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("---------------------------------------环绕前置");
		Object proceed = arg0.proceed();
		System.out.println("---------------------------------------环绕后置");
		return proceed;
	}


}
