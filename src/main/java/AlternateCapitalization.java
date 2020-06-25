import sun.awt.X11.XSystemTrayPeer;

public class AlternateCapitalization {

    public static String[] capitalize(String s) {
        String result1 = "";
        String result2 = "";

        for (int i = 0; i < s.length() - 1; i++) {
            result1 = result1 + s.substring(i, i + 1).toLowerCase();
            result2 = result2 + s.substring(i, i + 1).toUpperCase();
            i++;
            result1 = result1 + s.substring(i, i + 1).toUpperCase();
            result2 = result2 + s.substring(i, i + 1).toLowerCase();
        }
        String[] result = {result2, result1};
        return result;
    }

    public static void main(String[] args) {
        System.out.println( capitalize( "abracadabra")[0] );
        System.out.println( capitalize( "abracadabra")[1] );
    }
}
