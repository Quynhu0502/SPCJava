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
public class bai10_tinhcanchi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap nam ");
        int nam = sc.nextInt();
        
        String []can = { "canh", "tan","nham","quy", "giap","at", "binh","dinh", "mau","ky" };
	String []chi = { "than", "dau", "tuat", "hoi", "ti", "suu","dan", "meo","thin ","ty","ngo","mui"};
        
         String cn = can [ nam % 10];
         String ci = chi [nam % 12];
         
          System.out.println(cn + " "+ ci );
    }
}