public class Level_2_2 {
    // Tính tổng số lẻ
    // Ví dụ:
    // n = 6
    // => 1 + 3 + 5 = 9

    public static int sumOdd(int n){

        // base case
        if (n <= 0){
            return 0;
        }

        if (n % 2 != 0){
            return n + sumOdd(n - 2);
        }

        return sumOdd(n - 1);
        // 6 -> 5 -> 3 -> 1

    }

    public static void main(String[] args){

        int n = 6;

        System.out.println(sumOdd(n));

    }


}
