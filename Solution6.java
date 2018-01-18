/**
 * Created by DJ on 1/18/2018.
 * Mini-Max Sum
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution6 {

    static void miniMaxSum(int[] arr) {

        Arrays.sort(arr);
        long highCount =0;
        long  lowCount = 0;
        for(int i = 0; i< arr.length-1; i++)
        {
            lowCount+=arr[i];
        }

        for(int i = 1; i< arr.length; i++)
        {
            highCount+=arr[i];
        }

        System.out.println(lowCount + " " + highCount);



    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
