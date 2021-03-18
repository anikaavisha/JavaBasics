package JavaBasics;

public class GreatestOf4 {

	public int biggerNumber(int number1, int number2, int number3, int number4) {
		if (number1 > number2 && number1 > number3 && number1 > number3) {
			return number1;
		} else if (number2 > number3 && number2 > number4) {
			return number2;
		} else if (number3 > number4) {
			return number3;
		} else{
			return number4;
		}
	}

	public static void main(String[] args) {

		GreatestOf4 number = new GreatestOf4();
		int greatestNumber = number.biggerNumber(10, 900, 8000, 700);
		System.out.println(greatestNumber);

	}

}
