package aop;

import org.springframework.stereotype.Component;
@Component
public class SchoolLibrary extends AbstractLibrary{
    public void getBook() {
        System.out.println("We are take book with school\n");
    }
}
