package net.junit.assertions;

import net.junit.Student;
import net.junit.StudentService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Test
    void getStudentsTest(){
        StudentService studentService = new StudentService();
//        Student student = new Student(1, "Ram");
//        studentService.addStudent(student);
        List<Student> studentList = studentService.getStudents();

        boolean actualResult = studentList.isEmpty();

//        assertTrue(actualResult);
//        assertTrue(() -> actualResult);
//        assertTrue(actualResult, "List of students is not empty");
//        assertTrue(() -> actualResult, "List of students is not empty");
//        assertTrue(actualResult, () -> "List of students is not empty");
        assertTrue(() -> actualResult, () -> "List of students is not empty");
    }

    @Test
    void getStudentsTestUsing_usingAssertFalse(){
        StudentService studentService = new StudentService();
        List<Student> studentList = studentService.getStudents();
        Student student = new Student(1, "Ram");
        studentService.addStudent(student);
        boolean actualResult = studentList.isEmpty();

//        assertFalse(actualResult);
        assertFalse(actualResult, "Student List should not be empty!");
    }

    @Test
    void getStudentByIdTest_usingAssertNull(){
        StudentService studentService = new StudentService();
        Student student = new Student(1, "Ram");
        studentService.addStudent(student);

        Student actualObject = studentService.getStudentById(1);

//        assertNull(actualObject);
        assertNull(actualObject, "Student object should be null!");

    }

    @Test
    void getStudentByIdTest_usingAssertNotNull(){
        StudentService studentService = new StudentService();
        Student student = new Student(1, "Ram");
        studentService.addStudent(student);

        Student actualObject = studentService.getStudentById(1);

//        assertNotNull(actualObject);
        assertNotNull(actualObject, "Student object should not be null!");

    }

    @Test
    void getStudentByIdTest_usingAssertEqual(){
        StudentService studentService = new StudentService();
        Student student = new Student(1, "Ram");
        studentService.addStudent(student);

        Student actualObject = studentService.getStudentById(1);

        assertEquals(1, actualObject.getId());
        assertEquals("Ram", actualObject.getName());

    }

}