package park_;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		String mode;

		while (true) {
			System.out.println("1. 전원 : on");
			System.out.println("2. 전원 :off");

			num = input.nextInt();

			if(num==1) {
				System.out.println("전원이 켜졌습니다");
				System.out.println("모드 설정: 회전or고정");
				mode =input.next();

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

