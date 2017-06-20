/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Admin
 */import java.io.*;
import java.util.*;
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a==0)
            System.out.println("ZERO");
        if(a<0)
            System.out.println("NEGATIVE");
        if(a>0)
            System.out.println("POSITIVE");
        // TODO code application logic here
    }
    
    
}
