class Main {
	public static void main(String [] args) {
		int arr[] = {968, 46, 123, 460, 528, 101, 94};
		countElement(arr, 0);
		
		//System.out.print(getDigit(15945, 4));
	}
	
	private static void countElement(int [] arr, int repeativeCount) {
	
		if (repeativeCount > 2 ) return;
		
		int countArray [] = new int [10];
		for (int element : arr) {
			int digit = getDigit(element, repeativeCount);
			countArray[getDigit(element, repeativeCount)]++;
			
			//System.out.println(digit);
		}
		printArray(countArray);
		for (int i = 1; i < countArray.length; i++) {
			countArray[i] += countArray[i-1];
		}
		
		printArray(countArray);
		sortArray(arr, countArray, repeativeCount);
		System.out.println(repeativeCount+" :X========================X==========================\n");
		countElement(arr, repeativeCount+1);
		
	}
	
	private static void sortArray(int [] arr, int [] countArray, int repeativeCount) {
		int ans [] = new int[arr.length];
		
		for (int i = arr.length-1; i >= 0; i--) {
			int lastDigit = getDigit(arr[i], repeativeCount);
			int index = --countArray[lastDigit];
			ans[index] = arr[i];
		}
		
		printArray(ans);
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