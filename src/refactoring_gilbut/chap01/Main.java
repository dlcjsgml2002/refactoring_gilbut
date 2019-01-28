package refactoring_gilbut.chap01;

import refactoring_gilbut.chap01.after.RobotSymbolicConstant;
import refactoring_gilbut.chap01.after2.RobotCommandClass;
import refactoring_gilbut.chap01.after3.Command;
import refactoring_gilbut.chap01.after3.RobotEnum;
import refactoring_gilbut.chap01.before.RobotMaginNumber;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		before();
		afterSymbolicConstant();
		afterClass();
		afterEnum();
	}

	public static void afterEnum() {
		System.out.println("afterEnum Main()");
		RobotEnum robot = new RobotEnum("Andrew");
		robot.order(Command.WALK);
		robot.order(Command.STOP);
		robot.order(Command.JUMP);
	}

	public static void afterClass() {
		System.out.println("afterClass Main()");
		RobotCommandClass robot = new RobotCommandClass("Andrew");
		robot.order(RobotCommandClass.COMMAND_WALK);
		robot.order(RobotCommandClass.COMMAND_STOP);
		robot.order(RobotCommandClass.COMMAND_JUMP);
	}

	public static void afterSymbolicConstant() {
		System.out.println("afterSymbolicConstant Main()");
		RobotSymbolicConstant robot = new RobotSymbolicConstant("Andrew");
		robot.order(RobotSymbolicConstant.COMMAND_WALK);
		robot.order(RobotSymbolicConstant.COMMAND_STOP);
		robot.order(RobotSymbolicConstant.COMMAND_JUMP);
	}

	private static void before() {
		System.out.println("before Main()");
		RobotMaginNumber robot = new RobotMaginNumber("Andrew");
		robot.order(0);
		robot.order(1);
		robot.order(2);
	}

}
