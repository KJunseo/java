package workbook.StepC;

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
	double getPyung() {
		pyung_area = m2_area / 3.305;
		return this.pyung_area;
	}
	public void printSize() {
		System.out.printf("����Ʈ�� ������ %.1f �Դϴ�.\n",getPyung());
		if(getPyung()<15) {
			System.out.println("���� ����Ʈ �Դϴ�.");
		}
		else if(getPyung()>=15&&getPyung()<30) {
			System.out.println("�߼��� ����Ʈ �Դϴ�.");
		}
		else if(getPyung()>=30&&getPyung()<50) {
			System.out.println("���� ����Ʈ �Դϴ�.");
		}
		else {
			System.out.println("���� ����Ʈ �Դϴ�.");
		}
	}
}
