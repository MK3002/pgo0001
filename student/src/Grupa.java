import java.util.ArrayList;
import java.util.List;
public class Grupa {
    private List<Student> studenci;
    public Grupa() {
        this.studenci = new ArrayList<>();
    }
    public void addStudent(Student student) {
        if (studenci.size() >= 15) {
            throw new IllegalStateException("Grupa jest pełna, maksymalnie można dodać 20 studentów");
        }
        if(studenci.contains(student)) {
            throw new IllegalArgumentException("Ten student już należy do grupy");
        }
        studenci.add(student);
    }
    public List<Student> getStudents() {
        return studenci;
    }






}