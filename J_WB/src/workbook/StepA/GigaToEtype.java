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
		System.out.printf("���� �뷮�� �Ⱑ����Ʈ ������ �Է��ϼ���. ");
		this.gigabytes = s.nextInt();
	}
	void printEtype() {
		System.out.println("�Է��Ͻ� ���� �뷮��");
		System.out.println(getMega()+" �ް�����Ʈ.");
		System.out.println(getKilo()+" ų�ι���Ʈ.");
		System.out.println(getByte()+" ����Ʈ �Դϴ�.");
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
