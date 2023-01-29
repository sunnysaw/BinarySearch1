/*
Question : Take input from and write a program to check whether the element is present in array or not.
__________________________________________________________________________________________________________
NOTE : Using binary search.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int left = 0, middle, a, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF ARRAY :");
        a = sc.nextInt();
        System.out.println("ENTER THE ELEMENT OF ARRAY : ");
        int[] arr = new int[a];
        n = arr.length;
        int right = n - 1;
        middle = (left + right) / 2;
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
        System.out.println("NOW, CHECKING IF THE ELEMENT IS PRESENT OR NOT :");
        while (left <= right) {
            if (arr[middle] == b) {
                System.out.println("THE ELEMENT IS PRESENT IN ARRAY : " + arr[middle]);
                break;
            } else if (arr[middle] < right) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
            middle = (left + right) / 2;
        }
    }
}