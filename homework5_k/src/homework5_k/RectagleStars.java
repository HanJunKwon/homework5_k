package homework5_k;
import java.util.Scanner;
public class RectagleStars {
	public void print() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정사각형 크기입력 : ");
		int size = sc.nextInt();
		for (int i=0; i < size / 2; ++i) {
			for (int j=0; j < size; ++j)
				System.out.print("*");
			System.out.println();
		}
	}
}
