package refactoring_gilbut.chap02.simpledatabase_after_api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SimpleDatabaseAPI {
	private Map<String, String> map = new HashMap<>();

	public SimpleDatabaseAPI(Reader r) throws IOException {
		BufferedReader reader = new BufferedReader(r);
		String line;
		while ((line = reader.readLine()) != null) {
			int equalIndex = line.indexOf("=");
			if (equalIndex > 0) {
				String key = line.toString();
				String value = line.toString();
				map.put(key, value);
			}
		}
	}

	public void putValue(String key, String value) {
		map.put(key, value);
	}

	public String getValue(String key) {
		return map.get(key);
	}

	public Iterator<String> iterator() {
		return map.keySet().iterator();
	}

}
