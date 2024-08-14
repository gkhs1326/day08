package jung;

import java.util.Scanner;

public class Timer {
	public void display() {
		Scanner input = new Scanner(System.in);
		String star, enter; int i = 0;
		
		System.out.println("타이머 설정");
		while(true) {
			System.out.println("\"*\"버튼 입력");
			System.out.print(">>> : ");
			star = input.next();
			//System.out.println(star);
			if(star.equals("*")) {
				i++;
				//System.out.println(i);
				if(i==1) {
					System.out.println("0.5H");
					System.out.println("\"확인(@)\"버튼 눌러서 확인");
					enter = input.next();
					if(enter.equals("@")) {
						System.out.println("0.5H 타이머 설정 완료");
					}
				}else if(i==2) {
					System.out.println("1H");
					System.out.println("\"확인(@)\"버튼 눌러서 확인");
					enter = input.next();
					if(enter.equals("@")) {
						System.out.println("1H 타이머 설정 완료");
					}
				}else if(i==3) {
					System.out.println("2H");
					System.out.println("\"확인(@)\"버튼 눌러서 확인");
					enter = input.next();
					if(enter.equals("@")) {
						System.out.println("2H 타이머 설정 완료");
					}
				}else if(i==4) {
					System.out.println("3H");	
					System.out.println("\"확인(@)\"버튼 눌러서 확인");
					enter = input.next();
					if(enter.equals("@")) {
						System.out.println("3H 타이머 설정 완료");
					}
				}else if(i==5) {
					System.out.println("4H");	
					System.out.println("\"확인(@)\"버튼 눌러서 확인");
					enter = input.next();
					if(enter.equals("@")) {
						System.out.println("4H 타이머 설정 완료");
					}
				}else {
					i=0;
				}
			}
		}
	}
}
