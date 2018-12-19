package workbook.StepC;

import java.util.Scanner;

public class FileTransTime {
	private int megabytes;
	private long bytes;
	private byte kind;
	private double time;
	
	public FileTransTime() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("���� �뷮�� �ް�����Ʈ ������ �Է��ϼ���. ");
		this.megabytes = s.nextInt();
		System.out.printf("���۹���� 1: WI-FI, 2: BlueTooth, 3: LTE, 4:USB ���� �����Ͽ� �Է��ϼ���. ");
		this.kind = s.nextByte();
	}
	double getTime() {
		bytes = (long)megabytes * 1024 * 1024;
		if(kind==1) {
			time = (double)bytes /1500000;
		}
		else if(kind==2) {
			time = (double)bytes /300000;
		}
		else if(kind==3) {
			time = (double)bytes /1000000;
		}
		else if(kind==4) {
			time = (double)bytes /60000000;
		}
		return this.time;
	}
	public void printTime() {
		System.out.printf("���� ���� �ð��� %.1f ���Դϴ�.\n",getTime());
	}
}
