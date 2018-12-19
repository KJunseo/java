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
		System.out.printf("파일 용량을 메가바이트 단위로 입력하세요. ");
		this.megabytes = s.nextInt();
		System.out.printf("전송방식을 1: WI-FI, 2: BlueTooth, 3: LTE, 4:USB 에서 선택하여 입력하세요. ");
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
		System.out.printf("파일 전송 시간은 %.1f 초입니다.\n",getTime());
	}
}
