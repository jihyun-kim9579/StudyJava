package ch02.sec02;

/**
 Long 타입은 수치가 큰 데이터, 기본적으로 정수 타입값으로 간주 , int타입 허용 범위인 ( -2,147,483,648 ~ 2,147,483,647 )을
 	
 	초과하게 되면 뒤에 Long 을 붙여야 한다.
 */
public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20;
//		long var3 = 10000000000;  // The literal 10000000000 of type int is out of range 범위 초과
		long var4 = 10000000000L; // 뒤에 L을 붙임으로서 long 타입 값임을 컴파일러에게 알려줌
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
