package workbook.StepA;

import java.util.Scanner;

public class AreaOfRec {
	private int width;
	private int height;
	private int area;
	
	public AreaOfRec() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("���簢���� ���� ũ�⸦ �Է��Ͻÿ�. ");
		this.width = s.nextInt();
		System.out.print("���簢���� ���� ũ�⸦ �Է��Ͻÿ�. ");
		this.height = s.nextInt();
	}
	int getArea() {
		area = width*height;
		return this.area;
	}
	public void printArea() {
		System.out.println("���簢���� ���̴� " + getArea()+"�Դϴ�");
	}
}
