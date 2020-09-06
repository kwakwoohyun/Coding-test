package 입출력과사칙연산;

import java.util.Scanner;

public class backjoon2588 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        char aarr[] = a.toCharArray();
        char barr[] = b.toCharArray();

        for (int i = barr.length - 1; i >= 0; i--) {
            System.out.println(Integer.parseInt(new String(aarr)) * Character.getNumericValue(barr[i]));
        }
        System.out.println(Integer.parseInt(a) * Integer.parseInt(b));
    }
    
}
