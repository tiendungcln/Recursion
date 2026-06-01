public class Level_4_2 {
    // Đếm số lần recursion chạy

    static int count = 0;

    public static int fibonacci(int n){
        // main() gọi fibonacci(n) lần đầu.
        // Sau đó hàm fibonacci() tự gọi lại:
        // fibonacci(n - 1)
        // fibonacci(n - 2)
        // Các lời gọi mới tiếp tục sinh ra lời gọi nhỏ hơn
        // cho đến khi gặp base case (n = 0 hoặc n = 1).
        // Lần đầu nhìn vào main().
        // Những lần sau nhìn vào lời gọi đệ quy.

        count++;

        // base case
        if (n == 0){
            return 0;
        }

        if (n == 1){
            return 1;
        }

        // recursion call
        return fibonacci(n - 1) + fibonacci(n - 2);

    }


    public static void main(String[] args){

        int n = 6;

        System.out.println(fibonacci(n));
        System.out.println(count);

    }

}
