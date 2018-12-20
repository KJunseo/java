package workbook.StepD;

import java.util.Scanner;

public class CountRect {
	private int width;
	private int height;
	private int count1;
	private int count2;
	private int count3;
	private int count4;
	private int count5;
	
	public CountRect() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.printf("���簢���� ���� ũ��� ���� ũ�⸦ �Է��Ͻÿ�. ");
			this.width = s.nextInt();
			this.height = s.nextInt();
			if(width<=0 || height<=0) {
				break;
			}
			if(width==height) {
				count1++;
			}
			else if(width>=2*height) {
				count2++;
			}
			else if(height>=2*width) {
				count3++;
			}
			else if(width>height) {
				count4++;
			}
			else {
				count5++;
			}
		}
	}
	public void printNum() {
		System.out.println("\"���簢��\"�� ������ " + count1 + " �Դϴ�.");
		System.out.println("\"�¿�� ������ ���簢��\"�� ������ " + count2 + " �Դϴ�.");
		System.out.println("\"���Ʒ��� ������ ���簢��\"�� ������ " + count3 + " �Դϴ�.");
		System.out.println("\"�Ϲ����� ������ ���簢��\"�� ������ " + count4 + " �Դϴ�.");
		System.out.println("\"�Ϲ����� ������ ���簢��\"�� ������ " + count5 + " �Դϴ�.");
	}
}
