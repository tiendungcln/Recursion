public class Level_2_1 {
    // Tính tổng số chẵn
    // Ví dụ:
    // n = 7
    // => 2 + 4 + 6 = 12

    public static int sumEven(int n){

        // base case
        if (n <= 0){
            return 0;
        }

        if (n % 2 == 0){
            return n + sumEven(n - 2);
        }

        return sumEven(n - 1);
        // 7 -> 6 -> 4 -> 2 -> 0

    }

    public static void main(String[] args){

        int n = 7;
        System.out.println(sumEven(n));

    }

}
