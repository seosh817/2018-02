package test1;

import java.util.Scanner;
public class WonToDollar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>>");
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>>");
		double won = scanner.nextDouble();
		System.out.printf("%.0f���� $%.0f.%.0f�Դϴ�." ,won,won/1100,won%1100);
		scanner.close();
	}

}
