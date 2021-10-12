package MaxFind;

public class GreatestofThree {
	public static void main(String[] args) {
		
		int n1 = 10 , n2 = 20, n3 = 30;
		if(n1>n2 && n1>n3) {
			System.out.println( "the greatestofThree =" + n1);
		}
		else if(n2>n1 && n2>n3) {
			
			System.out.println("the greatestofThree =" + n2);
		}else {
			System.out.println("the greatestofThree =" + n3);
		}
	}

}