package workbook.StepL;

public class Guest {
	String membership;
	String enter_time;
	int number=0;
	int food_n[] = {0,0,0};
	int fee=0;
	
	public Guest(int n, int [] f, String m, String t,int price) {
		number = n;
		for(int i=0;i<food_n.length;i++) {
			food_n[i] = f[i];
		}
		membership = m;
		enter_time = t;
		fee = price;
	}
}
