package chapter06;

public class TakeTrans {

	public static void main(String[] args) {
		
		//학생 2명 생성
		
		StdInfo studentJames= new StdInfo("James",12000);
		StdInfo studentTom= new StdInfo("Tom",10000);
		
		//버스타기
		Bus bus100 = new Bus(100);
		
		studentJames.takeBus(bus100);
		
		//James 정보 확인
		studentJames.showInfo();//지출
		bus100.showInfo();//수입증가, 인원수 증가
		System.out.println("===================================");
		
		Bus bus999 = new Bus(999);
		
		studentTom.takeBus(bus999);
		studentTom.showInfo();//지출
		bus999.showInfo();//수입증가, 인원수 증가
		
		System.out.println("===================================");
		//지하철 타기
		
		Subway subwayGreen = new Subway("2호선");
		
		studentTom.takeSubway(subwayGreen);
		studentTom.showInfo();
		subwayGreen.showInfo();
		
		System.out.println("===================================");
		Subway subwayOrange = new Subway("3호선");
		
		studentJames.takeSubway(subwayOrange);
		studentJames.showInfo();
		subwayOrange.showInfo();
		
		
		
	}

}
