// Created by 21343040_alixa arivya tofer
package com.mycompany.js7;

/**
 *s
 * @author 21343040_alixa arivya tofer
 */
public class latihan9 {
    public static void main(String args[]) {
        int baris, kolom, hasil_kali;
        int MAKS = 8;
        for (baris = 1; baris <= MAKS; baris++) {
            for (kolom = 1; kolom <= MAKS; kolom++) {
                hasil_kali = baris * kolom;
                System.out.print("\t" + hasil_kali);
            }
            System.out.println(" ");
        }
    }    
}
