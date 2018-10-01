/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.Scanner;

public class Student {

    protected String first_name, last_name, student_id, program;
    protected int uni_year;

    public Student() {
        first_name = "not provided";
        last_name = "not provided";
        student_id = "not provided";
        program = "not provided";
        uni_year = -1;
    }

    public Student(String first_name, String last_name, String student_id, String program, int uni_year) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.student_id = student_id;
        this.program = program;
        this.uni_year = uni_year;
    }

    public void update_info() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first name");
        this.first_name = input.nextLine();
        System.out.println("Input last name");
        this.last_name = input.nextLine();
        System.out.println("Input student ID");
        this.student_id = input.nextLine();
        System.out.println("Input Program");
        this.program = input.nextLine();
        System.out.println("Input Uni Year");
        this.uni_year = input.nextInt();

    }

    public String get_last() {
        return last_name;
    }
}
