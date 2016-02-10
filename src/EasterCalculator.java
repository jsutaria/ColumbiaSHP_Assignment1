/* 
 * Jainil Sutaria
 * SHP Assignment 1
 * 10/3/15
 */
import java.util.Scanner;
public class EasterCalculator {


		public static void main(String[] args) {
			System.out.println("Please enter year you want for easter's date for: ");
			Scanner myScanner = new Scanner(System.in);
			int y = myScanner.nextInt();
			String date = computeEaster(y);
			System.out.println("In"+myScanner+"Easter is on"+date);

		}
		public static String computeEaster(int y) {
			int a = y%19;
			int b = y/100;
			int c = y%100;
			int d = b/4;
			int e = b%4;
			int g = (8 * b + 13)/25;
			int h = (19 * a + b - d - g + 15)%30;
			int j = c/4;
			int k = c%4;
			int m = (a + 11 * h)/319;
			int r = (2 * e + 2 * j - k - h + m + 32)%7;
			int n = (h - m + r + 90)/25;
			int p = (h - m + r + n + 19)%32;
			
			String month = Integer.toString(n);
			String date = Integer.toString(p);
			return month+"/"+date;
			
		}
}
