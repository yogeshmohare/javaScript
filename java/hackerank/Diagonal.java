import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Diagonal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int diag1 = 0;
        int diag2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = in.nextInt();
                if (i == j) {
                    diag1 += num;
                }
                if (i == n - 1-j) {
                    diag2 += num;
                }
            }
        }
        System.out.println(Math.abs(diag1 - diag2));
    }
}