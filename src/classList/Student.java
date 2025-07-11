package classList;

import java.util.ArrayList;

public class Student {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();

        addStudents(studentNames);
        displayStudents(studentNames);
    }//end method main
    static void addStudents(ArrayList<String> studentNames){
        //Add the names of everyone in your class
        studentNames.add("Mark");
        studentNames.add("Andrew");
        studentNames.add("Beth");
    }//End method addStudents
    static void displayStudents(ArrayList<String> studentNames){
        for(String student : studentNames)
            System.out.println("Student Name: " + studentNames);
        //end for
    }//end method displayStudents
}//end class Student
