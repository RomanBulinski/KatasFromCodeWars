public class HalvingSum {

    public int halvingSum(int n) {
        int sum = n;
        while (n > 0) {
            n = n / 2;
            sum = sum + n;
        }
        return sum;
    }

}
