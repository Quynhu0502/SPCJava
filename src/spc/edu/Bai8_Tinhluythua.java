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
public class Bai8_Tinhluythua {
    public static void main(String[] args) {
        System.out.println("TINH LUY THUA ()");
        double so,mu,lt=1;
        Scanner sc = new Scanner (System.in);
        System.out.print("nhap so ");
         so = sc.nextDouble();
        System.out.print("nhap mu ");
         mu = sc.nextDouble();
        for (double i =1 ; i <= mu; i++)
        {
            lt *= so;
        }
           System.out.println("Luy thua: "+ lt);
    }
    
}
