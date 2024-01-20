public class Matrices {

	public static void main(String[] args) {

		int[][] arr = {
				{ -19, 57 },
				{ -40, -5 } };

		int[][] min = new int[2][2];
		for (int j = 0; j < arr.length; j++) {
			min[0][j] = arr[0][j];
		}

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 0) { // first column separately
					min[i][j] = arr[i][j] + Math.min(min[i - 1][j], min[i - 1][j + 1]);
				} else if (j == arr[i].length - 1) { // last column separately
					min[i][j] = arr[i][j] + Math.min(min[i - 1][j - 1], min[i - 1][j]);
				} else { // rest of the columns
					min[i][j] = arr[i][j] + Math.min(min[i - 1][j - 1], Math.min(min[i - 1][j], min[i - 1][j + 1]));
				}
			}
		}

		for (int i = 0; i < min.length; i++) {
			for (int j = 0; j < min[i].length; j++) {
				System.out.print(min[i][j] + "\t");
			}
			System.out.println();
		}

		int lastRow = min.length - 1;
		int minElement = min[lastRow][0];
		for (int j = 1; j < min[lastRow].length; j++) {
			if (min[lastRow][j] < minElement) {
				minElement = min[lastRow][j];
			}
		}
		System.out.println(minElement);
	}
}
