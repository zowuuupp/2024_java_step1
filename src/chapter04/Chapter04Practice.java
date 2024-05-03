package chapter04;

import javax.swing.JOptionPane;

public class Chapter04Practice {

	public static void main(String[] args) {
		
		/* ArraySumTest01
		int score[]= {98,90,87};
		int sum=0;
		
		for (int i=0 ; i<score.length;i++) {
			
			System.out.println("score["+i+"] : "+score[i]);
			sum+=score[i];
		}
		*/
		
		/* TwoDimension02
		// 입력 받은 점수를 대입연산을 이용하여 javaScore방에 저장하여라.
		
		int javaScore[][];
		javaScore=new int [2][3];
		
		for (int i=0;i<javaScore.length;i++) {
			
			for (int j=0; j<javaScore[i].length;j++) {
				
				int jumsu=Integer.parseInt(JOptionPane.showInputDialog("Java 점수를 입력하세요."));
				System.out.println("JavaScore["+i+"]"+"["+j+"] : "+jumsu);
			}
			System.out.println();
		}
		*/
		
		/*
		//확장for문
		
		String array[] = {"Java","Oracle","HTML5","CSS"};
		
		for (int i=0; i<array.length;i++) {
			
			System.out.println(array[i]);
		}
		
		for (String lang : array) {
			
			System.out.println(lang);
		}
		*/
		
		
		
		
		
		
		
		
		
	}

}
