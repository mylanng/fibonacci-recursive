public class Main {
    //n is the endpoint of the fibonacci sequence.

    public Main(int n, int i1, int i2) {
        fibonacci(n, i1, i2);
    }

    
    public void fibonacci(int n, int i1, int i2) {
        int result = i1 + i2;
        if (result < n) {
            System.out.println(result);
            i2 = i1;
            fibonacci(n, result, i2);
        }
    }
    
    public static void main(String[] args) {
        int n = 1000;
        System.out.println(1);
        System.out.println(1);
        new Main(n,1,1);
    }
}