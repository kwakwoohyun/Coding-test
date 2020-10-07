package for문;

import java.util.Scanner;

public class backjoon8393 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int target = sc.nextInt();
		for (int i = 1; i <= target; i++) {
			num = num + i;
		}
		System.out.println(num);
	}
}
