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

				break;
			}

		}
	}

	public void air() {
		int a = 0;
		while(true) {
			System.out.println("바람세기 설정");
			System.out.println("버튼을 눌러주세요 : \"0\"");
			num = scan.nextInt();
			if(num == 0) {
				a++;
			}else {
				System.out.println("잘못 입력하였습니다.\n");
				continue;
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
			System.out.println("전원이 켜졌습니다");
			System.out.println("모드 설정: 회전or고정");
			mode = scan.next();

			if(mode.equals("회전")) {
				System.out.println("회전 모드입니다");
			}
			else if(mode.equals("고정")) {
				System.out.println("고정 모드입니다");
			}
			else {
				System.out.println("다시 입력해주세요.");
                 
            
			}				  

		}

		if(num==2)	{			
			System.out.println("전원이 꺼졌습니다");


		}
	}


}

}