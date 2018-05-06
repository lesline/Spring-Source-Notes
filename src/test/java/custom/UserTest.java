package custom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("custom/Customtag.xml");
        User user = (User) bf.getBean("testBean");
        System.out.println(user.getUserName() + "," + user.getEmail());
    }
}