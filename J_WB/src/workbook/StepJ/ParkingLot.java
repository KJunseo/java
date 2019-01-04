package workbook.StepJ;

import java.util.Scanner;

public class ParkingLot {
	private int car_count=0;
	private int total_fee=0;

	public ParkingLot() {
		manager();
	}
	void manager() {
		int start_h, start_m;
		int end_h, end_m;
		String ans;
		Scanner s = new Scanner(System.in);
		while(true) {
			car_count++;
			System.out.printf("%d번 차량 주차 시작 시간 (시 분): ", car_count);
			start_h = s.nextInt();
			start_m = s.nextInt();
			System.out.printf("%d번 차량 주차 종료 시간 (시 분): ", car_count);
			end_h = s.nextInt();
			end_m = s.nextInt();
			System.out.printf("주차요금: %d원\n", CalcParking(start_h, start_m, end_h, end_m));
			total_fee+=CalcParking(start_h, start_m, end_h, end_m);
			System.out.printf("더 입력하시겠습니까?(Y/N) ");
			ans=s.next();
			if(ans.equalsIgnoreCase("n")) break;
		}
	}
	int CalcParking(int start_h, int start_m, int end_h, int end_m) {
		int total_m;
		int fee;
		if(end_m<start_m) {
			end_h--;
			end_m+=60;
		}
		total_m = (end_h - start_h)*60 + (end_m - start_m);
		fee = (total_m/10)*500;
		if(total_m%10>0) fee+=500;
		return fee;
	}
	
	public void totalFee() {
		System.out.printf("주차 차량 %d대의 총 주차 요금은 %d원 입니다.\n", car_count,total_fee);
	}
}
