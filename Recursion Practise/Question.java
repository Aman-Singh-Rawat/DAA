import java.util.Scanner;
class HappyNumber {
	public static void main(String [] args) {
		//callHappNumber();
		/*int m = 4;
		int n = 5;
		int ans = premutationCombination(n) / ( premutationCombination(m) * premutationCombination(n - m));
		System.out.println(ans);
		
		int ar[] = {1, 2, 3, 4, 1};
		int num = recursiveFirstLinearSearch(ar, 1, 0);
		System.out.print("First time search:: "+num);
		num = recursiveFirstLinearSearch(ar, 1, 0);
		System.out.print("Last time search:: "+num);
		*/
		Scanner sc = new Scanner(System.in);
		int findNumber;
		int rollNumber[] = {101, 102, 103, 104, 105};
		int marks[] = {58, 92, 62, 78, 82};
		do {
			System.out.print("Enter 1 for find rollNumber:: ");
			findNumber = sc.nextInt();
			
			if(findNumber == 1) {
				int ans = findRollNumber(rollNumber, 103, 0);
				System.out.println(marks[ans]);
			} else {
				int ans = findMarks(marks, 62, 0);
				System.out.println(rollNumber[ans]);
			}
		} while (findNumber == 1 || findNumber == 2);
		
	}
	
	private static void callHappNumber() {
		int sumOfNumber = 49;
		while(sumOfNumber > 9) {
			sumOfNumber = happyNumber(sumOfNumber, 0);
		}
		if(sumOfNumber == 1) {
			System.out.println("ya this is happyNumber");
		} else {
			System.out.println("this is not a happyNumber");
		}
	}
	
	private static int happyNumber(int num, int count) {
		if (num > 0) {
			int lastDigit = num % 10;
			return (lastDigit * lastDigit) + happyNumber((num / 10), count + 1);
		} else {
			return 0;
		}
	}
	
	private static int premutationCombination(int num) {
		if (num > 1) {
			return num * premutationCombination(num - 1);
		} else {
			return 1;
		}
	}
	
	private static void linearSearch(int arr [], int num) {
		for(int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				System.out.print(num+" Number found:: ");
				return;
			} 
		} 
		System.out.print(num+" not found:: ");
	}
	
	private static void recursiveLinearSearch(int arr [], int num, int index) {
		if (index == arr.length) {
			return;
		} 
		if (num == arr[index]) {
			System.out.println(" Number founds in:: "+index);
		}  
		recursiveLinearSearch(arr, num, index+1);
	}
	
	private static int recursiveFirstLinearSearch(int arr [], int num, int index) {
		if (index == arr.length) {
			return -1;
		} 
		if (num == arr[index]) {
			return index;
		}  
		return recursiveFirstLinearSearch(arr, num, index+1);
	}
	
	private static int recursiveLastLinearSearch(int arr [], int num, int index) {
		if (index == -1) {
			return -1;
		} 
		if (num == arr[index]) {
			return index;
		}  
		return recursiveLastLinearSearch(arr, num, index-1);
	}
	
	private static int findRollNumber(int rollNumber [], int marks, int index) {
		if (index == rollNumber.length) return -1;
		if (rollNumber[index] == marks) {
			return index;
		} 
		return findRollNumber(rollNumber, marks, index+1);
	}
	
	private static int findMarks(int marks [], int rollNumber, int index) {
		if (index == marks.length) return -1;
		if (marks[index] == rollNumber) {
			return index;
		} 
		return findMarks(marks, rollNumber, index+1);
	}
} 