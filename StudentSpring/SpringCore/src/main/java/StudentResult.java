

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class StudentResult {

    @Autowired
    private StudentRepostiry studentRepostiry;

    @Autowired
    private ReadFromFile readFromFile;

    @Autowired
    private  ShowStudents showStudents;

    public double getGPA(String path){
        double gpa = studentRepostiry.getGPA(getStudents(path));
    return gpa;
    }
    public List<Student> getStudents(String path){
        return readFromFile.parse(path);
    }

    public void printStudent(){
        showStudents.printStudent();
    }
}
