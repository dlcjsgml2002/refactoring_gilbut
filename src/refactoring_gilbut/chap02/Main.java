package refactoring_gilbut.chap02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import refactoring_gilbut.chap02.after_break.FindIntReturn;
import refactoring_gilbut.chap02.after_return.FindIntBreak;
import refactoring_gilbut.chap02.before.FindIntBefore;
import refactoring_gilbut.chap02.simpledatabase_before.SimpleDatabase;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 1, 9, 0, 2, 8, 5, 6, 3, 4, 7, 5 };

		before(data);

		after_break(data);

		after_return(data);

		String fileUrl = Thread.currentThread().getContextClassLoader().getResource("dbfile.txt").getPath();
		System.out.println("fileUrl : " + fileUrl);

		before_simpledatabase();
		after_api_simpledatebase();
		after_pattern_simpledatebase();
	}

	private static void after_pattern_simpledatebase() {
		// TODO Auto-generated method stub
		try {
			SimpleDatabase db = new SimpleDatabase(new FileReader("dbfile.txt"));
			Iterator<String> it = db.iterator();
			while (it.hasNext()) {
				String key = it.next();
				System.out.println("KEY: \"" + key + "\"");
				System.out.println("VALUE: \"" + db.getValue(key) + "\"");
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("해당 파일에 문제가 있어 읽을 수 없습니다.");
		}
	}

	private static void after_api_simpledatebase() {
		// TODO Auto-generated method stub
		try {
			SimpleDatabase db = new SimpleDatabase(new FileReader("dbfile.txt"));
			Iterator<String> it = db.iterator();
			while (it.hasNext()) {
				String key = it.next();
				System.out.println("KEY: \"" + key + "\"");
				System.out.println("VALUE: \"" + db.getValue(key) + "\"");
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("해당 파일에 문제가 있어 읽을 수 없습니다.");
		}
	}

	private static void before_simpledatabase() {
		try {
			SimpleDatabase db = new SimpleDatabase(new FileReader("dbfile.txt"));
			Iterator<String> it = db.iterator();
			while (it.hasNext()) {
				String key = it.next();
				System.out.println("KEY: \"" + key + "\"");
				System.out.println("VALUE: \"" + db.getValue(key) + "\"");
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("해당 파일에 문제가 있어 읽을 수 없습니다.");
		}
	}

	private static void after_return(int[] data) {
		if (FindIntReturn.find(data, 5)) {
			System.out.println("Found!");
		} else {
			System.out.println("Not Found...");
		}
	}

	private static void after_break(int[] data) {
		if (FindIntBreak.find(data, 5)) {
			System.out.println("Found!");
		} else {
			System.out.println("Not Found...");
		}
	}

	private static void before(int[] data) {
		if (FindIntBefore.find(data, 5)) {
			System.out.println("Found!");
		} else {
			System.out.println("Not Found...");
		}
	}

}
