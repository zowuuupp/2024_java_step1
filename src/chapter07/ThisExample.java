package chapter07;

public class ThisExample {
	
	int day;
	int month;
	int year;
	
	public ThisExample() {
		// TODO Auto-generated constructor stub
	}
	
	public ThisExample(int year, int month, int day) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		
		ThisExample birth1=new ThisExample(2024,03,07);
		birth1.printThis();//��ü�� �ּҹ�ȯ
		System.out.println("������� : "+birth1.year+"."+birth1.month+"."+birth1.day);
		
		ThisExample birth2=new ThisExample();
		birth2.printThis();//��ü�� �ּҹ�ȯ
		birth2.setYear(2024);
		birth2.setMonth(8);
		birth2.setDay(14);
		System.out.println("������� : "+birth2.year+"."+birth2.month+"."+birth2.day);
		
		ThisExample birth3=new ThisExample(2024,5,8);
		birth3.printThis();//��ü�� �ּҹ�ȯ
		birth3.setYear(2024);
		birth3.setMonth(12);
		birth3.setDay(24); //�����ڷ� �ʱ�ȭ�� �س��� �ٽ� �߰��� �ʱ�ȭ ����
		System.out.println("������� : "+birth3.year+"."+birth3.month+"."+birth3.day);
		
		
	}

}
