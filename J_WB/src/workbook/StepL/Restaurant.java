package workbook.StepL;

import java.text.SimpleDateFormat;
import java.util.*;

public class Restaurant {
	static final int STEAKPRICE = 25000;
	static final int SPAGHETTIPRICE = 15000;
	static final int PASTAPRICE = 17000;
	int price[] = {STEAKPRICE,SPAGHETTIPRICE, PASTAPRICE};
	int food_num [] = {0,0,0};
	
	Scanner s = new Scanner(System.in);
	ArrayList<Guest> g = new ArrayList<Guest>();
	SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm",Locale.US);
	
	public Restaurant() {
		while(true) {
			System.out.println("------------------------------------");
			System.out.printf("1)�ֹ� 2)���� 3)����Ʈ 4)���� ==> ");
			int select = s.nextInt();
			System.out.println("------------------------------------");
			switch(select) {
			case 1:
				order();
				break;
			case 2:
				pay();
				break;
			case 3:
				show();
				break;
			case 4:
				System.out.println("����Ǿ����ϴ�.");
				System.exit(0);
			}
		}
	}
	void order() {
		System.out.printf("�մ� ���� �Է��ϼ���: ");
		int num = s.nextInt();
		System.out.printf("������ũ, ���İ�Ƽ, �Ľ�Ÿ�� ������ �Է��ϼ���: ");
		for(int i=0;i<food_num.length;i++) {
			food_num[i] = s.nextInt();
		}
		System.out.printf("����� ī�尡 �ֽ��ϱ�?(Y:����): ");
		String membership = s.next();
		String enter_t = time.format(new Date());
		System.out.println("������ �ð��� "+enter_t+" �Դϴ�.");
		System.out.printf("�� �ݾ��� %d�� �Դϴ�.\n", totalFee(membership));
		Guest guest = new Guest(num,food_num,membership,enter_t,totalFee(membership));
		g.add(guest);
	}
	int totalFee(String m) {
		int fee=0;
		for(int i=0;i<food_num.length;i++) {
			fee = fee+ price[i]*food_num[i];
		}
		if(m.equalsIgnoreCase("y")) fee=(int)(fee*0.9);
		if(fee<100000) fee=(int)(fee*1.07);
		else fee =(int)(fee*1.1);
		fee=(int)(fee*1.1);
		return fee;
	}
	void show() {
		System.out.println("��ȣ\t�մԼ�\t������ũ\t���İ�Ƽ\t�Ľ�Ÿ\t�����\t�����ݾ�\t����ð�");
		for(int i=0;i<g.size();i++) {
			System.out.printf("[%d]\t %d\t", i+1,g.get(i).number);
			for(int j=0;j<g.get(i).food_n.length;j++) {
				System.out.printf("% d\t", g.get(i).food_n[j]);
			}
			System.out.printf(" "+g.get(i).membership+"\t%d "+g.get(i).enter_time+"\n",g.get(i).fee);
		}
	}
	void pay() {
		show();
		System.out.printf("==> �����Ͻ� ��ȣ�� �Է��ϼ���: ");
		int choice = s.nextInt();
		g.remove(g.get(choice-1));
		System.out.println("==> �����Ϸ�Ǿ����ϴ�.");
	}
}
