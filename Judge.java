package fdsf;

import java.util.Scanner;

public class Judge {
	private int total = 0;
	Computer computer = null;
	Person person = null;
	Scanner input = null;


	public void startGame() {
		System.out.println("欢迎来到猜拳世界");
		System.out.println("*************");
		System.out.println("**猜拳，开始**");
		System.out.println("*************");
		System.out.println("出拳规则：1:剪刀          2:石头            3:布");
		

	}

	public void askName() {
		Person person = new Person();
		Computer computer = new Computer();
		person.inputName();

		System.out.println("请选择你喜欢的对方角色1：刘备     2：孙权     3：曹操");
		computer.inputName();
		
		//*********************************************************************
		//this.computer是全局变量，computer是askName()中的局部变量
		//如果不知道，自行百度this指针
		this.computer = computer;
		this.person = person;

	}

	public void playGame() {
		System.err.println("是否开始游戏（y/n）");

		input = new Scanner(System.in);
		String m = input.nextLine();

		System.out.println(m);
		
		//******* Java比较字符串时，==和equals不同！ *********** 
		while ("y".equals(m)) {
			
			System.out.println("进入循环了！");//用来测试！以后删了
			
			
			//*********************************************************************
			//************************ 待改*************************
			//*********************************************************************
			System.out.println(person.getPlayerName() + "VS"
					+ computer.getPlayerName() + "对战");
			System.out.println("请出拳：1:剪刀         2:石头       3:布");
			int n = person.myFist();
			while (true) {
				if (n == 1 || n == 2 || n == 3) {
					switch (n) {
					case 1:
						System.out.println("你出拳：剪刀");
						break;
					case 2:
						System.out.println("你出拳：石头");

						break;
					case 3:
						System.out.println("你出拳：布");

						break;

					}
					break;
				} else
					System.out.println("输入错误，请重新输入！！！");
			}
			int x = computer.myFist();
			switch (x) {
			case 1:
				System.out.println(computer.getPlayerName() + "出拳：剪刀");
				break;
			case 2:
				System.out.println(computer.getPlayerName() + "出拳：石头");

				break;
			case 3:
				System.out.println(computer.getPlayerName() + "出拳：布");

				break;

			}
			if (n == x) {
				System.out.println("你们平局");

			} else {
			//switch注意格式
			/*	switch(x){
					case 1:{
					 xxxxxxxxxxxxx;
					}
				}
				*/
				switch (n) {
				case 1: {
					if (x == 2)
						System.out.println("你输了");
					computer.setWinningTimes(computer.getWinningTimes() + 1);
				}
					break;
				case 2: {
					if (x == 3)
						System.out.println("你输了");
					computer.setWinningTimes(computer.getWinningTimes() + 1);
				}
					break;
				case 3: {
					if (x == 1)
						System.out.println("你输了");
					computer.setWinningTimes(computer.getWinningTimes() + 1);
				}
					break;

				default:
					System.out.println("系统错误，虽然不太可能，但是我还是写了");
					break;
				}
				System.out.println("恭喜你，获得胜利！！！");
				person.setWinningTimes(person.getWinningTimes() + 1);
				total++;
			}
		}
	}

	public void finalResult() {
		System.out.println(computer.getPlayerName() + "VS"
				+ person.getPlayerName());
		System.out.println("对战次数" + total);
		System.out.println("姓名          得分");
		System.out.println(person.getPlayerName() + "          "
				+ person.getWinningTimes());
		System.out.println(computer.getPlayerName() + "          "
				+ computer.getWinningTimes());
		if (person.getWinningTimes() < computer.getWinningTimes())
			System.out.println("结果：呵呵，笨笨，下次加油啊！");
		else if (person.getWinningTimes() > computer.getWinningTimes())
			System.out.println("结果：呵呵，你真棒！");
		else
			System.out.println("平局");
	}

}