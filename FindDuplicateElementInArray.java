public class FindDuplicateElementInArray {

	public static void main(String[] args) {
					int[] numbers = { 10, 20, 30, 20, 50 };
			int duplicateNumber = duplicateElement(numbers);
			if (duplicateNumber != -1) {
				System.out.println("Duplicate element is " + duplicateNumber);
			} else {
				System.out.println("No duplicate element found..");
			}
		}
	
	public static int duplicateElement(int numbers[]) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					return numbers[i];
				}

			}
		}
		return -1;
	}
}
