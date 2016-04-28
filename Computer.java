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
					setPlayerName("刘备");
					break;
				case 2:
					setPlayerName("孙权");

					break;
				case 3:
					setPlayerName("曹操");
					break;
					
				}break;

			} else
				System.out.println("输入错误，请重新输入！！！");

		}

	}

	public int myFist() {
		int number = (int) (Math.random() * 3 + 1);
		return number;
	}
}
