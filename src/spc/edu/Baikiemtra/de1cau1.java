/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu.Baikiemtra;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author SPC
 */
public class de1cau1 {
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ds= new ArrayList<Integer>();
         
          String input;
           System.out.println("Nhap so (hoặc 'stop' de dung):");
           while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
            try {
                int so = Integer.parseInt(input);
                ds.add(so );
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap mot so hop le hoac 'stop' de dung.");
    }
             if (ds.size() > 0) {
            int max = ds.get(0);
            int min =ds.get(0);
            int sum = 0;
            for (int num : ds) {
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
                sum += num;
            }
            double average = (double) sum / ds.size();
            System.out.println("So lon nhat: " + max);
            System.out.println("So nho nhat: " + min);
            System.out.println("Tong cua day so: " + sum);
            System.out.println("Trung binh cua day so: " + average);
        } else {
            System.out.println("Không có số nào được nhập.");
        }
        scanner.close();
    }

           }
    
}

