package chapter06;

import java.util.Calendar;

public class EnumWeekMain {

	public static void main(String[] args) {

		Week today = null;
		Calendar cal = Calendar.getInstance();//�ѱ��� �������
		int week = cal.get(Calendar.DAY_OF_WEEK); // 1~7

		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}//switch , ctrl a �� ctrl shift f ������ ���ڰ� ���ĵȴ�. 
		System.out.println("������ ���� : "+today);
		if(today==Week.SUNDAY) {
			System.out.println("������ �߷���");
		}
		else {
			System.out.println("��ó�� ����");
		}
		
	}

}
