package workbook.StepJ;

public class GoldenRatio {
	private final static int NUM = 20;
	private final static double CONDITION = 0.000001;
	
	public GoldenRatio() {
		input();
	}
	void input() {
		double previous=0,current=0;
		for(int i=2;i<NUM;i++) {
			previous = current;
			current = g_Ratio(i);
			System.out.printf("%d번째 비율 (%d/%d): %f\n",i,fibonacci(i+1),fibonacci(i),g_Ratio(i));
			if(Math.abs(previous-current)<CONDITION)break;
		}
	}
	int fibonacci(int n) {
		if(n==1||n==2) return 1;
		else return fibonacci(n-1) + fibonacci(n-2);
	}
	double g_Ratio(int n) {
		return (double)fibonacci(n+1)/(double)fibonacci(n);
	}
}
