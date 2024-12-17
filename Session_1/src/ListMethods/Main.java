package ListMethods;

public class Main
{

    public static void main(String[] args)
    {

        Student sean = new Student("Sean", "Plouffe", 11);
        Student audrey = new Student("Audrey", "Perkins", 11);
        Student will = new Student("William", "Kane", 11);

        Student.printClassList();
        System.out.println();

        Student.addStudent(1, sean);

        Student.printClassList();
        System.out.println();

        Student.addStudent(1, will);

        Student.printClassList();
        System.out.println();

        System.out.println("-----------------------------------------\n");

        System.out.println("Last student: " + Student.getLastStudent());
        System.out.println("Class size: " + Student.getClassSize());
        System.out.println("Student at index 1: " + Student.getStudent(1));

    }

}
