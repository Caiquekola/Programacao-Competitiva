package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int NLinhas = scan.nextInt();
        int n ;
        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();
        for (int i = 0; i < NLinhas; i++) {
            n = scan.nextInt();
            if(n%2==0){
                par.add(n);
            }else{
                impar.add(n);
            }
        }
        par.sort(Comparator.naturalOrder());
        impar.sort(Comparator.reverseOrder());
        Iterator<Integer> it = par.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        it = impar.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
