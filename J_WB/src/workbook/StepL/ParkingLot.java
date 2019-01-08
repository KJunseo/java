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
		System.out.printf("������ �� �ִ� ���� ������ �Է��ϼ���. ");
		spare = s.nextInt();
		System.out.printf("�� %d�븦 ������ �� �ֽ��ϴ�.\n\n", spare);
		System.out.println("--------------------------------------");
		while(true) {
			System.out.printf("1)���� 2)���� 3)����Ʈ 4)���� �� ���� 5)���� �ܿ� ���� 6)���� ==> ");
			int select = s.nextInt();
			System.out.println("--------------------------------------");
			switch(select) {
			case 1:
				enter();
				System.out.printf("[%d��]"+enter_t+" ���� �Ǿ����ϴ�.\n\n",total_num+1);
				spare--;
				total_num++;
				break;
			case 2:
				out();
				spare++;
				total_num--;
				System.out.println("==>����Ǿ����ϴ�.\n");
				break;
			case 3:
				show();
				System.out.printf("%d�� ��������.\n",spare);
				break;
			case 4:
				total();
				break;
			case 5:
				spare();
				break;
			case 6:
				System.out.println("����Ǿ����ϴ�.");
				System.exit(0);
			}
		}
	}
	void enter() {
		System.out.printf("������ ���� ��ȣ�� ������ �Է��ϼ���. ");
		int car_num = s.nextInt();
		String car_kind = s.next();
		enter_t = time.format(new Date());
		Car car = new Car(car_num,car_kind,enter_t);
		c.add(car);
	}
	void out() {
		show();
		System.out.printf("==>���� ��ȣ�� �Է��ϼ���: ");
		int num = s.nextInt();
		String end_t = time.format(new Date());;
		System.out.printf("==>���� �ð��� "+end_t+"�̹Ƿ� �����ݾ��� %d�� �Դϴ�.\n", getFee(num,end_t));
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
			System.out.printf("[%d��] " + c.get(i).car_number +" "+c.get(i).kind+" "+c.get(i).enter_time,i+1);
			System.out.println();
		}
	}
	void total() {
		System.out.printf("�� %d�밡 �����Ǿ� �ֽ��ϴ�.\n",total_num);
	}
	void spare() {
		System.out.printf("���� ������ �ڸ��� %d�� �Դϴ�.\n",spare);
	}
}
