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
			System.out.printf("1)주문 2)결제 3)리스트 4)종료 ==> ");
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
				System.out.println("종료되었습니다.");
				System.exit(0);
			}
		}
	}
	void order() {
		System.out.printf("손님 수를 입력하세요: ");
		int num = s.nextInt();
		System.out.printf("스테이크, 스파게티, 파스타의 개수를 입력하세요: ");
		for(int i=0;i<food_num.length;i++) {
			food_num[i] = s.nextInt();
		}
		System.out.printf("멤버쉽 카드가 있습니까?(Y:있음): ");
		String membership = s.next();
		String enter_t = time.format(new Date());
		System.out.println("들어오신 시간은 "+enter_t+" 입니다.");
		System.out.printf("총 금액은 %d원 입니다.\n", totalFee(membership));
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
		System.out.println("번호\t손님수\t스테이크\t스파게티\t파스타\t멤버쉽\t결제금액\t입장시간");
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
		System.out.printf("==> 결제하실 번호를 입력하세요: ");
		int choice = s.nextInt();
		g.remove(g.get(choice-1));
		System.out.println("==> 결제완료되었습니다.");
	}
}
