import java.util.Arrays;
import java.util.List;

public class ShowStudentsImpl implements ShowStudents {
    ReadFromFile readFromFile;
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ShowStudentsImpl(ReadFromFile readFromFile) {
        this.readFromFile = readFromFile;

    }

    public void printStudent() {
        List<Student> parse = readFromFile.parse(this.getPath());
        System.out.print(Arrays.toString(parse.toArray()));
    }
}
