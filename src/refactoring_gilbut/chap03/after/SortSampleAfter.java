package refactoring_gilbut.chap03.after;

import java.util.Arrays;

public class SortSampleAfter {
	public final int[] data;

	public SortSampleAfter(int[] data) {
		this.data = new int[data.length];
		System.arraycopy(data, 0, this.data, 0, data.length);
	}

	public void sort() {
		for (int x = 0; x < data.length - 1; x++) {
			int m = x;
			for (int y = x + 1; y < data.length - 1; y++) {
				if (data[m] > data[y]) {
					m = y;
				}
			}
			assert isMin(m, x, data.length - 1) : this + ", x = " + x;
			int v = data[m];
			data[m] = data[x];
			data[x] = v;
		}
	}

	private boolean isMin(int pos, int start, int end) {
		// TODO Auto-generated method stub
		for (int i = start; i < end + 1; i++) {
			if (data[pos] > data[i]) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		return String.format("%s", Arrays.toString(data));
	}

}
