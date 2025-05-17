import java.util.Scanner;
class GraphDFS {
	static int top = -1;

	
	static int stackArray [] = new int[7];
	public static void main(String [] args) {
		int arr [][] = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0}, 
			{0, 0, 0, 1, 1, 0, 0},
			{0, 0, 1, 0, 0, 1, 0},
			{0, 0, 1, 0, 0, 1, 0},
			{0, 0, 0, 1, 1, 0, 1},
			{0, 0, 0, 0, 1, 1, 0}
		};	
		
		int dfsArray [] = new int[7];
		int dfsArrayIndex = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\ninput value where you want to start from:: ");
		int value = sc.nextInt();
		
		insertValue(value);
		boolean flag = false;
		dfsArray[dfsArrayIndex++] = value;
		while (top != -1) {
			int i = stackArray[top];
			int j = 0;
			flag = false;
			for (j = 0; j < stackArray.length; j++) {
				if (arr[i][j] == 1 && !isNumberAlreadyExist(dfsArray, j)) {
					insertValue(j);
					dfsArray[dfsArrayIndex++] = j;
					flag = true;
					break;
				}
			}
			if (!flag && j == stackArray.length) {
				deleteValue();
			}
		}
		printArray(dfsArray);
	}
	
	private static void printArray(int [] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void insertValue(int value) {
		if (top == stackArray.length) {
			return;
		}
		stackArray[++top] = value;
	}
	
	public static void deleteValue() {
		if (top == -1) {
			System.out.print("kya delete karu");
			return;
		}
		System.out.println(stackArray[top--] + " is now deleted");
	}
	
	public static void displayValue() {
		for (int i = top-1; i >= 0; i--) {
			System.out.print(stackArray[i] + " ");
		}
	}
	
	public static boolean isNumberAlreadyExist(int [] dfsArray, int num) {
		for (int i = 0; i < dfsArray.length; i++) {
			if (dfsArray[i] == num) {
				return true;
			}
		}
		return false;
	}
}