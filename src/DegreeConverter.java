/* 
 * Jainil Sutaria
 * SHP Assignment 1
 * 10/3/15
 */

import java.util.Scanner; public class DegreeConverter {

    protected static double celciusToFahrenheit(double celcius) {
    	double faren;
    	faren = (celcius * 9 / 5 + 32);
    	
 
    	
    	
        return faren;
    }

    protected static double fahrenheitToCelcius(double fahrenheit) {
    	double celc;
    	celc = ((fahrenheit - 32) * 5 / 9);	
    	return celc;
    }
    
    public static void main(String[] args) {
    	System.out.println("Print your value you want to convert from F to C:");
    	Scanner myScanner = new Scanner(System.in);
    	double y = myScanner.nextDouble();
    	double z = DegreeConverter.fahrenheitToCelcius(y);
    	System.out.println(y + " Fahrenheit in Celcius is " + z);
    	System.out.println("Print your value you want to convert from C to F:");
    	double q = myScanner.nextDouble();
    	double r = DegreeConverter.celciusToFahrenheit(q);
    	System.out.println(q + " Celcius in Fahrenheit is " + r);
    	
    }
}