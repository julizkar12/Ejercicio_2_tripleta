/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tripleta;
 
/**
 *
 * @author juliz
 */
public class Tripleta {

    public static void main(String[] args) {
        
        double a;
        double b;
        double c;
        
        double r;
        int i;
        int j;
        for(i=0; i < 100; i++){
            for(j=0; j < 100; j++){
            a=Math.pow(i,2)-Math.pow(j,2);
            b=2*i*j;
            c=Math.pow(i,2)+Math.pow(j,2);
            r=a+b+c;
                if(a>0 && b>0 && c>0 && r==1000){
                    System.out.println("los números: " +a+", "+b+" y "+c +"; forman una tripleta pitagorica que cumplen las suma a+b+c=1000 ");
                }
        }
        }
                
         
        System.out.println("Hello World!");
    }
}
