package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
//		一.AOP
//		1.AOP:中文名称面向切面编程
//		2.英文名称:(Aspect Oriented Programming)
//		3.正常程序执行流程都是纵向执行流程
//			3.1 又叫面向切面编程,在原有纵向执行流程中添加横切面
//			3.2 不需要修改原有程序代码
//				3.2.1 高扩展性
//				3.2.2 原有功能相当于释放了部分逻辑.让职责更加明确.
//		4.面向切面编程是什么?
//			4.1 在程序原有纵向执行流程中,针对某一个或某一些方法添加通知,形成横切面过程就叫做面向切面编程.
//		5.常用概念
//			5.1 原有功能: 切点, pointcut
//			5.2 前置通知: 在切点之前执行的功能. before advice
//			5.3 后置通知: 在切点之后执行的功能,after advice
//			5.4 如果切点执行过程中出现异常,会触发异常通知.throws advice
//			5.5 所有功能总称叫做切面.
//			5.6 织入: 把切面嵌入到原有功能的过程叫做织入
//		6.spring 提供了2 种AOP 实现方式
//			6.1 Schema-based
//				6.1.1 每个通知都需要实现接口或类
//				6.1.2 配置spring 配置文件时在<aop:config>配置
//			6.2 AspectJ
//				6.2.1 每个通知不需要实现接口或类
//				6.2.2 配置spring 配置文件是在<aop:config>的子标签<aop:aspect>中配置
		
//		二. Schema-based 实现步骤
//		1. 导入jar
//		2. 新建通知类
//			2.1 新建前置通知类
//				2.1.1 arg0: 切点方法对象Method 对象
//				2.1.2 arg1: 切点方法参数
//				2.1.3 arg2:切点在哪个对象中
//			2.2 新建后置通知类
//				2.2.1 arg0: 切点方法返回值
//				2.2.2 arg1:切点方法对象
//				2.2.3 arg2:切点方法参数
//				2.2.4 arg3:切点方法所在类的对象
//		3. 配置spring 配置文件
//			3.1 引入aop 命名空间
//			3.2 配置通知类的<bean>
//			3.3 配置切面
//			3.4 * 通配符,匹配任意方法名,任意类名,任意一级包名
//			3.5 如果希望匹配任意方法参数(..)
//		4. 编写测试代码
//		5. 运行结果:
		
//		四. 异常通知(Schema-based 方式)
//		1. 新建一个类实现throwsAdvice 接口
//			1.1 必须自己写方法,且必须叫afterThrowing
//			1.2 有两种参数方式
//				1.2.1 必须是1 个或4 个
//			1.3 异常类型要与切点报的异常类型一致
//		2. 在ApplicationContext.xml 配置
		
//		五.环绕通知(Schema-based 方式)
//		1. 把前置通知和后置通知都写到一个通知中,组成了环绕通知
//		2. 实现步骤
//			2.1 新建一个类实现MethodInterceptor
//			2.2 配置applicationContext.xml
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Demo demo = ac.getBean("demo",Demo.class);
		demo.demo1();
		demo.demo2();
		demo.demo3();
		demo.demo5("name5");
//		demo.demo4("name4");
	}

}
