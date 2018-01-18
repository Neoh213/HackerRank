/**
 * Created by DJ on 1/18/2018.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        //use variables to keep track of each amount and the totals.
        float negCount = 0;
        float posCount = 0;
        float zeroCount = 0;
        int totalCount = 0;
        //just write a loop that goes through the array and count how many negative, non negative, and 0 elements are inside.
        for (int i = 0; i< arr.length; i++)
        {
            totalCount++;
            if (arr[i] <0)
            {
                negCount++;
            }
            else if (arr[i] >0)
            {
                posCount++;
            }
            else if (arr[i] ==0)
            {
                zeroCount++;
            }
        }

        //devide each variable by the total and print the results.
        System.out.println(posCount/totalCount);
        System.out.println(negCount/totalCount);
        System.out.println(zeroCount/totalCount);



    }
}