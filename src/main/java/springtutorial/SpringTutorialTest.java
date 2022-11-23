package springtutorial;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTutorialTest {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext studentConfig
//                = new AnnotationConfigApplicationContext(StudentConfig.class);
//        Student bean = studentConfig.getBean(Student.class);
//        Student bean1 = studentConfig.getBean(Student.class);
//        bean.setName("Ismoil");
//        bean1.setName("Nuriddin");
//        bean.displayInfo();
//        bean1.displayInfo();

        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
       Student student =(Student) classPathXmlApplicationContext.getBean("studentName");
       student.displayInfo();


    }
}
