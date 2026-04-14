import java.util.Scanner;

public class Exc6SwapSort {

    //https://codeforces.com/contest/489/problem/C
    /*
        C. Given Length and Sum of Digits...
        time limit per test1 second
        memory limit per test256 megabytes
        You have a positive integer m and a non-negative integer s. Your task is to find the smallest and the largest of the numbers that have length m and sum of digits s. The required numbers should be non-negative integers written in the decimal base without leading zeroes.

        Input
        The single line of the input contains a pair of integers m, s (1 ≤ m ≤ 100, 0 ≤ s ≤ 900) — the length and the sum of the digits of the required numbers.

        Output
        In the output print the pair of the required non-negative integer numbers — first the minimum possible number, then — the maximum possible number. If no numbers satisfying conditions required exist, print the pair of numbers "-1 -1" (without the quotes).

        Examples
        InputCopy
        2 15
        OutputCopy
        69 96
        InputCopy
        3 0
        OutputCopy
        -1 -1 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int min = 99999999, max = -1;
        int i = (int)Math.pow(10,(n-1));
        for(;i<Math.pow(10, n);i++){
            int copy = i;
            int sum = 0;
            while(copy>0){
                sum += copy%10;
                copy /= 10; 
            }
            if(sum==m){
                if(i<min){
                    min = i;
                }
                if(i>max){
                    max = i;
                }
            }
        }
        if(min==99999999){
            min = -1;
        }
        System.out.println(min +" max:"+max);
    }
}
