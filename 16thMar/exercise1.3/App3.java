package cg.demo.springg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cg.demo.springg.beans.Employee3;
import cg.demo.springg.beans.SBU2;

public class App3 {
    public static void main(String[] args) {
        System.out.println("Application Started!");
        ApplicationContext ac= new ClassPathXmlApplicationContext("springConf.xml");
        SBU2 sbu= (SBU2) ac.getBean("sbu2");
        
        
        System.out.println("Employee Details");
        System.out.println("-----------------");
        System.out.println(sbu);
        
    }
}