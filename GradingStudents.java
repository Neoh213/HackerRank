/**
 * Created by DJ on 1/18/2018.
 * GradingStudents Exercise on HackerRank in Implementation section
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class GradingStudents {
    static int[] solve(int[] grades){
        int[] results = new int[grades.length];
        for(int i = 0; i <grades.length; i++)
        {
            int grade = grades[i];
            int tensGrade = (grade/10) * 10;
            int ones = grade - tensGrade;

            int nextMultipleOfFive= tensGrade +5;
            if(ones > 5)
            {
                nextMultipleOfFive= tensGrade +10;
            }


            if ((nextMultipleOfFive-grade)  <3 && grade > 37)
            {
                results[i] = nextMultipleOfFive;

            }
            else {
                results[i] = grade;
            }

        }

        return results;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


    }
}
