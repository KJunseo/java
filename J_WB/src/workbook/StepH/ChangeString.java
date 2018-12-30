package workbook.StepH;

import java.util.Scanner;

public class ChangeString {
	private String input;
	
	public ChangeString() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("============================");
			System.out.printf("=> 문자열을 입력하세요 (x: 종료): \n");
			this.input = s.nextLine();
			if(input.equalsIgnoreCase("x")) {
				System.out.println("* 종료되었습니다.");
				break;
			}
			fix();
		}
	}
	void fix() {
		int count=0;
		String findStr;
		String replaceStr;
		
		Scanner s = new Scanner(System.in);
		System.out.printf("=> 찾을 문자열을 입력하세요: ");
		findStr = s.next();
		System.out.printf("=> 바꿀 문자열을 입력하세요: ");
		replaceStr = s.next();
		String list[]=input.split(" ");
		for(int i=0;i<list.length;i++) {
			if(list[i].indexOf(findStr)!=-1) {
				count++;
			}
		}
		input = input.replace(findStr, replaceStr);
		System.out.println();
		System.out.printf("=> 총 %d번 바뀌었습니다.\n", count);
		System.out.println("=> " + input);
		System.out.println();
	}
}
