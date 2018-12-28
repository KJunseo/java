package workbook.StepH;

import java.util.Scanner;

public class PrintInformation {
	private String input;
	
	public PrintInformation() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("============================");
		System.out.printf("=> 문자열을 입력하세요 (x: 종료): \n");
		this.input = s.next();
	}
	public void printUser() {
		while(!input.equalsIgnoreCase("x")) {
			String [] userInfo= {};
			String userList[] = input.split("###");
			System.out.println();
			System.out.printf("=> 총 %d명이 등록되었습니다.\n",userList.length);
			for(int i=0;i<userList.length;i++) {
				userInfo =userList[i].split("\\|");
				System.out.printf("%d " ,i+1);
				for(int j=0;j<userInfo.length;j++) {
					System.out.printf(userInfo[j]+" ");
				}
				System.out.println();
			}
			input();
		}
		System.out.println("* 종료되었습니다.");
	}
}
