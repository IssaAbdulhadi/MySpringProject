import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFileImpl implements ReadFromFile {
    public List<Student> parse(String path) {
        List<Student> students = new ArrayList<Student>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(path)));
            String line = bufferedReader.readLine();
            while (line!=null)
            {
                String[] split = line.split(";");
                Student student = new Student();
                student.setMark(Double.parseDouble(split[1]));
                student.setName(split[0]);
                student.setSchoolName(split[2]);
                students.add(student);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  students;
    }
}
