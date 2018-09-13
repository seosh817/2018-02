package test1;

import java.util.Scanner;
public class WonToDollar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>>>");
		System.out.print("원화를 입력하세요(단위 원)>>>");
		double won = scanner.nextDouble();
		System.out.printf("%.0f원은 $%.0f.%.0f입니다." ,won,won/1100,won%1100);
		scanner.close();
	}

}
