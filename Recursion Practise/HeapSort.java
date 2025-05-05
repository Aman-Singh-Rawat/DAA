class HeapSort {
	public static void main(String [] args) {
		int arr[] = {18, 20, 54, 7, 36, 25, 78};
		int size = arr.length-1;
		while (size != 0) {
			heapfy(arr, size);
			swapElement(arr, size);
			size--;
		}
		printArray(arr);
	}
	
	private static boolean isHeapify(int [] arr, int size) {
		
		int lc;
		for (int i = size; i >= 0; i--) {
			lc = i * 2 + 1;
			
			if (lc + 1 > size) continue;
			
			if (arr[lc] < arr[i] || arr[lc + 1] < arr[i]) {
				System.out.println(i);
				return false;
			} 
		}
		return true;
	}
	
	private static void heapfy(int [] arr, int size) {
		int lc = 0, rc = 0, currentIndex = 0;
		int temp = 0;
		for (int i = size; i >= 0; i--) {
			lc = i * 2 + 1;
			rc = i * 2 + 2;
			
			if (rc > size) continue;
		
			if (arr[lc] < arr[rc]) {
				currentIndex = lc;
			} else if (arr[rc] < arr[lc]) {
				currentIndex = rc;
			}
			
			if (currentIndex <= size) {
				temp = arr[i];
				arr[i] = arr[currentIndex];
				arr[currentIndex] = temp;
			}
		}	
		
		if (!isHeapify(arr, size)) {
			heapfy(arr, size);
		}
	}
	
	private static void swapElement(int [] arr, int size) {
		int temp = arr[0];
		arr[0] = arr[size];
		arr[size] = temp;
	}
	
	private static void printArray(int [] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}