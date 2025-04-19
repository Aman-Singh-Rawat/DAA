class RadixSort {
	public static void main(String [] args) {
		int arr[] = {109, 108, 107, 106, 105, 104};
		System.out.print(getDigit(109, 2));
	}
	
	private static int getDigit(int num, int position) {
		int lastDigit = 0;
		while(position > -1 && num > 0) {
			lastDigit = num % 10;
			num /= 10;
			position--;
		}
		if (num == 0 && position < 0) {
			return 0;
		}
		return lastDigit;
	}
}