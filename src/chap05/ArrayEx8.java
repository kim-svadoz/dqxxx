package chap05;
//섞기2(shuffle) - 로또 번호를 생성하는ㅇ ㅖ제

public class ArrayEx8 {
	public static void main(String[] args) {
		int[] ball = new int[45]; // 45개의 정수값을 저장하기 위한 배열 생성
		
		for(int i=0;i<ball.length;i++) {
			ball[i]=i+1; // ball[0]에 1이 저장된다.
		}
		
		int temp = 0; // 두 값을 바꾸는데 사용할 임시변수
		int j = 0; // 임의의 값을 얻어서 저장할 변수
		
		// 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 섞는다.
		// 0번째 부터 5번째 요소까지 모두 6개만 바꾼다.
		for(int i=0;i<6;i++) {
			j=(int)(Math.random()*45); // 0~44범위의 임의의 값을 얻는다.
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp; // ball[i]와 ball[j]의 값을 서로 바꾼다.
		}
		
		for(int i=0;i<6;i++) {
			System.out.println("ball["+i+"]="+ball[i]);
		}
	}
}
