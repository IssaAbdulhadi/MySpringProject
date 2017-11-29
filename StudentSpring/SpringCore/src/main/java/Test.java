import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ctx.start();

        StudentResult studentResult = (StudentResult)ctx.getBean("studentResult");
        double gpa = studentResult.getGPA("/Users/administrator/IdeaProjects/StudentSpring/src/main/resources/student.txt");
        System.out.println(gpa);
        System.out.println("================================");
        System.out.println("Students");
        studentResult.printStudent();



    }
}
