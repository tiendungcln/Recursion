public class Level_4 {
    // Fibonacci cơ bản: là mỗi số = tổng của 2 số đứng trước nó
    // Fibonacci gọi 2 nhánh đệ quy
    // Fibonacci: dựa vào 2 kết quả trước đó
    // Ví dụ:
    // 0 1 1 2 3 5 8
    // In Fibonacci từ 0 → n
    // Ví dụ:
    // n = 7
    // => 0 1 1 2 3 5 8

    public static int fibonacci(int n){

        // base case: F(0) = 0
        if (n == 0){
            return 0;
        }

        // base case: F(1) = 1
        if (n == 1){
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    public static void printFibonacci(int n){

        for (int i = 0; i <= n; i++){

            System.out.print(fibonacci(i) + " ");

        }

    }

    public static void main(String[] args){

        // 0 -> 1 -> 1 -> 2 -> 3 -> 5 -> 8
        // F(0) -> F(1) -> F(2) -> F(3) -> F(4) -> F(5) -> F(6)
        int n = 6;

        System.out.println(fibonacci(n));
        printFibonacci(n);

    }
}
