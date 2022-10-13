// Created by 21343040_alixa arivya tofer
package com.mycompany.js7;
import java.util.Scanner;
/**
 *
 * @author 21343040_alixa arivya tofer
 */
public class tugas1doWhile {
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        
        System.out.print("Masukkan Nama : ");
        String nama = in.nextLine();
        
        int i = 0;
        do {
            System.out.println(nama);
            i++;
        }
        while (i < 10);
    }
}
