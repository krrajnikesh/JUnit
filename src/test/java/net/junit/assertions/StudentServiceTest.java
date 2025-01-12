package net.junit.assertions;

import net.junit.Student;
import net.junit.StudentNotFoundException;
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
//        studentService.addStudent(student);

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

    @Test
    void getStudentNameByDepartmentUsingAssertArrayEquals(){
        StudentService studentService = new StudentService();
        Student student = new Student(1, "Ram", "Sci");
        Student student1 = new Student(1, "Raj", "Sci");
        Student student2 = new Student(1, "Rohan", "Arts");

        studentService.addStudent(student);
        studentService.addStudent(student1);
        studentService.addStudent(student2);

        String[] actualArray = studentService.getStudentNameByDepartment("Sci");

        String[] expectedArray = {"Ram", "Raj"};

        assertArrayEquals(expectedArray, actualArray);
        assertArrayEquals(expectedArray, actualArray, "Students names are not equal!");
    }

    @Test
    void getStudentByNameTestUsingAssertThrows(){

        StudentService studentService = new StudentService();
        Student student = new Student(1, "Ram", "sci");
        studentService.addStudent(student);

        assertThrows(StudentNotFoundException.class, () -> {
            studentService.getStudentByName("Ramesh");
        });

        assertThrows(StudentNotFoundException.class, () -> {
            studentService.getStudentByName("Ramesh");
        }, "StudentNotFoundException should be thrown ");
    }

    @Test
    void getStudentByNameTestUsingAssertThrowsExactly(){

        StudentService studentService = new StudentService();
        Student student = new Student(1, "Ram", "sci");
        studentService.addStudent(student);

        StudentNotFoundException actualResult =assertThrowsExactly(StudentNotFoundException.class, () -> {
                                            studentService.getStudentByName("Ramesh");
                                        });

        assertEquals("Student not found with name: Ramesh", actualResult.getMessage());

//        assertThrowsExactly(StudentNotFoundException.class, () -> {
//            studentService.getStudentByName("Ramesh");
//        }, "StudentNotFoundException should be thrown ");
    }

}