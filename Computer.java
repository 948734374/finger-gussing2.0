package fdsf;

import java.util.Scanner;

public class Computer extends Player {


	public void inputName() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		while (true) {
			if (n == 1 || n == 2 || n == 3) {

				switch (n) {
				case 1:
					setPlayerName("����");
					break;
				case 2:
					setPlayerName("��Ȩ");

					break;
				case 3:
					setPlayerName("�ܲ�");
					break;
					
				}break;

			} else
				System.out.println("����������������룡����");

		}

	}

	public int myFist() {
		int number = (int) (Math.random() * 3 + 1);
		return number;
	}
}
