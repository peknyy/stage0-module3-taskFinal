package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int digit = 0;
        int result = 0;
        for (int i = 2; i > 0; i--) {
            digit = (int) (number % Math.pow(10,i));
            int n = digit / 10;
            digit -= 10*n;
            number /= 10;
            result += digit * Math.pow(10,i);
        }
    System.out.println(result + number);
    }
}
