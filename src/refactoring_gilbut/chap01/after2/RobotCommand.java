package refactoring_gilbut.chap01.after2;

public class RobotCommand {
	private final String name;

	public RobotCommand(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("RobotCommand [%s]", name);
	}

}
