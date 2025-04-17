class SelectionSort {
	public static void main(String [] args) {
		int arr[] = {6, 5, 4, 3, 2, 1};
		sortInDescending(arr, 1);
		sortInAscending(arr, 1, arr.length / 2);
		printArray(arr);
	}
	
	private static void sortInAscending(int [] arr, int i, int mid) {
		if(i > mid -1) return;
		int pos = 0;
		int temp = 0;
		int min = arr[i];
		int j = i-1;
		while (j >= 0 && arr[j] > min) {
			arr[j+1] = arr[j];
			j--;
		}
		j = j+1;
		arr[j] = min;

		sortInAscending(arr, i+1, mid);
		
		
	}
	
	private static void sortInDescending(int [] arr, int i) {
		if(i > arr.length -1) return;
		int pos = 0;
		int temp = 0;
		int min = arr[i];
		int j = i-1;
		while (j >= 0 && arr[j] < min) {
			arr[j+1] = arr[j];
			j--;
		}
		j = j+1;
		arr[j] = min;

		sortInDescending(arr, i+1);
		
	}
	
	private static void firstNumber(int [] arr) {
		int pos = 0;
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			pos = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[pos] > arr[j])
					pos = j;
			}
			temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}
		printArray(arr);
	}
	
	private static void secondNumber(int[] arr, int i) {
		if (i > arr.length) {
			return ;
		} 
		int pos = i;
		int temp;
		
		for (int j = i+1; j < arr.length; j++) {
			if (arr[pos] > arr[j]) {
				pos = j; 
			}
			temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}
		secondNumber(arr, i+1);
	}
	
	private static void printArray(int [] arr) {
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
}