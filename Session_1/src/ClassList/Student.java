package ClassList;

import java.util.ArrayList;

public class Student
{

    private String firstName;
    private String lastName;

    private int grade;

    private static ArrayList<Student> classList = new ArrayList<>(5);

    public Student(String inputFirstName, String inputLastName, int inputGrade)
    {
        firstName = inputFirstName;
        lastName = inputLastName;
        grade = inputGrade;

        classList.add(this);
    }

    public static void printClassList()
    {
        for(Student student : classList)
        {
            System.out.println(student.firstName);
        }

    }

}
