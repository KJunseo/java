package workbook.StepH;

import java.util.Scanner;

public class PrintSplit {
	private String input;
	
	public PrintSplit() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("============================");
		System.out.printf("=> 문자열을 입력하세요 (x: 종료): ");
		this.input = s.next();
	}
	public void printSplit() {
		while(!input.equalsIgnoreCase("x")) {
			String list[] = input.split("");
			System.out.printf("=> 총 문자의 개수는 %d개 입니다.\n", list.length);
			for(int i=0;i<list.length;i++) 
				System.out.println("=> " + list[i]);
			System.out.println();
			input();
		}
		System.out.println("* 종료되었습니다.");

	}
}
