package workbook.StepA;

import java.util.Scanner;

public class GigaToEtype {
	private int gigabytes;
	private int megabytes;
	private int kilobytes;
	private long bytes;
	
	public GigaToEtype() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("파일 용량을 기가바이트 단위로 입력하세요. ");
		this.gigabytes = s.nextInt();
	}
	void printEtype() {
		System.out.println("입력하신 파일 용량은");
		System.out.println(getMega()+" 메가바이트.");
		System.out.println(getKilo()+" 킬로바이트.");
		System.out.println(getByte()+" 바이트 입니다.");
	}
	int getMega() {
		megabytes = gigabytes * 1024;
		return this.megabytes;
	}
	int getKilo() {
		kilobytes = megabytes * 1024;
		return this.kilobytes;
	}
	long getByte() {
		bytes = (long)kilobytes * 1024;
		return this.bytes;
	}
}
