/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P8_NumberPrinter {

	public static void main(String[] args) {
		printNumbers(10);

	}
		public static void printNumbers(int number) {
			for(int i = 1; i <= number; i++) {
				System.out.print("[" + i + "]");
			}
		}
}
