public class CountDigits {
	public static void main(String[] args) {
		int num = 1126;
		int c = 0;
		while(num!=0) {
			num = num/10;
			++c;
		}
		 System.out.println(c);
}
}