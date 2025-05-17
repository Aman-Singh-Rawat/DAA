import java.util.Scanner;
class GraphFirst {
	int value;
	
	static int queueArray [] = new int [7];
	static int f = 0, r = 0;
	
	public static void insertValue(int value) {
		if (r == 7) {
			System.out.println("full ho gaya bhai");
			return;
		}
		queueArray[r++] = value;
	}
	
	public static int deleteValue() {
		int k=queueArray[f];
		System.out.println(queueArray[f++]+" is now deleted");
		return k;
	}
	
	public static void display(int displayArray [], int front, int rear) {
		for (int i = front; i < rear; i++) {
			System.out.print(displayArray[i]+ " ");
		}
	}
	
	public static void main(String [] args) {
		int value = 0;
		int queueArray [] = new int[7];
		int bfsArray [] = new int[7];
		Scanner sc = new Scanner(System.in);
		
		// System.out.print("Enter number of node:: ");
		// int numberOfNode = sc.nextInt();
		int bfsIndex = 0;
		int arr [][] = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0}, 
			{0, 0, 0, 1, 1, 0, 0},
			{0, 0, 1, 0, 0, 1, 0},
			{0, 0, 1, 0, 0, 1, 0},
			{0, 0, 0, 1, 1, 0, 1},
			{0, 0, 0, 0, 1, 1, 0}
		};	
		
		System.out.print("Bro where you want to start:: ");
		int num = sc.nextInt();
		
		insertValue(num);
		bfsArray[bfsIndex++] = num;
		
		findBFS(arr, bfsArray, bfsIndex);
		printArray(bfsArray);
		
	}
	
	public static void findBFS(int [][] arr, int [] bfsArray, int bfsIndex) {
		if (f == r+1) return;
		
		for (int i = queueArray[f]; i < queueArray.length; i++) {
			for (int j = 0; j < queueArray.length; j++) {
				if (arr[i][j] == 1 && !numberAlreadyExist(bfsArray, j)) {
					insertValue(j);
					bfsArray[bfsIndex++] = j;
				}
			}
		}
		f++;
		
		findBFS(arr, bfsArray, bfsIndex);
	}
	
	/*public static void findBFS(int [][] arr, int [] bfsArray, int bfsIndex) {
		while(f<r) 
		{
			int i=deleteValue();
			for (int j = 0; j < queueArray.length; j++) {
				if (arr[i][j] == 1 && !numberAlreadyExist(bfsArray, j)) {
					insertValue(j);
					bfsArray[bfsIndex++] = j;
				}
			}
		}
		//findBFS(arr, bfsArray, bfsIndex);
	}*/
	
	public static boolean numberAlreadyExist(int [] bfsArray, int num) {
		for (int i = 0; i < bfsArray.length; i++) {
			if (bfsArray[i] == num) {
				return true;
			}
		}
		return false;
	}
	
	private static void printArray(int [] array) {
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}

