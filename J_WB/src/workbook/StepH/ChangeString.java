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
		System.out.printf("=> ���ڿ��� �Է��ϼ��� (x: ����): \n");
		this.input = s.nextLine();
		if(!input.equalsIgnoreCase("x")) {
			System.out.printf("=> ã�� ���ڿ��� �Է��ϼ���: ");
			this.findStr = s.next();
			System.out.printf("=> �ٲ� ���ڿ��� �Է��ϼ���: ");
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
			System.out.printf("=> �� %d�� �ٲ�����ϴ�.\n", count);
			System.out.println("=> " + input);
			System.out.println();
			input();
		}
		System.out.println("* ����Ǿ����ϴ�.");
	}
}
