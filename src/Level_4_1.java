public class Level_4_1 {
    // In flow Fibonacci
    // Ví dụ:
    // fib(5) = fib(4) + fib(3)

    public static int fibonacci(int n){

        // base case: F(0) = 0
        if (n == 0){
            return 0;
        }

        // base case: F(1) = 1
        if (n == 1){
            return 1;
        }

        System.out.println("fibonacci(" + (n) + ")" + " = " + " fibonacci(" + (n - 1) + ") " + " + " + " fibonacci(" + (n - 2) + ") ");
        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    public static void main(String[] args){

        // 0 -> 1 -> 1 -> 2 -> 3 -> 5 -> 8
        // F(0) -> F(1) -> F(2) -> F(3) -> F(4) -> F(5) -> F(6)
        int n = 6;

        System.out.println(fibonacci(n));

    }
}
