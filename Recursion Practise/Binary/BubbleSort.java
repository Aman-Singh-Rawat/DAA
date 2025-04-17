class BubbleSort {
	public static void main(String [] args) {
		int arr[] = {9, 8, 4, 8, 2, 1};
		firstProgram(arr, 0);
		printArray(arr);
	}
	private static void firstProgram(int[] arr, int i) {
		int temp = 0;
		if (i >= arr.length) return;
		for (int j = i; j < arr.length; j++) {
			if (arr[i] > arr[j]) {
				temp = arr[i]; 
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		firstProgram(arr, i+1);
	}
	
	private static void printArray(int [] arr) {
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
}