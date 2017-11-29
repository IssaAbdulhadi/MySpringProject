import java.util.List;

public class StudentRepostiryImpl implements StudentRepostiry {

    public double getGPA(List<Student> students) {
        int sum = 0;
        for (Student student:students) {
sum+=student.getMark();

        }
        return sum/students.size();
    }
}
