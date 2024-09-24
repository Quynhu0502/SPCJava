/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.time.Clock;
import java.util.Scanner;

/**
 *
 * @author SPC
 */
public class Bai6_TinhChuvidientich {
    public static void main(String[] args) {
        System.out.println("TINH CHU VI DIEN TICH HCN()");
        double dai, rong, chuvi, dientich;
        Scanner sc = new Scanner (System.in);
        System.out.print("nhap chieu dai ");
        dai = sc.nextDouble();
        
        System.out.print("nhap chieu rong ");
        rong = sc.nextDouble();
        
        chuvi= (dai + rong)*2;
        dientich = dai * rong;
        
         System.out.println("Chu Vi: "+ chuvi);
         System.out.println("Dien tich: "+ dientich);
    }
}
