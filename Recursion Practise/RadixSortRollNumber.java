class RadixSortRollNumber {
	static int marks[] = {968, 48, 226, 95, 61, 123, 465, 122};
	static int rollNumber[] = {1, 2, 3, 4, 5, 6, 7, 8};
	
	public static void main(String [] args) {
		countFrequency(0);
	}
	
	private static void countFrequency(int count) {
		if (count < 3) {
			int countArray [] = new int [10];
			int lastDigit = 0;
			for (int i = 0; i < marks.length; i++) {
				lastDigit = getDigit(marks[i], count);
				
				countArray[lastDigit]++;
			}
			printArray(countArray);
			
			for (int i = countArray.length-2; i >= 0; i--) {
				countArray[i] += countArray[i+1];
			}
			
			printArray(countArray);
			
			sortArray(countArray, count);
			
			printArray(marks);
			printArray(rollNumber);
			System.out.println("X==================X==================\n");
			countFrequency(count+1);
		}
	}           

	
	private static void sortArray(int [] countArray, int count) {
		int marksArray [] = new int [marks.length];
		int rollNumberArray [] = new int [marks.length];
		for (int i = marksArray.length-1; i >= 0; i--) {
			int index = --countArray[getDigit(marks[i], count)];
			rollNumberArray[index] = rollNumber[i];
			marksArray[index] = marks[i];
		}
		marks = marksArray;
		rollNumber = rollNumberArray;
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
	
	private static void printArray(int [] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}