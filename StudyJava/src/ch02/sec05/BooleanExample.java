package ch02.sec05;

/**
 논리 타입 true와 false로 상태값에 따라 조건문과 제어문의 실행 흐름을 변경하는데 사용.
 */

public class BooleanExample {
	public static void main(String[] args) {
		
		boolean stop = true;
		
		if(stop) {
			System.out.println("변수가 if문 안에서 true인 경우");
		} else {
			System.out.println("변수가 if문 안에서 false인 경우");
		}
		
		int x = 10;
		boolean result1 = (x == 20);
		boolean result2 = (x != 20);
		
		System.out.println(result1);
		System.out.println(result2);
	}
}
