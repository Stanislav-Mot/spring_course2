package eu.senla.course;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("catBean")
public class Cat implements Pet {
//    private String name;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

//    @PostConstruct
//    public void init() {
//        System.out.println("Class Cat: init method");
//    }

    public Cat() {
        System.out.println("Cat bean is created");
    }
    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }

//    @PreDestroy
//    public void destroy() {
//        System.out.println("Class Cat: destroy method");
//    }
}
