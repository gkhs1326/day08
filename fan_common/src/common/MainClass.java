package common;

import java.util.Scanner;
import jung.Timer;

public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Timer t = new Timer();
		int num;
		while(true) {
			System.out.println("1. 전원");
			System.out.println("2. 회전");
			System.out.println("3. 바람세기");
			System.out.println("4. 타이머");
			System.out.print(">>> : ");
			num = input.nextInt();
			switch(num) {
			case 1: break;
			case 2: break;
			case 3: break;
			case 4: 
				t.display();
				break;
			}
		}
	}
}
