package interviewpreparation;

public class Fibonacci {

    public static void main(String[] args) {
        int a = 0, b = 1;
        int num = 20;

        for(int i=1; i<num; i++) {
            System.out.print(a+" ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
