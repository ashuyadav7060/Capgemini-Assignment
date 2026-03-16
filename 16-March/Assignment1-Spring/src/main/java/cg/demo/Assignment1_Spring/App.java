package cg.demo.Assignment1_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Employee;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	 System.out.println("Starting Application");

    	 ApplicationContext ac=new ClassPathXmlApplicationContext("springConf.xml");

         Employee e = (Employee)ac.getBean("emp1");
         
         

         System.out.println(e);

         System.out.println("Stopping Application");
    }
}
