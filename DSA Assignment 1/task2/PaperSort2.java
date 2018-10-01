/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author matto
 */
public class PaperSort2 {

    protected static Student[] list;

    public static void sort(int k) {
        for (int i = 0; i < k; i++) {
            Student pick = list[i];
            int j = i;

            while (j > 0 && (list[j - 1].get_last().compareTo(pick.get_last())) > 0) {
                list[j] = list[j - 1];
                j--;
            }

            list[j] = pick;
        }
    }

    public static void main(String args[]) {

        list = new Student[50];
        for (int k = 0; k < list.length; k++) {
            Student c = new Student();
            c.update_info();
            list[k] = c;

           sort(k + 1);

           if ((k + 1) % 10 == 0 && k != 0) {
                for (int j = 0; j < k + 1; j++) {
                    System.out.println("Name: " + list[j].first_name + " " + list[j].last_name + " ID: " + list[j].student_id + " Program: " + list[j].program + " Uni_Year " + list[j].uni_year);
                }
            }
        }

    }

}
