package q2741;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N <= 100000) {
			for (int i = 1; i <= N; i++) {
				System.out.println(i);
			}
		}
		sc.close();

	}
}