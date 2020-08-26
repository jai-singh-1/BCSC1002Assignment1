/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String nameOfTheStudent;
    private long universityRollNumberOfTheStudent;
    private int numberOfBookIssuedByTheStudent;
    private Book[] nameOfTheBooksIssuedByTheStudent;

    public Student(String nameOfTheStudent, long universityRollNumberOfTheStudent, int numberOfBookIssuedByTheStudent, Book[] nameOfTheBooksIssuedByTheStudent){
        this.nameOfTheStudent = nameOfTheStudent;
        this.universityRollNumberOfTheStudent = universityRollNumberOfTheStudent;
        this.numberOfBookIssuedByTheStudent = numberOfBookIssuedByTheStudent;
        this.nameOfTheBooksIssuedByTheStudent = nameOfTheBooksIssuedByTheStudent;
    }

    public String getNameOfTheStudent() {
        return nameOfTheStudent;
    }

    public void setNameOfTheStudent(String nameOfTheStudent) {
        this.nameOfTheStudent = nameOfTheStudent;
    }

    public long getUniversityRollNumberOfTheStudent() {
        return universityRollNumberOfTheStudent;
    }

    public void setUniversityRollNumberOfTheStudent(long universityRollNumberOfTheStudent) {
        this.universityRollNumberOfTheStudent = universityRollNumberOfTheStudent;
    }

    public int getNumberOfBookIssuedByTheStudent() {
        return numberOfBookIssuedByTheStudent;
    }

    public void setNumberOfBookIssuedByTheStudent(int numberOfBookIssuedByTheStudent) {
        this.numberOfBookIssuedByTheStudent = numberOfBookIssuedByTheStudent;
    }

    public Book[] getNameOfTheBooksIssuedByTheStudent() {
        return nameOfTheBooksIssuedByTheStudent;
    }

    public void setNameOfTheBooksIssuedByTheStudent(Book[] nameOfTheBooksIssuedByTheStudent) {
        this.nameOfTheBooksIssuedByTheStudent = nameOfTheBooksIssuedByTheStudent;
    }
}
