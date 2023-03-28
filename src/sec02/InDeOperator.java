package sec02;

import com.sun.corba.se.spi.activation._ActivatorImplBase;

/**
 * 산술 연산자, 증감연산자 예제
 */

public class InDeOperator {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++; // x인 10에 1을 두번 더함
		++x;
		System.out.println("x=" + x); // 12
		
		System.out.println("------------------------------");
		y--; // y인 10에 1을 두번 뺌
		--y;
		System.out.println("y=" + y); // 8
		
		System.out.println("------------------------------");
		z = x++;
		System.out.println("z=" + z);  // 12
		System.out.println("x=" + x);  // 13
		////////////////////////////////////////////////////////////
		System.out.println("------------------------------");
		z = ++x;
		System.out.println("z=" + z); // z = 14
		System.out.println("x=" + x); // x = 14  y = 8
		
		System.out.println("-------------------------------");
		z = ++x + y++;
		System.out.println("z=" + z); // 23
		System.out.println("x=" + x); // 15
		System.out.println("y+" + y); // 9
		
		
		
	}

}
