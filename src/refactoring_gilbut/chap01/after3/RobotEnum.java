package refactoring_gilbut.chap01.after3;

public class RobotEnum {
	private final String name;

	public RobotEnum(String name) {
		this.name = name;
	}

	public void order(Command command) {
		if (command == Command.WALK) {
			System.out.printf("%s %s%n", name, "walks.");
		} else if (command == Command.STOP) {
			System.out.printf("%s %s%n", name, "stops.");
		} else if (command == Command.JUMP) {
			System.out.printf("%s %s%n", name, "jumps.");
		} else {
			System.out.printf("command error. command = %s%n", command);
		}
	}

}
