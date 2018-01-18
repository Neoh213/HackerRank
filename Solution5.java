/**
 * Created by DJ on 1/18/2018.
 * The stairecase challenege
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution5 {

    static void staircase(int n) {


        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(j < n - i ? ' ' : '#');
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        staircase(number);
        in.close();
    }
}