package fdsf;

import java.util.Scanner;

public class Judge {
	private int total = 0;
	Computer computer = null;
	Person person = null;
	Scanner input = null;


	public void startGame() {
		System.out.println("��ӭ������ȭ����");
		System.out.println("*************");
		System.out.println("**��ȭ����ʼ**");
		System.out.println("*************");
		System.out.println("��ȭ����1:����          2:ʯͷ            3:��");
		

	}

	public void askName() {
		Person person = new Person();
		Computer computer = new Computer();
		person.inputName();

		System.out.println("��ѡ����ϲ���ĶԷ���ɫ1������     2����Ȩ     3���ܲ�");
		computer.inputName();
		
		//*********************************************************************
		//this.computer��ȫ�ֱ�����computer��askName()�еľֲ�����
		//�����֪�������аٶ�thisָ��
		this.computer = computer;
		this.person = person;

	}

	public void playGame() {
		System.err.println("�Ƿ�ʼ��Ϸ��y/n��");

		input = new Scanner(System.in);
		String m = input.nextLine();

		System.out.println(m);
		
		//******* Java�Ƚ��ַ���ʱ��==��equals��ͬ�� *********** 
		while ("y".equals(m)) {
			
			System.out.println("����ѭ���ˣ�");//�������ԣ��Ժ�ɾ��
			
			
			//*********************************************************************
			//************************ ����*************************
			//*********************************************************************
			System.out.println(person.getPlayerName() + "VS"
					+ computer.getPlayerName() + "��ս");
			System.out.println("���ȭ��1:����         2:ʯͷ       3:��");
			int n = person.myFist();
			while (true) {
				if (n == 1 || n == 2 || n == 3) {
					switch (n) {
					case 1:
						System.out.println("���ȭ������");
						break;
					case 2:
						System.out.println("���ȭ��ʯͷ");

						break;
					case 3:
						System.out.println("���ȭ����");

						break;

					}
					break;
				} else
					System.out.println("����������������룡����");
			}
			int x = computer.myFist();
			switch (x) {
			case 1:
				System.out.println(computer.getPlayerName() + "��ȭ������");
				break;
			case 2:
				System.out.println(computer.getPlayerName() + "��ȭ��ʯͷ");

				break;
			case 3:
				System.out.println(computer.getPlayerName() + "��ȭ����");

				break;

			}
			if (n == x) {
				System.out.println("����ƽ��");

			} else {
			//switchע���ʽ
			/*	switch(x){
					case 1:{
					 xxxxxxxxxxxxx;
					}
				}
				*/
				switch (n) {
				case 1: {
					if (x == 2)
						System.out.println("������");
					computer.setWinningTimes(computer.getWinningTimes() + 1);
				}
					break;
				case 2: {
					if (x == 3)
						System.out.println("������");
					computer.setWinningTimes(computer.getWinningTimes() + 1);
				}
					break;
				case 3: {
					if (x == 1)
						System.out.println("������");
					computer.setWinningTimes(computer.getWinningTimes() + 1);
				}
					break;

				default:
					System.out.println("ϵͳ������Ȼ��̫���ܣ������һ���д��");
					break;
				}
				System.out.println("��ϲ�㣬���ʤ��������");
				person.setWinningTimes(person.getWinningTimes() + 1);
				total++;
			}
		}
	}

	public void finalResult() {
		System.out.println(computer.getPlayerName() + "VS"
				+ person.getPlayerName());
		System.out.println("��ս����" + total);
		System.out.println("����          �÷�");
		System.out.println(person.getPlayerName() + "          "
				+ person.getWinningTimes());
		System.out.println(computer.getPlayerName() + "          "
				+ computer.getWinningTimes());
		if (person.getWinningTimes() < computer.getWinningTimes())
			System.out.println("������Ǻǣ��������´μ��Ͱ���");
		else if (person.getWinningTimes() > computer.getWinningTimes())
			System.out.println("������Ǻǣ��������");
		else
			System.out.println("ƽ��");
	}

}