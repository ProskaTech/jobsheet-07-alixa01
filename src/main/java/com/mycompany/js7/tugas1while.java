// Created by 21343040_alixa arivya tofer
package com.mycompany.js7;
import java.util.Scanner;
/**
 *
 * @author 21343040_alixa arivya tofer
 */
public class tugas1while {
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        int i = 0;
        
        System.out.print("Masukkan Nama : ");
        String nama = in.nextLine();
        
        while (i < 10){
            System.out.println(nama);
            i++;
        }
    }
}
