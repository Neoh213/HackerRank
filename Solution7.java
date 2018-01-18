/**
 * Created by DJ on 1/18/2018.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution7 {

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function

        //make a loop to go through the array and find the highest value. Go through the array again again find
        int highest = 0;
        for(int i = 0; i<ar.length; i++)
        {
            if(ar[i] > highest )
            {
                highest = ar[i];
            }
        }


        int count = 0;
        //the orrances of the highest numbers.
        for(int i = 0; i<ar.length; i++)
        {
            if(ar[i] == highest )
            {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}