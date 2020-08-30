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
    private long universityRollNumber;
    private int numberOfBooksIssued;
    private Book[] namesOfTheBooksIssued;

    public Student(String nameOfTheStudent, long universityRollNumber, int numberOfBooksIssued) {
        this.nameOfTheStudent = nameOfTheStudent;
        this.universityRollNumber = universityRollNumber;
        this.numberOfBooksIssued = numberOfBooksIssued;
        this.namesOfTheBooksIssued = new Book[numberOfBooksIssued];
        for (int index = 0; index < namesOfTheBooksIssued.length; index++) {
            namesOfTheBooksIssued[index] = new Book("Book" + (index + 1), "Author" + (index + 1), "1234567891234");
        }
    }


    public String getNameOfTheStudent() {
        return nameOfTheStudent;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public Book[] getNamesOfTheBooksIssued() {
        return namesOfTheBooksIssued.clone();
    }

    public void setNamesOfTheBooksIssued(Book[] namesOfTheBooksIssued) {
        this.namesOfTheBooksIssued = namesOfTheBooksIssued;
    }
}
