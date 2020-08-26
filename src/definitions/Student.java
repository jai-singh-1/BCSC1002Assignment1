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
}
