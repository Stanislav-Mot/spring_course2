package eu.senla.course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Cat cat = context.getBean("catBean", Cat.class);
        cat.say();

//        System.out.println(myDog == yourDog);
        context.close();
    }
}
