/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.Scanner;

/**
 *
 * @author SPC
 */
public class bai9_tinhluythua {
    public static void main(String[] args) {
        System.out.println(" TINH GIAI THUA)");
        int so, gt=1;
        Scanner sc = new Scanner (System.in);
        System.out.print("nhap so: ");
         so = sc.nextInt();
         for (int i = 1; i <= so; i++)
        { 
            gt *=i;
        }
         System.out.println("Giai thua: "+ gt);
    }
    
    
}
