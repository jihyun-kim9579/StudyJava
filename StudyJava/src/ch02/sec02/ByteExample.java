package ch02.sec02;

/**
 바이트 타입 변수에 허용 범위를 초과한 값을 대입 할때 , 오류가 발생
 */

public class ByteExample {
	public static void main(String[] args) {
		
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 127;
//		byte var5 = 128; //Type mismatch: cannot convert from int to byte 컴파일 에러가 난걸 볼 수 있다.
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
	}
	
}
