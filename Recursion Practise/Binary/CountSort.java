class CountSort {
	public static void main(String [] args) {
		int arr[] = {-1, -2, -3, -4, -1, -2, -5};
		int maxElement = findMaxElement(arr);
		countSort(arr, maxElement);
	}
	
	private static int findMaxElement(int [] arr) {
		int max = arr[0];
		for (int i : arr) {
			if (max > i) {
				max = i;
			}
		}
		return max * -1;
	}
	
	private static void countSort(int [] arr, int max) {
		int countArray [] = new int[(max)+1];
		for (int i = 0; i < arr.length; i++) {
			countArray[arr[i] * -1]++;
			
		}
		printArray(countArray);
		System.out.println();
		addSuffixElement(countArray);
		System.out.println();
		sortArray(arr, countArray);
	}
	
	private static void addSuffixElement(int [] arr) {
		for (int i = 1; i < arr.length; i++) {
			arr[i] = arr[i-1] + arr[i];
		}
		printArray(arr);
	}
	
	
	private static void sortArray(int [] arr, int [] countArray) {
		int ans [] = new int [arr.length];
		for (int i = 0; i < arr.length; i++) {
			ans[--countArray[arr[i]* -1]] = arr[i];
		}
		printArray(ans);
		//everseArray(ans);
	}
	
	private static void reverseArray(int [] arr) {
		int i = 0;
		int j = arr.length-1;
		int temp;
		while(i < j ) {
			temp = arr[i];
			arr[i++] = arr[j];
			arr[j--] = temp;
		}
		
		printArray(arr);
	}
	
	private static void printArray(int [] arr) {
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
}