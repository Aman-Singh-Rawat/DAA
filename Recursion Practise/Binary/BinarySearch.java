class BinarySearch {
	public static void main(String [] args) {
		// int [] arr = {0, 3, 3, 3, 3, 3, 5};
		int [] arr = {0, 3, 3, 4, 5, 6};
		//binarySearch(arr, 5);
		//binarySearchWithRecursion(arr, 4, 0, arr.length-1);
		/*int num = binarySearchFirstNumber(arr, 4, 0, arr.length-1, -1);
		if (num == -1) {
			System.out.println("Number not found");
		} else {
			System.out.println("Number found in "+num);
		}*/
		System.out.println(binarySearchCount(arr, 3, 0, arr.length-1, 0));
	}
	private static void binarySearch(int[] arr, int num) {
		int m = 0, l = 0, h = arr.length-1;
		while(l<=h) {
			m = (l + h) / 2;
			
			if (arr[m] == num) {
				System.out.print("Number found in "+m);
				break;
			}
			else if (num < arr[m]) {
				h = m - 1;
			} 
			
			else if(num > arr[m]) {
				l = m + 1;
			}
		}
	}
	
	private static void binarySearchWithRecursion(int[] arr, int num, int l, int h) {
		int m = (l + h) / 2;
		if (l > h) {
			System.out.print("Number not found");
			return;
		} else if (arr[m] == num) {
			System.out.print("Number found in "+(m+1)+ " place");
			return;
		} 
		
		if (num < arr[m]) {
			binarySearchWithRecursion(arr, num, l, m-1);
		} else {
			binarySearchWithRecursion(arr, num, m + 1, h);
		}
	}
	
	private static int binarySearchWithRecursionPosition(int[] arr, int num, int l, int h) {
		int m = (l + h) / 2;
		if (l > h) {
			return -1;
		} else if (arr[m] == num) {
			return m;
		} 
		
		if (num < arr[m]) {
			return binarySearchWithRecursionPosition(arr, num, l, m-1);
		} else {
			return binarySearchWithRecursionPosition(arr, num, m + 1, h);
		}
	}
	
	private static int binarySearchFirstNumber(int [] arr, int num, int l, int h) {
		int m = (l + h) / 2;
		if (l > h) {
			return -1;
		} else if (arr[m] == num) {
			if(arr[0] == num) {
				return 0;
			} else if (m > 0 && arr[m - 1] == num) {
				return binarySearchWithRecursionPosition(arr, num, l, m-1);
			} else {
				return m;
			}
		} else {
			return binarySearchWithRecursionPosition(arr, num, m + 1, h);
		}
	}
	
	private static int binarySearchFirstNumber(int [] arr, int num, int l, int h, int lastPosition) {
		int m = (l + h) / 2;
		if (l > h) {
			return lastPosition;
		} else if (num == arr[m]) {
			return binarySearchLastNumber(arr, num, l, m-1, m);
		} else if (num > arr[m]) {
			return binarySearchLastNumber(arr, num, m + 1, h, lastPosition);
		} else {
			return binarySearchLastNumber(arr, num, l, m-1, lastPosition);
		}
	}
	
	private static int binarySearchLastNumber(int [] arr, int num, int l, int h, int lastPosition) {
		int m = (l + h) / 2;
		if (l > h) {
			return lastPosition;
		} else if (num == arr[m]) {
			return binarySearchLastNumber(arr, num, m + 1, h, m);
		} else if (num > arr[m]) {
			return binarySearchLastNumber(arr, num, m + 1, h, lastPosition);
		} else {
			return binarySearchLastNumber(arr, num, l, m-1, lastPosition);
		}
	}
	
	private static int binarySearchCount(int [] arr, int num, int l, int h, int count) {
		int m = (l + h) / 2;
		if (l > h) {
			return count;
		} else if (num == arr[m]) {
			binarySearchLastNumber(arr, num, l, m-1, count+1);
			binarySearchLastNumber(arr, num, m+1, h, count+1);
			
			return count;
		} else if (num > arr[m]) {
			return binarySearchLastNumber(arr, num, m + 1, h, count);
		} else {
			return binarySearchLastNumber(arr, num, l, m-1, count);
		}
	}
}

// Rubicu