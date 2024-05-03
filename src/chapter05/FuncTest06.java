package chapter05;

public class FuncTest06 { //FuncTest05 복습 겸 추가로 하는것.
	
		//멤버변수=필드 (this로 대입연산)
		public String channel;
		public int channelInt;		
		public int volume;
		
		//생성자 생략(디폴트 생성자이기 때문에 자동 생성)
		
		//메소드
		public int channelUp(int volume) {
			this.volume = volume; // 마치 위에 멤버변수 public int volume =5; 로 사용하는 꼴이다? 이거 없어도 결과값은 똑같이 나온다. 허나 다른 사람도 쓰라고 대입연산을 하는거다?
			System.out.println("소리를 높이겠습니다.");
			return volume+2;
			
		}
		public void channelDown(int volume) {
			this.volume=volume;
			System.out.println("소리를 내리겠습니다.");
			System.out.println("소리를 "+volume+"만큼 내립니다.");
			
		}
		
		public static void main(String[] args) {
			
			FuncTest06 tv=new FuncTest06();
			int a=5;
			int b=9;
			System.out.println("소리를 "+tv.channelUp(a)+"만큼 올립니다.");
			System.out.println("===========================");
			int volume1=tv.channelUp(b);
			System.out.println("소리를 "+volume1+"만큼 올립니다.");
			//void 메소드 호출
			tv.channelDown(b);
			
		}
		
		
		
		
}


