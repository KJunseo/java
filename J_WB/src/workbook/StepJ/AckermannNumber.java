package workbook.StepJ;

public class AckermannNumber {
	private final static int RANGE = 4;
	
	public AckermannNumber() {
		input();
	}
	void input() {
		for(int i=0;i<RANGE;i++)
			for(int j=0;j<RANGE;j++) {
				System.out.printf("Ackermann(%d, %d) = %d\n", i,j,Ackermann(i,j));
			}
	}
	int Ackermann(int i, int j) {
		if(i==0&&j>=0) return j+1;
		else if(i>0&&j==0) return Ackermann(i-1,1);
		else return Ackermann(i-1,Ackermann(i,j-1));
	}
}
