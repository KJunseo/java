package workbook.StepB;

import java.util.Scanner;

public class JudgeRect {
	private int width;
	private int height;
	private int area;
	
	public JudgeRect() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("���簢���� ���� ũ�⸦ �Է��Ͻÿ�. ");
		this.width = s.nextInt();
		System.out.printf("���簢���� ���� ũ�⸦ �Է��Ͻÿ�. ");
		this.height = s.nextInt();
	}
	public void printRecInfo() {
		System.out.println("���簢���� ���̴� " + getArea() + " �̰�");
		if(width == height) {
			System.out.println("���簢���Դϴ�.");
		}
		else
			System.out.println("���簢���� �ƴմϴ�.");
	}
	int getArea() {
		area = width * height;
		return this.area;
	}
}
