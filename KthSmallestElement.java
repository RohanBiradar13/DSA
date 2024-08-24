public class KthSmallestElement {

	public static void main(String[] args) {
		// n=5
		// arr[] = {5,2,10,1,15};
		// k=3;
		// Output=5

		int arr[] = { 5, 2, 10, 1, 15 };
		int k = 3;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = k - 1; i < k; i++) {
			System.out.println(arr[i]);
		}

	}
}