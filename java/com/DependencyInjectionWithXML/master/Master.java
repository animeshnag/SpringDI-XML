package com.animesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Master1 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("scri.xml");
        Employee obj = (Employee) context.getBean("emp");
        System.out.println(obj);
    }
}
