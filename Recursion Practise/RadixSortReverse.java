class RadixSortReverse {
	public static void main(String [] args) {
		int arr[] = {968, 48, 226, 95, 61, 123,465, 122};
		countFrequency(arr, 0);
	}
	
	private static void countFrequency(int [] arr, int count) {
		if (count < 3) {
			int countArray [] = new int [10];
			int lastDigit = 0;
			for (int i = 0; i < arr.length; i++) {
				lastDigit = getDigit(arr[i], count);
				
				countArray[lastDigit]++;
			}
			printArray(countArray);
			
			for (int i = countArray.length-2; i >= 0; i--) {
				countArray[i] += countArray[i+1];
			}
			
			printArray(countArray);
			
			sortArray(arr, countArray, count);
			
			printArray(arr);
			countFrequency(arr, count+1);
		}
	}                                          
	
	private static int[] sortArray(int [] arr, int [] countArray, int count) {
		int ansArray [] = new int [arr.length];
		for (int i = ansArray.length-1; i >= 0; i--) {
			ansArray[--countArray[getDigit(arr[i], count)]] = arr[i];
		}
		arr = ansArray;
		return ansArray;
	}
	
	private static int getDigit(int num, int position) {
		int lastDigit = 0;
		while(position > -1 && num > 0) {
			lastDigit = num % 10;
			num /= 10;
			position--;
		}
		if (position >= 0) {
			
			return 0;
		}
		return lastDigit;
	}
	
	private static void printArray(int [] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}