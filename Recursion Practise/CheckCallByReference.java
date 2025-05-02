class CheckCallByReference {
	public static void main(String [] args) {
		int arr[] = {968, 48, 226, 95, 61, 123,465, 122};
		printArray(arr);
		changeValue(arr);
		printArray(arr);
	}
	public static void changeValue(int [] arr) {
		arr[5] = -25;
		
	}
	
	private static void printArray(int [] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}