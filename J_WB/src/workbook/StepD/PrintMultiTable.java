package workbook.StepD;

import java.util.Scanner;

public class PrintMultiTable {
	private int dan;
	private int i;
	
	public PrintMultiTable() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.printf("����ϰ� ���� �������� �� ���� �Է��Ͻÿ�(2-9). ");
			this.dan = s.nextInt();
			if(dan>=2&&dan<=9) {
				break;
			}
			else {
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
			}
		}
	}
	public void printMTable() {
		for(i=1;i<10;i++) {
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		}
	}
}
