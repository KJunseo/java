package workbook.StepD;

import java.util.Scanner;

public class KindOfApt {
	private double m2_area;
	private double pyung_area;
	private int count1;
	private int count2;
	private int count3;
	private int count4;
	private int i;
	
	public KindOfApt() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		for(i=0;i<10;i++) {
			System.out.printf("����Ʈ �о� ����(��������)�� �Է��Ͻÿ�. ");
			this.m2_area = s.nextDouble();
			if(getPyung()<15) {
				count1++;
			}
			else if(getPyung()>=15&&getPyung()<30) {
				count2++;
			}
			else if(getPyung()>=30&&getPyung()<50) {
				count3++;
			}
			else {
				count4++;
			}
			System.out.printf("--> �� ����Ʈ�� ������ %.1f �Դϴ�. \n", getPyung());
		}
	}
	double getPyung() {
		pyung_area = m2_area / 3.305;
		return this.pyung_area;
	}
	public void printApt() {
		System.out.println("\"���� ����Ʈ\"�� ������ " + count1 + "�Դϴ�.");
		System.out.println("\"�߼��� ����Ʈ\"�� ������ " + count2 + "�Դϴ�.");
		System.out.println("\"���� ����Ʈ\"�� ������ " + count3 + "�Դϴ�.");
		System.out.println("\"���� ����Ʈ\"�� ������ " + count4 + "�Դϴ�.");
	}
}
