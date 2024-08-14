package day08;

import java.util.Scanner;

public class suntest {

	Scanner scan = new Scanner(System.in);
	int num;
	String mode;


	public void input() {
		while(true) {
			System.out.println("1. 전원");
			System.out.println("2. 바람세기");
			System.out.println("3. 타이머");
			num = scan.nextInt();
			switch(num) {
			case 1: //전원
				Ona();
				break;

			case 2: //풍량
				air();
				break;

			case 3: //타이머
				display();
				break;
			}

		}
	}

	public void air() {
		int a = 0;
		while(true) {
			System.out.println("바람세기 설정");
			System.out.println("버튼을 눌러주세요 : \"0\"");
			System.out.println("메인메뉴로 나가기>>>(1입력)");
			num = scan.nextInt();
			if(num == 0) {
				a++;
			}else {
				break;
			}
			if (a == 1) {
				System.out.println("중\n");
			}
			if (a == 2) {
				System.out.println("강\n");
			}

			if (a == 3) {
				System.out.println("약\n");
				a = 0;
			}
		}
	}
	
	public void Ona() {
	while (true) {
		System.out.println("1. 전원 : on");
		System.out.println("2. 전원 :off");

		num = scan.nextInt();

		if(num==1) {
			System.out.println("전원이 켜졌습니다\n");
			System.out.println("모드 설정: 회전or고정");
			mode = scan.next();

			if(mode.equals("회전")) {
				System.out.println("회전 모드입니다\n");
			}
			else if(mode.equals("고정")) {
				System.out.println("고정 모드입니다\n");
			}
			else {
				System.out.println("다시 입력해주세요.\n");
			}				  
			break;
		}

		if(num==2)	{			
			System.out.println("전원이 꺼졌습니다");
			return;
		}
	}
}
		public void display() {
			String star, enter; int i = 0;
			
			System.out.println("타이머 설정");
			while(true) {
				System.out.println("\"*\"버튼 입력");
				System.out.print(" >>> : ");
				star = scan.next();
				//System.out.println(star);
				if(star.equals("*")) {
					i++;
					//System.out.println(i);
					if(i==1) {
						System.out.println("0.5H");
						System.out.println("\"확인(@)\"버튼 눌러서 확인");
						enter = scan.next();
						if(enter.equals("@")) {
							System.out.println("0.5H 타이머 설정 완료\n");
							break;
						}
					}else if(i==2) {
						System.out.println("1H");
						System.out.println("\"확인(@)\"버튼 눌러서 확인");
						enter = scan.next();
						if(enter.equals("@")) {
							System.out.println("1H 타이머 설정 완료\n");
							break;
						}
					}else if(i==3) {
						System.out.println("2H");
						System.out.println("\"확인(@)\"버튼 눌러서 확인");
						enter = scan.next();
						if(enter.equals("@")) {
							System.out.println("2H 타이머 설정 완료\n");
							break;
						}
					}else if(i==4) {
						System.out.println("3H");	
						System.out.println("\"확인(@)\"버튼 눌러서 확인");
						enter = scan.next();
						if(enter.equals("@")) {
							System.out.println("3H 타이머 설정 완료\n");
							break;
						}
					}else if(i==5) {
						System.out.println("4H");	
						System.out.println("\"확인(@)\"버튼 눌러서 확인");
						enter = scan.next();
						if(enter.equals("@")) {
							System.out.println("4H 타이머 설정 완료\n");
							break;
						}
					}else {
						i=0;
					}
				}
			}
		}
	}