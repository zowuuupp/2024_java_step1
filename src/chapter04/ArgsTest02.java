package chapter04;

public class ArgsTest02 {

	public static void main(String[] args) {
		
		//배열 선언1
		int a[]=new int[5];
		
		//배열 선언2(실제로는 이걸 쓴다. 몇개를 배분 할지 시작할때 부터 알기는 힘들다.)
		int b[]; //선언
		// ........
		b=new int[5];
		
		int aVal;
		int bVal;
		int Tot;
		
		//배열 선언3(매개변수 활용)
		args=new String[2]; // 본래 args 앞에 String이 있어야 한다. 근데 된다. 이유는 main에서 가져오는 것이기 때문이다. 위에 이미 선언이 되어있다.
		args[0]="1"; //[0] 첨자, 인덱스번호 / "1" 요소 라고 한다.
		args[1]="2";
		
		if(args.length == 2) { // length 자주 쓴다.
			aVal=Integer.parseInt(args[0]);
			bVal=Integer.parseInt(args[1]);
		}else {
			aVal=0;
			bVal=0;
		}
		
		Tot=aVal+bVal;
		System.out.println(Tot);
		
		
		//배열 선언4
		String[] str;
		str=new String[10];
		
		
		
	}

}
