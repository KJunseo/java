package workbook.StepB;

import java.util.Scanner;

public class FileTransTime {
	private int megabytes;
	private long bytes;
	private String usb2;
	private int time;
	
	public FileTransTime() {
		input();
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("���� �뷮�� �ް�����Ʈ ������ �Է��ϼ���. ");
		this.megabytes = s.nextInt();
		System.out.printf("USB ��Ʈ�� 2.0�̸� Y, �ƴϸ� N�� �Է��ϼ���. ");
		this.usb2 = s.next();
	}
	public void printTime() {
		if(usb2.equalsIgnoreCase("Y")) {
			System.out.printf("���� ���� �ð��� %d �� �Դϴ�.\n",getUSB2());
		}
		else if(usb2.equalsIgnoreCase("N")){
			System.out.printf("���� ���� �ð��� %d �� �Դϴ�.\n",getUSB1());
		}
	}
	int getUSB1() {
		bytes = (long)megabytes * 1024 * 1024;
		time = (int)bytes /1500000;
		return this.time;
	}
	int getUSB2() {
		bytes = (long)megabytes * 1024 * 1024;
		time = (int)bytes /60000000;
		return this.time;
	}
	
}
