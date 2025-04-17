class Second {
	public static void main(String [] args) {
		a(1, 3, 0);
		System.out.println();
		b(1, 1);
		System.out.println();
		c(3);
		System.out.println();
		d(4, 0);
		System.out.println();
		e(1.0);
		System.out.println();
		f(1);
	}
	
	private static int a(int num, int increasingNum, int count) {
		if (count == 10) return num;
		System.out.print(num + " ");
		return num + a(num + increasingNum, increasingNum + 2, ++count);
	}
	
	private static int b(int num, int count) {
		if (count == 11) return num;
		System.out.print(num + " ");
		return num + b((num + count), ++count);
	}
	
	private static int c(int num) {
		if(num == 33) return num;
		System.out.print(num + " ");
		return c(num + 3);
	}
	
	private static int d(int num, int count) {
		if (count == 10) return num;
		System.out.print(num + " ");
		return d((num + num), ++count);
	}
	
	private static void e(double count) {
		if (count == 11.0) return;
		System.out.print((1.5 * count) + " ");
		e(count + 1.0);
	}
	
	private static void f(int count) {
		if (count == 11) return;
		System.out.print(((count * count * count) - 1) + " ");
		f(count + 1);
	}
	
	private static void g(int count, int num) {
		if(count == 10) return;
		System.out.print((num * num));
		g(++count, num+2);
	}
	
	
}
