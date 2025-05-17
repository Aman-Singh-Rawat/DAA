class MaxHeap {
	public static void main(String [] args) {
		int arr[] = {18, 20, 54, 7, 36, 25, 78};
		int size = arr.length - 1;
		int temp;
		while(size > 0) {
			heapfy(arr, size);
			temp = arr[0];
			arr[0] = arr[size];
			arr[size--] = temp;
		}
		printArray(arr);
		
	}
	
	public static void heapfy(int [] arr, int size) {
		int rc;
		int temp;
		int swappingIndex = -1;
		for (int i = size;  i >= 0; i--) {
			rc = i * 2 + 2;
			
			if (rc > size) continue;
			
			if (arr[rc] > arr[rc - 1]) {
				swappingIndex = rc;
			} else if (arr[rc-1] > arr[rc]) {
				swappingIndex = rc - 1;
			}
			
			if (arr[i] < arr[swappingIndex] && swappingIndex != -1) {
				temp = arr[i];
				arr[i] = arr[swappingIndex];
				arr[swappingIndex] = temp;
			}
		}
		if (!isHeapfy(arr, size)) {
			heapfy(arr, size);
		}
	}
	
	public static boolean isHeapfy(int [] arr, int size) {
		int rc;
		for (int i = 0; i < size; i++) {
			rc = i * 2 + 2;
			if (rc > size) continue;
			
			if (arr[i] < arr[rc] || arr[i] < arr[rc-1] ) {
				return false;
			}
		}
		return true;
	}
	
	private static void printArray(int [] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}