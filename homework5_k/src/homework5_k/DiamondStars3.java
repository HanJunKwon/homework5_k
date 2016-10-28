package homework5_k;

import java.util.Scanner;

public class DiamondStars3 {
	int colunm = 0;
	int size = 0;
	int row = 0;

	public void print() {
		Scanner sc = new Scanner(System.in);
		System.out.print("다이아몬드 크기 입력 : ");
		size = sc.nextInt();
		row = size * 2 - 1;

		String[][] arr = new String[size][row];
		for (int i = 0; i < size; ++i) {
			for (int j = 0; j < row; ++j) {
				arr[i][j] = " ";
			}
		}

		print(size - 1, size - 1, arr);
	}

	public void print(int s, int e, String a[][]) {
		for (int i = s; i <= e; ++i)
			a[colunm][i] = "*";

		for (int i = 0; i < row; ++i)
			System.out.print(a[colunm][i]);
		System.out.println();

		if (s == 0)
			return;
		else {
			++colunm;
			print(s - 1, e + 1, a);
			--colunm;

			for (int i = 0; i < row; ++i)
				System.out.print(a[colunm][i]);
			System.out.println();
		}
	}
}
