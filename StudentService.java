import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully!");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }

        for (Student s : students) {
            System.out.println(s.getId() + " | " + s.getName() + " | " +
                    s.getAge() + " | " + s.getDepartment() + " | " + s.getEmail());
        }
    }

    public void updateStudent(int id, String name, int age, String dept, String email) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(name);
                s.setAge(age);
                s.setDepartment(dept);
                s.setEmail(email);
                System.out.println("Student updated!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void deleteStudent(int id) {
        students.removeIf(s -> s.getId() == id);
        System.out.println("Student deleted!");
    }
}