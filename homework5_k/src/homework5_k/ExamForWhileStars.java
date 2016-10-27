package homework5_k;
import java.util.Scanner;
public class ExamForWhileStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("1. 정사각형 별찍기");
			System.out.println("2. 직각삼각 별찍기");
			System.out.println("3. 이등변삼각형 별찍기");
			System.out.println("4. 다이아몬드 별찍기");
			System.out.println("5. 종료하기");
			System.out.print("원하는 메뉴는>> ");
			int sel= sc.nextInt();
			
		
			if(sel==1)
				new RectagleStars().print();
			else if(sel==2)
				new TriangleStars().print();
			else if(sel==3)
				new IsoscelesTriangleStars().print();
			else if(sel==4)
				new DiamondStars().print();
			else if(sel==5)
				System.exit(0);
		}
	}

}
