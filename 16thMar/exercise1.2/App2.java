package cg.demo.springg;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cg.demo.springg.beans.Employee2;


public class App2 {
	public static void main(String[] args) {
        System.out.println("Application Started!");
        ApplicationContext ac= new ClassPathXmlApplicationContext("springConf.xml");
        Employee2 e= (Employee2) ac.getBean("emp1");
        
        //problem 1.2
        System.out.println("Employee Details");
        System.out.println("-----------------");
        System.out.println(e);
}
	}
