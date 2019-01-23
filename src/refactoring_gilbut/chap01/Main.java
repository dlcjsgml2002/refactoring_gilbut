package refactoring_gilbut.chap01;

import refactoring_gilbut.chap01.after.RobotSymbolicConstant;
import refactoring_gilbut.chap01.after2.RobotCommandClass;
import refactoring_gilbut.chap01.before.RobotMaginNumber;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		before();
		after();
		System.out.println("after2Main()");
		RobotCommandClass robot = new RobotCommandClass("Andrew");
		robot.order(RobotCommandClass.COMMAND_WALK);
		robot.order(RobotCommandClass.COMMAND_STOP);
		robot.order(RobotCommandClass.COMMAND_JUMP);
	}

	public static void after() {
		System.out.println("afterMain()");
		RobotSymbolicConstant robot = new RobotSymbolicConstant("Andrew");
		robot.order(RobotSymbolicConstant.COMMAND_WALK);
		robot.order(RobotSymbolicConstant.COMMAND_STOP);
		robot.order(RobotSymbolicConstant.COMMAND_JUMP);
	}

	private static void before() {
		System.out.println("beforeMain()");
		RobotMaginNumber robot = new RobotMaginNumber("Andrew");
		robot.order(0);
		robot.order(1);
		robot.order(2);
	}

}
