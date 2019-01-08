package workbook.StepL;

import java.util.*;
import java.text.*;

public class ParkingLot {
	Scanner s = new Scanner(System.in);
	ArrayList<Car> c = new ArrayList<Car>();
	SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm",Locale.US);
	
	int total_num=0;
	int spare=0;
	String enter_t;
	
	public ParkingLot() {
		System.out.printf("주차할 수 있는 차의 개수를 입력하세요. ");
		spare = s.nextInt();
		System.out.printf("총 %d대를 주차할 수 있습니다.\n\n", spare);
		System.out.println("--------------------------------------");
		while(true) {
			System.out.printf("1)입차 2)출차 3)리스트 4)입차 총 개수 5)주차 잔여 개수 6)종료 ==> ");
			int select = s.nextInt();
			System.out.println("--------------------------------------");
			switch(select) {
			case 1:
				enter();
				System.out.printf("[%d번]"+enter_t+" 입차 되었습니다.\n\n",total_num+1);
				spare--;
				total_num++;
				break;
			case 2:
				out();
				spare++;
				total_num--;
				System.out.println("==>정산되었습니다.\n");
				break;
			case 3:
				show();
				System.out.printf("%d대 주차가능.\n",spare);
				break;
			case 4:
				total();
				break;
			case 5:
				spare();
				break;
			case 6:
				System.out.println("종료되었습니다.");
				System.exit(0);
			}
		}
	}
	void enter() {
		System.out.printf("입차할 차의 번호와 차종을 입력하세요. ");
		int car_num = s.nextInt();
		String car_kind = s.next();
		enter_t = time.format(new Date());
		Car car = new Car(car_num,car_kind,enter_t);
		c.add(car);
	}
	void out() {
		show();
		System.out.printf("==>출차 번호를 입력하세요: ");
		int num = s.nextInt();
		String end_t = time.format(new Date());;
		System.out.printf("==>현재 시간은 "+end_t+"이므로 주차금액은 %d원 입니다.\n", getFee(num,end_t));
		c.remove(c.get(num-1));
	}
	int getFee(int num, String t) {
		int fee=0;
		try {
			Date start = time.parse(c.get(num-1).enter_time);
			Date end = time.parse(t);
			long diff = end.getTime()-start.getTime();
			long diffMin = diff/(60*1000);
			if(diffMin<10)fee=0;
			else 
				if(diffMin%10==0) fee = 500*((int)diffMin/10)-500;
				else 
					fee = (500*((int)diffMin/10));
		}catch(ParseException e) {
			e.printStackTrace();
		}
		return fee;
	}
	void show() {
		for(int i=0;i<c.size();i++) {
			System.out.printf("[%d번] " + c.get(i).car_number +" "+c.get(i).kind+" "+c.get(i).enter_time,i+1);
			System.out.println();
		}
	}
	void total() {
		System.out.printf("총 %d대가 주차되어 있습니다.\n",total_num);
	}
	void spare() {
		System.out.printf("주차 가능한 자리는 %d곳 입니다.\n",spare);
	}
}
