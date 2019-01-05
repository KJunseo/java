package workbook.StepK;

import java.util.Scanner;

public class MenuPan {
	int number[];
	String menu_name[];
	String origin[];
	int price[];
	
	public MenuPan(int num) {
		number = new int[num];
		menu_name = new String[num];
		origin = new String[num];
		price = new int[num];
	}
	void input(int n) {
		Scanner s = new Scanner(System.in);
		for(int i=0;i<n;i++) {
			System.out.printf("%d번 메뉴의 번호, 메뉴명, 원산지, 가격을 입력하시오. ",i+1);
			number[i] = s.nextInt();
			menu_name[i] = s.next();
			origin[i] = s.next();
			price[i] = s.nextInt();
		}
	}
	void show(int n) {
		System.out.println("===============================");
		System.out.println("메뉴번호\t메뉴이름\t원산지\t1인분가격");
		for(int i=0;i<n;i++) {
			System.out.printf("%d\t"+menu_name[i]+"\t"+origin[i]+"\t%d\n",number[i],price[i]);
		}
	}
}
