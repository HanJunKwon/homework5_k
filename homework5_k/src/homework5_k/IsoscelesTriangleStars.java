package homework5_k;

import java.util.Scanner;

public class IsoscelesTriangleStars {
	public void print() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이등변삼각형 높이입력 : ");
		int hight = sc.nextInt();

		for (int i = 0; i < hight; ++i) {
			for (int j = 0; j < hight * 2 - 1; ++j) {
				if (j >= hight-i-1 && j<= hight+i-1) 
						System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();;
		}
	}
}
