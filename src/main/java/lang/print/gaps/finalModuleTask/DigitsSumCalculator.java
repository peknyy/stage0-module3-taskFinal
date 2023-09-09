package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int digit = 0;
        int result = 0;
        for (int i = 3; i > 0; i--) {
            digit = (int) (number % Math.pow(10,i));
            int n = digit / 10;
            digit -= 10*n;
            number /= 10;
            result += digit;
        }
        System.out.println(result + number);
    }
}
