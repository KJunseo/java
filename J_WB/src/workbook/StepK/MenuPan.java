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
			System.out.printf("%d�� �޴��� ��ȣ, �޴���, ������, ������ �Է��Ͻÿ�. ",i+1);
			number[i] = s.nextInt();
			menu_name[i] = s.next();
			origin[i] = s.next();
			price[i] = s.nextInt();
		}
	}
	void show(int n) {
		System.out.println("===============================");
		System.out.println("�޴���ȣ\t�޴��̸�\t������\t1�κа���");
		for(int i=0;i<n;i++) {
			System.out.printf("%d\t"+menu_name[i]+"\t"+origin[i]+"\t%d\n",number[i],price[i]);
		}
	}
}
