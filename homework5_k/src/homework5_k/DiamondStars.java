package homework5_k;

import java.util.Scanner;

public class DiamondStars {
	public void print() {
		Scanner sc = new Scanner(System.in);
		System.out.print("다이아몬드의 크기입력 : ");
		int hight = sc.nextInt();
	
		for (int i = 0; i < hight * 2 - 1; ++i) {
			for (int j = 0; j < hight * 2 - 1; ++j) {
				if (i < hight) {
					if (j >= hight-i-1 && j<= hight+i-1) 
							System.out.print("*");
					else 
						System.out.print(" ");
				}
				else {
					if(j>=i-hight+1 && j<=3*hight-i-3)
						System.out.print("*");
					else System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}