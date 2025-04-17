class Eight {
	public static void main(String [] args) {
		System.out.println(a(1, 3));
		System.out.println(b(1));
		System.out.println(f(1));
		System.out.println(e(1));
	}
	
	private static int a(int num, int increasingNum) {
		if (num < 400) {
			return (num * num) + a(num + increasingNum, increasingNum += 2);
		} else {
			return 0;
		}
	}
	
	private static double b(int num) {
		if (num <= 19) {
			return (1.0 / num) + b(num+1);
		} else {
			return 0;
		}
	}
	
	private static double c(int num) {
		if (num <= 19) {
			return (1.0 / num) + c(num+2);
		} else {
			return 0;
		}
	}
	
	private static double d(int num) {
		if (num <= 19) {
			return (num / (num+1)) + d(num+1);
		} else {
			return 0;
		}
	}
	
	private static int e(int num) {
		if (num <= 4) {
			if (num % 2 == 0) {
				return (-num * 2) + e(num+1);
			} else {
				return (num * 2) + e(num+1);
			}
		} else {
			return 0;
		}
	}
	
	private static int f(int num) {
		if (num <= 5) {
			return (num * (num+1)) + f(num+1);
		} else {
			return 0;
		}
	}
	
	
}

//kiranhiring77@gmail.com