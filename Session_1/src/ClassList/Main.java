package ClassList;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {

        Student sean = new Student("Sean", "Plouffe", 11);
        Student will = new Student("William", "Kane", 11);
        Student audrey = new Student("Audrey", "Perkins", 11);
        Student kaysen = new Student("Kaysen", "Hill", 11);
        Student maxx = new Student("Maxx", "Boutin", 11);

        Student.printClassList();

    }

}
