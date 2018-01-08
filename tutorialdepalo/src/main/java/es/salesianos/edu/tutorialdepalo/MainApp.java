package es.salesianos.edu.tutorialdepalo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");

      HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
      FuckOffWorld obj2 = (FuckOffWorld) context.getBean("fuckOffWorld");

      obj1.getMessage();
      obj2.getMessage();
   }
}