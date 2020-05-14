public class ATM {


//    10, 20, 50, 100, 200 and 500 dollars.
//    1<=n<=1500.

    public int solve(int n) {

        int counter = 0;
        int posistion = 0;
        int[] dividers = {500, 200, 100, 50, 20, 10};

        if (n % 10 != 0) {
            return -1;
        }
        while (n > 0 ) {
            while (n - dividers[posistion] >= 0) {
                n = n - dividers[posistion];
                counter++;
            }
            if(posistion<5){
                posistion++;
            }
        }
        return counter;
    }

}
