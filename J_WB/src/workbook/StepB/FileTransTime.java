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
		System.out.printf("파일 용량을 메가바이트 단위로 입력하세요. ");
		this.megabytes = s.nextInt();
		System.out.printf("USB 포트가 2.0이면 Y, 아니면 N을 입력하세요. ");
		this.usb2 = s.next();
	}
	public void printTime() {
		if(usb2.equalsIgnoreCase("Y")) {
			System.out.printf("파일 전송 시간은 %d 초 입니다.\n",getUSB2());
		}
		else if(usb2.equalsIgnoreCase("N")){
			System.out.printf("파일 전송 시간은 %d 초 입니다.\n",getUSB1());
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
