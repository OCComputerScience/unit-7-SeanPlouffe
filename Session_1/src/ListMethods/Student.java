package ListMethods;

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

    public static String getLastStudent()
    {
        if (classList.size()-1 < 0)
        {
            // Jeremy is a reference to this: https://en.wikipedia.org/wiki/Jeremy_Hillary_Boob
            System.out.println("Jeremy");
        }
        else
        {
            return classList.get(classList.size()-1).firstName;
        }

        return null;
    }

    public static int getClassSize()
    {
        return classList.size();
    }

    public static void addStudent(int index, Student newStudent)
    {
        for(int i = 0; i < getClassSize(); i++)
        {

            Student currStudent = classList.get(i);

            if(currStudent.firstName.equals(newStudent.firstName) &&
                    currStudent.lastName.equals(newStudent.lastName) &&
                    currStudent.grade == newStudent.grade)
            {
                classList.remove(i);
                break;
            }

        }

        classList.add(index, newStudent);

    }

    public static String getStudent(int index)
    {
        return classList.get(index).firstName;
    }

}
