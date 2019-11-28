
class Dupl {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 4 };
		int[] b = new int[] { 2, 4, 6, 9, 6 };
		int[] c = new int[20];
		int sum = 0;

		System.out.println("Duplicate Element In Give Array");

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {

				if (a[i] == b[j]) {
					System.out.println(a[i]);
					c[i] = a[i];
					sum = sum + c[i];

				}

			}

		}

		System.out.println(sum);
	}
}
