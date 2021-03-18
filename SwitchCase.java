package JavaBasics;

public class SwitchCase {
	
	public static void  giftDecider(int age) {

		switch (age) {

		case 5: {
			System.out.println("Please give soft toy");
			break;
		}
		case 10: {
			System.out.println("Please give electronics toy");
			break;

		}
		case 18: {
			System.out.println("Please give Laptop");
			break;

		}
		default:
			System.out.println("Please give store gift card");
		}
		

	}

	public static void main(String[] args) {
		
		SwitchCase.giftDecider(10);
		

	}

}
