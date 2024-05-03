package chapter05;

public class FuncExample03 {
	
	public double calculateAverage(int[] a) {
		int sum=0;
		for (int i=0; i<a.length;i++) {
			sum += a[i] ;
		}
		double avg = (double)sum / a.length;
		return avg;
	}

	public static void main(String[] args) {
		FuncExample03 calculator = new FuncExample03();
		
		int[] numbers = {5,10,15,20,25};
		double average = calculator.calculateAverage(numbers);
		System.out.println("¹è¿­ÀÇ Æò±Õ : "+average);
		
		
		
	}

}
