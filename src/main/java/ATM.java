public class ATM {

    public int solve(int n) {

        int counter = 0;
        int position = 0;
        int[] dividers = {500, 200, 100, 50, 20, 10};

        if (n % 10 != 0) {
            return -1;
        }
        while (n > 0 ) {
            while (n - dividers[position] >= 0) {
                n = n - dividers[position];
                counter++;
            }
            if(position<5) position++;
        }
        return counter;
    }

}
