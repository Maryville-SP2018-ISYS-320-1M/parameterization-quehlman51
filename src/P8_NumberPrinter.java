/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P8_NumberPrinter {

	public static void main(String[] args) {
		printNumbers(5);
		System.out.println();
		System.out.println();
		printStepRange(12,2);

	}
		public static void printNumbers(int number) {
			for(int i = 1; i <= number; i++) {
				System.out.print("[" + i + "]");
			}
		}
		public static void printStepRange(int range, int step) {
			for(int i = 0; i <= range; i+= step) {
				System.out.print("[" + i + "]");
			}
		}
}
