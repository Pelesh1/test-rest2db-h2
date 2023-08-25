package podryadov.testrest2dbh2.dao;

import org.springframework.stereotype.Repository;
import podryadov.testrest2dbh2.entity.Student;

import java.util.List;

@Repository
public interface StudentDAO {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudent(int id);

    void deleteStudent(int id);

}
