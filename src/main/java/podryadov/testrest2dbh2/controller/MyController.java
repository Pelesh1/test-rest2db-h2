package podryadov.testrest2dbh2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import podryadov.testrest2dbh2.entity.Student;
import podryadov.testrest2dbh2.service.StudentSerivce;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

        @Autowired
        private StudentSerivce studentSerivce;
        @GetMapping("/students")
        public List<Student> showAllStudents(){
               List <Student> allStudents = studentSerivce.getAllStudents();
               return allStudents;
        }

        @GetMapping("/students/{id}")
        public Student getStudent (@PathVariable("id") int id){
             return studentSerivce.getStudent(id);
        }

        @PostMapping("/students")
        public Student saveStudent(@RequestBody Student student){
                return studentSerivce.saveStudent(student);
        }

        @PutMapping("/students")
        public Student updateStudent(@RequestBody Student student){
                studentSerivce.saveStudent(student);
                return student;
        }

        @DeleteMapping("/students/{id}")
        public void updateStudent(@PathVariable("id") int id) {
                studentSerivce.deleteStudent(id);
        }
}
