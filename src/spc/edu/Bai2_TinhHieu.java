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
public class Bai2_TinhHieu {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh hieu 2 so thap phan");
        double a,b, hieu;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap so a: ");
        a = sc.nextDouble();
        
        System.out.print("Nhap so b: ");
        b = sc.nextDouble();
        hieu= a-b;
        System.out.print(a + " - " + b + "= "+ hieu);
    }
}
