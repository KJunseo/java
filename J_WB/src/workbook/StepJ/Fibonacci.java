package workbook.StepJ;

public class Fibonacci {
	private final static int NUM = 20;
	
	public Fibonacci() {
		input();
	}
	void input() {
		System.out.printf("1���� %d���� �Ǻ���ġ ���� ������ �����ϴ�.\n",NUM);	
		for(int i=0;i<NUM;i++) {
			System.out.printf("%d��°: ", i+1);
			System.out.println(fibonacci(i+1));
		}
	}
	int fibonacci(int n) {
		if(n==1||n==2) return 1;
		else return fibonacci(n-1) + fibonacci(n-2);
	}
}
