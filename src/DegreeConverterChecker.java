public class DegreeConverterChecker {
    private static int totalTestsCount = 0;
    private static int passingTestsCount = 0;
    
    public static void main(String[] args) {
        System.out.println("--- Running Tests ---");

        assertEquality(DegreeConverter.celciusToFahrenheit(-15), 
            5, "Test01");

        assertEquality(DegreeConverter.celciusToFahrenheit(0), 
            32, "Test02");

        assertEquality(DegreeConverter.celciusToFahrenheit(2015), 
            3659, "Test03");

        assertEquality(DegreeConverter.fahrenheitToCelcius(-15), 
            -26.11111111111111, "Test04");

        assertEquality(DegreeConverter.fahrenheitToCelcius(0), 
            -17.77777777777778, "Test05");

        assertEquality(DegreeConverter.fahrenheitToCelcius(2015), 
            1101.6666666666667, "Test06");

        System.out.println(passingTestsCount + "/" + 
            totalTestsCount + " tests passed.");
    }

    private static void assertEquality(double actual, double expected, 
        String testName) {
        
        totalTestsCount++;
        System.out.print(testName);
        
        if(actual == expected) {
            passingTestsCount++;
            System.out.println(" -- Passed\n");
        }
        else {
            System.out.println(" -- Failed");
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + actual + "\n");
        }
    }
}