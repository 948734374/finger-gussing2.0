package fdsf;

import java.util.Scanner;

public class Person extends Player {


	public void inputName() {
		System.out.print("�������������");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		setPlayerName(name);

	}

	public int myFist() {
		System.out.print("���������ѡ��");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		return number;

	}

}
