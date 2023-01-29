/*
Question : Take input from user and sort array.
_________________________________________________
NOTE : Using linear search.
 */

import java.util.Scanner;
public class LinearSearch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF ARRAY :");
        int a = sc.nextInt();
        System.out.println("ENTER THE ELEMENT OF ARRAY : ");
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("FIRST PRINTING THE ORIGINAL VALUE OF ARRAY :");
        for (int j : arr) {
            System.out.print(" " + j);
        }
        System.out.println();
        System.out.println("ENTER THE NUMBER YOU WANT TO CHECK :");
        int b = sc.nextInt();
        System.out.println("NOW, CHECKING IF THE ELEMENT IS PRESENT OR NOT :" + b);
        System.out.println();
        for (int j : arr) {
            if (j == b) {
                System.out.println("NUMBER IS PRESENT IN ARRAY : " + j);
            }
        }
    }
}
