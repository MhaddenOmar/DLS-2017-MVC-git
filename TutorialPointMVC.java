/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controllers.StudentController;
import models.Student;
import views.StudentView;

/**
 *
 * @author jarltuxen
 */
public class TutorialPointMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //fetch student record based on his roll no from the database
        Student model  = retriveStudentFromDatabase();

        //Create a view : to write student details on console
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        //update model data
        controller.setStudentName("John");

        controller.updateView();
    }

    private static Student retriveStudentFromDatabase(){
        //fake DB call
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
    
}
