/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu.Baikiemtra;

import java.util.Scanner;

/**
 *
 * @author SPC
 */
public class de1cau2 {
     public static void main(String[] args) {
        System.out.println("TINH CHU VI DIEN TICH HINH TAM GIAC()");
         double A, B, C, chuvi, dientich;
         //
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap A: ");
        A = sc.nextDouble();
        
        System.out.print("Nhap  B: ");
        B = sc.nextDouble();
        
        System.out.print("Nhap  C: ");
        C = sc.nextDouble();

        chuvi = A + B + C;
        
        dientich = Math.sqrt(chuvi / 2 * ((chuvi / 2) - A) * (chuvi / 2 - B) * (chuvi / 2 - C));
        
        System.out.println("Chu Vi : " + chuvi + " (cm)");
        System.out.println("Dien Tich: " + dientich + " (cm2)");
        
    }
}
