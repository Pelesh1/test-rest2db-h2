package podryadov.testrest2dbh2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import podryadov.testrest2dbh2.dao.StudentDAO;
import podryadov.testrest2dbh2.entity.Student;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class StudentServiceimpl implements StudentSerivce {


    @Autowired
    private StudentDAO studentDAO;

    @Override
    @Transactional
    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }

    @Override
    @Transactional
    public Student saveStudent(Student student) {
        return studentDAO.saveStudent(student);
    }

    @Override
    @Transactional
    public Student getStudent(int id) {
        return studentDAO.getStudent(id);
    }

    @Override
    @Transactional
    public void deleteStudent(int id) {
        studentDAO.deleteStudent(id);
    }
}
