package chapter04;

public class EnhancedForLoop01 {

	public static void main(String[] args) {
		
		String strArray[]={"Java","Oracle","HTML5","CSS","JSP","Spring","Python"};
		
		for(int i=0;i<strArray.length;i++) {
			
			System.out.println(strArray[i]);
			
		}
		
		System.out.println();
		
		//확장for문
		for(String lang : strArray) { //strArray를 가져 와서 lang에 넘긴다.
			
			System.out.println(lang);
			
		}
		
		
		
		
	}

}
