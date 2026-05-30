public class Level_3 {
    // Factorial cơ bản
    // Ví dụ:
    // 5!
    // = 5 * 4 * 3 * 2 * 1
    // = 120
    // In quá trình factorial

    public static int factorial(int n){

        if (n <= 1){
            return 1;
        }

        System.out.println(n + " * factorial(" + (n - 1) + ")");

        return n * factorial(n - 1);

    }

    public static void factorialLoop(int n){

        int result = 1;

        for (int i = 1; i <= n; i++){

             result = result * i;

        }

        System.out.println(result);

    }

    public static void main(String[] args){

        int n = 5;

        System.out.println(factorial(n));
        factorialLoop(n);

    }
}
