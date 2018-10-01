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
public class PaperSort {

    protected static Student[] list;

    public static void quickSort(int k) {
        quickSortRecursive(0, k - 1);
    }

    private static void quickSortRecursive(int left, int right) {
        if (left >= right) {
            return;
        }
        int index = left + 1;
        Student pivot = list[left];

        for (int k = left + 1; k <= right; k++) {
            if (pivot.get_last().compareTo(list[k].get_last()) > 0) {
                Student temp = list[k];
                list[k] = list[index];
                list[index] = temp;

                index++;
            }
        }

        list[left] = list[index - 1];
        list[index - 1] = pivot;

        quickSortRecursive(left, index - 2);
        quickSortRecursive(index, right);

    }

    public static void main(String args[]) {

        list = new Student[50];
        for (int k = 0; k < list.length; k++) {
            Student c = new Student();
            c.update_info();
            list[k] = c;

            if ((k + 1) % 10 == 0 && k != 0) {
                quickSort(k + 1);
                for (int j = 0; j < k + 1; j++) {
                    System.out.println("Name: " + list[j].first_name + " " + list[j].last_name + " ID: " + list[j].student_id + " Program: " + list[j].program + " Uni_Year " + list[j].uni_year);
                }
            }

        }

    }

}
