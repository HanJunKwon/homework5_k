package homework5_k;

import java.util.Scanner;

public class DiamondStars3 {
	int flag=0;
	int size=0;
	int length=0;
	public void print(){
		Scanner sc = new Scanner(System.in);
		System.out.print("다이아몬드 크기 입력 : ");
		size = sc.nextInt();
		length = size*2-1;
		
		String[][] arr = new String[size][length];
		for(int i=0; i<size; ++i){
			for(int j=0; j<length; ++j){
				arr[i][j]=" ";
			}
		}
		
		print(size-1,size-1,arr);
	}
	
	public void print(int s, int e, String a[][]){
		for(int i=s; i<=e; ++i)
			a[flag][i]="*";
		
		for(int i=0; i<length; ++i)
			System.out.print(a[flag][i]);
		System.out.println();
		
		if(s==0){
			flag=size-1;
			return;
		}
		++flag;
		print(s-1,e+1, a);
		--flag;
		
		for(int i=0; i<length; ++i)
			System.out.print(a[flag][i]);
		System.out.println();
	}
}
