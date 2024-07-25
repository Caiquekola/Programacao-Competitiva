package org.example.MaratonaMineira;

import java.util.Scanner;

public class ProblemA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        if(input>2024){
            input = 2024;
        }
        int output = 2024-((2024-input)*2);
        System.out.println(output);
    }
}
