package ch02.sec04;

/**
 
 실수 타입에는 float 과 double이 있다.
 타입    |     메모리 크기      |     저장되는 값의 허용 범위(양수 기준)        |      유효 소수 이하 자리     | 
 float	  4byte    32bit		1.4 * 10의 - 45승 ~ 3.4 * 10의 38승		     7자리
 double   8byte    64bit		4.9 * 10의 - 324승 ~ 1.8*10의 308승			 15자리
 
 */

public class FloatDoubleExample {
	public static void main(String[] args) {
		
		float var1 = 0.1234567890123456789f;
		double var2 = 0.1234567890123456789;
		
		double var3 = 3e6;
		float var4 = 3e6F;
		double var5 = 2e-3;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
	}
}
