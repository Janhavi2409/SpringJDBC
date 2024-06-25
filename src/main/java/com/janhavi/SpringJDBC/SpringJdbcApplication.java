package com.janhavi.SpringJDBC;

import com.janhavi.SpringJDBC.model.Student;
import com.janhavi.SpringJDBC.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

        Student student = context.getBean(Student.class);
        student.setRollNo(104);
        student.setName("Janhavi");
        student.setMarks(97);

        StudentService service = context.getBean(StudentService.class);
        service.addStudent(student);

        List<Student> students = service.getStudent();
        System.out.println(students);
    }

}
