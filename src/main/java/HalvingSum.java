public class HalvingSum {


    public int halvingSum(int n) {
        int sum = n;
        int tempint = n;
        while (tempint > 0) {
            sum = sum + tempint / 2;
            tempint = tempint / 2;
        }
        return sum;
    }

}
