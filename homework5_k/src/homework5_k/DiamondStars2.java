package homework5_k;

import java.util.Scanner;

public class DiamondStars2 {
	public void print() {
		Scanner sc = new Scanner(System.in);
		System.out.print("다이아몬드 크기 입력 : ");
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
		for(int i=0; i<hight-1; ++i){
			for(int j=0; j<hight*2-1; ++j){
				if(j>=i+1 && j<=hight*2-i-3)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
