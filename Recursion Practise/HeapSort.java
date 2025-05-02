class HeapSort {
	public static void main(String [] args) {
		int arr[] = {18, 20, 54, 7, 36, 25, 78};
		heapfy(arr);
		printArray(arr);
	}
	
	private static void heapfy(int [] arr) {
		int lc = 0, rc = 0, currentIndex = 0;
		int temp = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			lc = i * 2 + 1;
			rc = i * 2 + 2;
			
			if (rc >= arr.length) continue;
		
			if (arr[lc] < arr[rc]) {
				currentIndex = lc;
			} else if (arr[rc] < arr[lc]) {
				currentIndex = rc;
			}
			
			if (currentIndex < arr.length) {
				temp = arr[i];
				arr[i] = arr[currentIndex];
				arr[currentIndex] = temp;
			}
		}
	}
	
	private static void printArray(int [] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}