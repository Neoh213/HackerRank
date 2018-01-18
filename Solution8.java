/**
 * Created by DJ on 1/18/2018.
 * time conversion
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution8 {

    static String timeConversion(String s) {

        String time = s;
        char morningOrEvening = time.charAt(8);
        String hours = time.substring(0, 2);

        if(hours.substring(0,2).equals("12") && morningOrEvening=='P')
        {
            return time.substring(0,8);
        }
        else if (hours.substring(0,2).equals("12")) {
            return "00" + time.substring(2,8);
        } else if (morningOrEvening == 'P') {

            int hoursAsInt = Integer.parseInt(hours);
            time = time.substring(2, time.length());
            hoursAsInt += 12;
            hours = Integer.toString(hoursAsInt);

            time = (hours + time).substring(0, 8);

            return time;

        } else {
            return time.substring(0, 8);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
