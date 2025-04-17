class InsertionSort {
	public static void main(String [] args) {
		int arr[] = {6, 8, 5, 7, 3, 1};
		firstProgram(arr);
		//nsertionWithRecursion(arr, 1);
		//printArray(arr);
	}
	
	private static void insertionWithRecursion(int [] arr, int i) {
		if(i >= arr.length) return;
		int temp;
		int j = i -1;
		int min = arr[i];
		while(j >= 0 && arr[j] > min) {
			temp = arr[j+1];
			arr[j+1] = arr[j];
			arr[j] = temp;
			j--;
		}
		j = j + 1;
		arr[j] = min;
		
		insertionWithRecursion(arr, i+1);
	}
	
	private static void firstProgram(int [] arr) {
		int temp;
		for (int i = 1; i < arr.length; i++) {
			int j = i -1;
			int min = arr[i];
			while(j >= 0 && arr[j] > min) {
				arr[j+1] = arr[j];
				j--;
			}
			j = j + 1;
			arr[j] = min;
		}
		printArray(arr);
	}
	
	private static void printArray(int [] arr) {
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	
}