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
		System.out.printf("=> ���ڿ��� �Է��ϼ��� (x: ����): \n");
		this.input = s.next();
	}
	public void printUser() {
		while(!input.equalsIgnoreCase("x")) {
			String [] userInfo= {};
			String userList[] = input.split("###");
			System.out.println();
			System.out.printf("=> �� %d���� ��ϵǾ����ϴ�.\n",userList.length);
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
		System.out.println("* ����Ǿ����ϴ�.");
	}
}
