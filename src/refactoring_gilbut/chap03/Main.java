package refactoring_gilbut.chap03;

import java.util.Random;

import refactoring_gilbut.chap03.before.SortSampleBefore;

public class Main {
	private static final Random rnd = new Random(1234);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		execute(10);
		execute(10);
		execute(10);
		execute(10);
		execute(10);

	}

	private static void execute(int length) {
		// TODO Auto-generated method stub
		int[] data = new int[length];
		for (int i = 0; i < data.length; i++) {
			data[i] = rnd.nextInt(data.length);
		}

		SortSampleBefore sorter = new SortSampleBefore(data);
		System.out.printf("%6s : %s%n", "BEFORE", sorter);

		sorter.sort();
		System.out.printf("%6s : %s%n", "AFTER", sorter);

		System.out.println();

	}

}
