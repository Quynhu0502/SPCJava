/*          
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.ArrayList;
/**
 *
 * @author SPC
 */
public class Bai15_Tinhdayso {
    public static void main(String[] args) {
        System.out.println("");
            ArrayList<String> ds= new ArrayList<String>();
            
            for (int i= 1 ; i <=100;i ++)
            {
                ds.add(Integer.toString(i));
            
           }
            ds.add("Thai Quynh Nhu");
            int x =ds.indexOf(50);
             int y =ds.indexOf(60);
              int j =ds.indexOf(70);
              ds.remove(x);
              ds.remove(y);
              ds.remove(j);
            }
            
        }
    

