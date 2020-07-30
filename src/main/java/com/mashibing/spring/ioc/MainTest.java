package com.mashibing.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
    Tank tank = (Tank) context.getBean("tank");
    System.out.println(tank);
  }

}
