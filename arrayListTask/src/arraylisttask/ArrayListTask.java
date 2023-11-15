/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylisttask;

/**
 *
 * @author Dell 7300
 */
import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return this.name.compareTo(otherStudent.getName());
    }
}

public class ArrayListTask {
    public static void main(String[] args) {
        // Membuat ArrayList dari objek Student
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Juan"));
        studentList.add(new Student("Maria"));
        studentList.add(new Student("Ahmad"));
        studentList.add(new Student("Zara"));
        studentList.add(new Student("John"));

        // Melakukan sorting ArrayList berdasarkan nama siswa
        Collections.sort(studentList);

        // Menampilkan daftar siswa setelah diurutkan
        System.out.println("Sorted Student List:");
        for (Student student : studentList) {
            System.out.println(student.getName());
        }

        // Mencari siswa dengan binary search
        String targetName = "Juan";
        int index = binarySearch(studentList, targetName);

        if (index != -1) {
            System.out.println("\n" + targetName + " found at index " + index);
        } else {
            System.out.println("\n" + targetName + " not found");
        }
    }

    // Metode binary search untuk mencari siswa dalam ArrayList
    private static int binarySearch(ArrayList<Student> list, String target) {
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = target.compareTo(list.get(mid).getName());

            if (result == 0) {
                return mid; // Item ditemukan
            } else if (result < 0) {
                right = mid - 1; // Cari di setengah kiri
            } else {
                left = mid + 1; // Cari di setengah kanan
            }
        }

        return -1; // Item tidak ditemukan
    }
}