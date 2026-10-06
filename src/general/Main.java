package general;

public class Main {

    protected static boolean palindrome(int x) {
        if (x < 0) return false;
        int copyOfX = x;
        int reverseOfX = 0;

        while (copyOfX > 0) {
            int lastDgt = copyOfX % 10;
            reverseOfX = (reverseOfX * 10) + lastDgt;
            copyOfX /= 10;
        }
        return x == copyOfX;
    }

    public static void main(String[] args) {
        System.out.println(palindrome(121));
    }
}
