package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void studentIdLengthShouldBeFive() {
        var student = new Student("TestStudent", 2);
        int idLength = student.getStudentID().length();
        assertEquals(5, idLength);
    }

    @Test
    public void studentIdShouldBeString() {
        var student = new Student("TestStudent", 2);
        assertEquals(String.class, student.getStudentID().getClass());
    }

    @Test
    public void studentYearShouldBeFour() {
        var student = new Student("TestStudent", 4);
        int testStudentYear = student.getStudentYear();
        assertEquals(4, testStudentYear);
    }

    @Test
    public void studentYearShouldBeOne() {
        var student = new Student("TestStudent", 1);
        int testStudentYear = student.getStudentYear();
        assertEquals(1, testStudentYear);
    }

    @Test
    public void setStudentYearMethodWithZeroShouldReturnIllegalArgumentException() {
        var student = new Student("TestStudent", 2);
        assertThrows(IllegalArgumentException.class,
                () -> {
            student.setStudentYear(0);
                });
    }

    @Test
    public void setStudentYearMethodWithFiveShouldReturnIllegalArgumentException() {
        var student = new Student("TestStudent", 2);
        assertThrows(IllegalArgumentException.class,
                () -> {
                    student.setStudentYear(5);
                });
    }

    // TODO: Find out how to test object instantiation parameters
    /*@Test
    public void instantiateStudentWithYearZeroShouldReturnIllegalArgumentException() {
        int failingYear = 0;
        var student = new Student("TestStudent", failingYear);
        assertThrows(IllegalArgumentException.class,
                student::getStudentYear);
    }*/
}
