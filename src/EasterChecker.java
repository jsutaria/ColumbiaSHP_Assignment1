public class EasterChecker {
    private static int totalTestsCount = 0;
    private static int passingTestsCount = 0;

    public static void main(String[] args) {
        System.out.println("--- Running Tests ---");

        assertEquality(EasterCalculator.computeEaster(2013), 
            "3/31", "Test01");

        assertEquality(EasterCalculator.computeEaster(940), 
            "4/3", "Test02");

        assertEquality(EasterCalculator.computeEaster(2015), 
            "4/5", "Test03");

        System.out.println(passingTestsCount + "/" + 
            totalTestsCount + " tests passed.");
    }

    private static void assertEquality(String actual, String expected, 
        String testName) {
        
        totalTestsCount++;
        System.out.print(testName);
        
        if(actual.equals(expected)) {
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