package ch02.sec03;

/**
 문자 타입, 하나의 문자를 작은따옴표로 감싼 것을 문자 리터럴이라 한다. char타입을 제공 , 유니코드가 정수 이므로 char 타입도 정수에 속함
 */

public class CharExample {
	public static void main(String[] args) {
		
		char var1 = 'A'; 	// 문자 저장
		char var2 = 65;  	// 유니코드 직접 저장
		char var3 = '가'; 	// 문자 저장
		char var4 = 44032;	// 유니코드 직접 저장 
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
	}
}
