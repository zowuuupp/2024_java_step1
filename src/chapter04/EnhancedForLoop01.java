package chapter04;

public class EnhancedForLoop01 {

	public static void main(String[] args) {
		
		String strArray[]={"Java","Oracle","HTML5","CSS","JSP","Spring","Python"};
		
		for(int i=0;i<strArray.length;i++) {
			
			System.out.println(strArray[i]);
			
		}
		
		System.out.println();
		
		//Ȯ��for��
		for(String lang : strArray) { //strArray�� ���� �ͼ� lang�� �ѱ��.
			
			System.out.println(lang);
			
		}
		
		
		
		
	}

}
