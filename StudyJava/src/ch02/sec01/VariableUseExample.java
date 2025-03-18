package ch02.sec01;

/**
 변수 (Variable) 메모리 번지에 붙여진 이름
 
 자바의 변수는 다양한 타입의 값을 저장할 수 없다. 즉 같은 타입만 가능하다.
 */

public class VariableUseExample {
	public static void main(String[] args) {
		int value = 30;
		
		int result = value + 10;
		
		System.out.println(result);
		
		int hour = 6;
		int minute = 51;
		int totalminute = (hour*60) + minute;
		
		System.out.println("현재 시각은 " + hour + "시, " + minute + "분 입니다.");
		System.out.println("총 " + totalminute + "분 입니다.");
		System.out.println("");
		System.out.println("");
		
// temp 임시 변수를 선언하여 x,y 값을 변환 시켜보기.
		
		int x = 5;
		int y = 7;
		System.out.print("X:" + x );
		System.out.println(" Y:" + y );
				
		int temp = x;
		x = y;
		y = temp;
		
		System.out.print("X:" + x );
		System.out.println(" Y:" + y );
	}
}
