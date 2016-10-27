package homework5_k;

import java.util.Scanner;

public class TriangleStars {
	public void print() {
		Scanner sc = new Scanner(System.in);
		System.out.print("직각삼각형의 왼쪽여백과 높이입력 : ");
		int size = sc.nextInt();
		int height = sc.nextInt();

		for (int i = 1; i <= height; ++i) {
			for (int j = 1; j <= size; ++j) {
				if (j > size - i)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}
	}
}
