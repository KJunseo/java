package workbook.StepH;

import java.util.Scanner;

public class ChangeString {
	private String input;
	private String findStr;
	private String replaceStr;
	
	public ChangeString() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("============================");
		System.out.printf("=> 문자열을 입력하세요 (x: 종료): \n");
		this.input = s.nextLine();
		if(!input.equalsIgnoreCase("x")) {
			System.out.printf("=> 찾을 문자열을 입력하세요: ");
			this.findStr = s.next();
			System.out.printf("=> 바꿀 문자열을 입력하세요: ");
			this.replaceStr = s.next();
		}
	}
	public void fix() {
		int count=0;
		while(!input.equalsIgnoreCase("x")) {
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
			input();
		}
		System.out.println("* 종료되었습니다.");
	}
}
