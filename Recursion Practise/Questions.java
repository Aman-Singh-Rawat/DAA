class Questions {
	public static void main(String [] args) {
		int rollNumber[] = {101, 102, 103, 104, 106, 107, 108, 109};
		int marks[] = {86, 21, 63, 75, 95, 46, 39, 25};
		usingInsertionSort(marks, rollNumber, 1);
		printArray(marks);
		System.out.println();
		printArray(rollNumber);
	}
	
	private static void usingInsertionSort(int [] marks, int [] rollNumber, int i) {
		if (i >= marks.length) return;
		int temp;
		int j = i-1;
		int min = marks[i];
		int min2 = rollNumber[i];
		while (j >= 0 && marks[j] < min) {
			marks[j+1] = marks[j];
			rollNumber[j+1] = rollNumber[j];
			j--;
		}
		j = j+1;
		marks[j] = min;
		rollNumber[j] = min2;
		usingInsertionSort(marks, rollNumber, i+1);
	}
	

	private static void printArray(int [] arr) {
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
}