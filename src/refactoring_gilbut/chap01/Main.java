package refactoring_gilbut.chap01;

import refactoring_gilbut.chap01.after.Robot;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		before();
		System.out.println("afterMain()");
		Robot robot = new Robot("Andrew");
		robot.order(Robot.COMMAND_WALK);
		robot.order(Robot.COMMAND_STOP);
		robot.order(Robot.COMMAND_JUMP);

	}

	private static void before() {
		System.out.println("beforeMain()");
		refactoring_gilbut.chap01.before.Robot robot = new refactoring_gilbut.chap01.before.Robot("Andrew");
		robot.order(Robot.COMMAND_WALK);
		robot.order(Robot.COMMAND_STOP);
		robot.order(Robot.COMMAND_JUMP);
	}

}
