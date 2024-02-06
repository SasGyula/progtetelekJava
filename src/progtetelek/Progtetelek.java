/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progtetelek;

import java.util.Scanner;

/**
 *
 * @author SasGyula(SZOFT_2023_
 */
public class Progtetelek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        osszegzes();
        megszamlalas();
        kivalasztas();
        eldontes();
    }
    private static void osszegzes() {
        Scanner sc = new Scanner (System.in);
        int n = -1;
        while (n < 0){
            n = sc.nextInt();
        }
        int ossz = 0;
        for(int i = 0; i<n+1; i++){
            ossz += i;
        }
        System.out.println("Az első " + n + " szám összege "+ ossz);
    }
    private static void megszamlalas() {
        int db = 0;
        for(int i = 10; i<99; i++){
            if (i % 2 == 0){
                db += 1;
            }
        }
        System.out.println(db);
    }
    private static void kivalasztas(){
        Scanner sc = new Scanner (System.in);
        final int VEGE = 0;
        int min = Integer.MAX_VALUE;
        int db = 0;
        int szam;
        while ((szam = sc.nextInt()) != VEGE){
            if (szam < min){
                min = szam;
            }
            db ++;
        }
        System.out.println(db + "számból a legkisebb: " + min);
    }
    private static void eldontes(){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        boolean prim;
        if(n < 2){
            prim = false;
        }else{
            int i = 2;
            while(i <= Math.sqrt(n) && n % i !=0){
                i++;
            }
            prim = i > Math.sqrt(n);
        }
        if (prim){
            System.out.println(n+" Prím");
        }else{
            System.out.println(n+" Nem prím");
        }
    }
    }
