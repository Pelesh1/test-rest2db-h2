package podryadov.testrest2dbh2.service;

import org.springframework.stereotype.Service;
import podryadov.testrest2dbh2.entity.Student;

import java.util.List;
@Service

public interface StudentSerivce {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudent(int id);

    void deleteStudent(int id);
}
