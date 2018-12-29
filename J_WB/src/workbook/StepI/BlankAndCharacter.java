package workbook.StepI;

import java.util.Scanner;

public class BlankAndCharacter {
	private char character;
	private int height;
	private int left_blank;
	
	public BlankAndCharacter() {
		input();
	}
	void printCharWithBlank(int blanks, int size, char ch) {
		int num_char = height - size;
		for(int i=0;i<blanks;i++) System.out.printf(" ");
		for(int i=0;i<size;i++) System.out.printf(" ");
		for(int i=0;i<num_char;i++)System.out.print(ch);
		System.out.println();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("���� �ﰢ���� �׸��µ� ����� ���ڸ� �Է��Ͻÿ�. ");
		character = s.next().charAt(0);
		System.out.printf("���� �ﰢ���� ���̿� ���� ������ ũ�⸦ �Է��Ͻÿ�. ");
		height = s.nextInt();
		left_blank = s.nextInt();
		
	}
	public void printTriangle() {
		int size;
		for(int i=1;i<height+1;i++) {
			size = height - i;
			printCharWithBlank(left_blank,size,character);
		}
	}
}
