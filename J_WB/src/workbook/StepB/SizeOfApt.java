package workbook.StepB;

import java.util.Scanner;

public class SizeOfApt {
	private double m2_area;
	private double pyung_area;
	
	public SizeOfApt() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("����Ʈ�� ���� ����(��������)�� �Է��Ͻÿ�. ");
		this.m2_area = s.nextDouble();
	}
	public void printSize() {
		System.out.printf("����Ʈ�� ������ %.1f �̰�, \n", getPyung());
		if(getPyung() < 30) {
			System.out.println("30�� �̸��̹Ƿ� ���� ����Ʈ �Դϴ�.");
		}
		else
			System.out.println("30�� �̻��̹Ƿ� ū ����Ʈ �Դϴ�.");
	}
	double getPyung() {
		pyung_area = m2_area/3.305;
		return this.pyung_area;
	}
}
