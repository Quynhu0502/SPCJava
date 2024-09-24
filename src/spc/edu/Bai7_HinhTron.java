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
public class Bai7_HinhTron {
    public static void main(String[] args) {
        System.out.println("TINH CHU VI DIEN TICH HT()");
        double bankinh, chuvi, dientich;
        Scanner sc = new Scanner (System.in);
        System.out.print("nhap ban kinh ");
         bankinh = sc.nextDouble();
        
       
        
        chuvi= Math.PI + bankinh *2;
        dientich = Math.PI + bankinh * bankinh;
        
         System.out.println("Chu Vi: "+ chuvi);
         System.out.println("Dien tich: "+ dientich);
    }
}
