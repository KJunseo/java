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
			System.out.printf("=> ���ڿ��� �Է��ϼ��� (x: ����): \n");
			this.input = s.nextLine();
			if(input.equalsIgnoreCase("x")) {
				System.out.println("* ����Ǿ����ϴ�.");
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
		System.out.printf("=> ã�� ���ڿ��� �Է��ϼ���: ");
		findStr = s.next();
		System.out.printf("=> �ٲ� ���ڿ��� �Է��ϼ���: ");
		replaceStr = s.next();
		String list[]=input.split(" ");
		for(int i=0;i<list.length;i++) {
			if(list[i].indexOf(findStr)!=-1) {
				count++;
			}
		}
		input = input.replace(findStr, replaceStr);
		System.out.println();
		System.out.printf("=> �� %d�� �ٲ�����ϴ�.\n", count);
		System.out.println("=> " + input);
		System.out.println();
	}
}
