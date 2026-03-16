package cg.demo.ashu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Employee;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	 System.out.println("Starting Application");
//         ApplicationContext ac = new ClassPathXmlApplicationContext("springConf2.xml");
    	 ApplicationContext ac=new ClassPathXmlApplicationContext("springConf.xml");
//         two methods use to getBean 
         Employee e = (Employee)ac.getBean("emp1");
//         Employee e1 = ac.getBean(Employee.class);
//         Employee e1 = (Employee)ac.getBean("emp2");
         e.greet();
         
//         when will prototype object destroyed
         System.out.println(e);
//         System.out.println(e1);
         System.out.println("Stopping Application");
    }
}
