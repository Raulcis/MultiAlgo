// Student.java: Print the first name, last name, and an ID in special sorted formats: (1-unsorted, 2-sorted alphabetically by first name, 3-and sorted by id number).

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;
import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private String lastName;
    private final int id;

    public Student(String lastName, String name, int id) {
        this.lastName = lastName;
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        //FORMAT SHOULD BE FIRST_NAME LAST_NAME ID
        return name + " " + lastName + " " + id;
    }

    public int compareTo(Student st) {
        //COMPARE BY FIRST NAME
        if (st != null) {
            return this.getName().compareToIgnoreCase(st.getName());
        } else throw new NullPointerException();

    }

    public static class lastNameOrder implements Comparator<Student> {
        public int compare(Student thisStudent, Student otherStudent) {
            //Sorts by ID
            if (thisStudent.id > otherStudent.id) {
                return 1;
            } else if (thisStudent.id < otherStudent.id) {
                return -1;
            } else
                return 0;
        }

    }


    public static void main(String[] arg) {
        Student[] student = new Student[6];
        student[0] = new Student("Tolaymat", "Samy", 2);
        student[1] = new Student("Liu", "Linxin", 6);
        student[2] = new Student("Kim", "Jung S.", 9);
        student[3] = new Student("Le", "Kimberly N.", 1);
        student[4] = new Student("Gonzalez", "Robert A.", 8);
        student[5] = new Student("Roscoe", "Sarah R.", 4);


        StdOut.println("");

        //enhanced for loop
        for (Student person : student) {
            System.out.println("Unsorted: " + person);
        }

        StdOut.println("");
        Arrays.sort(student);

        //enhanced for loop
        for (Student person : student) {
            System.out.println("Sorted by first name: " + person);
        }

        StdOut.println("");
        Arrays.sort(student, new Student.lastNameOrder());

        //enhanced for loop
        for (Student person : student) {
            System.out.println("Sorted by id: " + person);
        }

    }
}



