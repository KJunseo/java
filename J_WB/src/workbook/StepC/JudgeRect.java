package workbook.StepC;

import java.util.Scanner;

public class JudgeRect {
	private int width;
	private int height;

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
	public void printRect() {
		if(width == height) {
			System.out.println("���簢���Դϴ�.");
		}
		else if(width >= 2*height) {
			System.out.println("�¿�� ������ ���簢�� �Դϴ�.");
		}
		else if(width*2 <= height) {
			System.out.println("���Ʒ��� ������ ���簢�� �Դϴ�.");
		}
		else if(width > height) {
			System.out.println("�Ϲ����� ������ ���簢�� �Դϴ�.");
		}
		else {
			System.out.println("�Ϲ����� ������ ���簢�� �Դϴ�.");
		}
			
	}
}
