public class Level_2 {
    // Sum 1 → n
    // Ví dụ:
    // n = 5
    // => 15

    public static int sumFromOneToN(int n){

        // base case
        // có thể n == 0 vì sumFromOneToN(0) = 0 và sumFromOneToN(1) = 1 nên có thể dùng cả 2
        if (n == 1){
            return 1;
        }

        return n + sumFromOneToN(n - 1);
        // Chạy xuống
        // Lần 1: sumFromOneToN(5) = 5 + sumFromOneToN(4)
        // Lần 2: sumFromOneToN(4) = 4 + sumFromOneToN(3)
        // Lần 3: sumFromOneToN(3) = 3 + sumFromOneToN(2)
        // Lần 4: sumFromOneToN(2) = 2 + sumFromOneToN(1)
        // Lần 5: 1 base case - sumFromOneToN(1) = 1
        // Chạy lên
        // sumFromOneToN(2) = 2 + 1 = 3
        // sumFromOneToN(3) = 3 + 3 = 6
        // sumFromOneToN(4) = 4 + 6 = 10
        // sumFromOneToN(5) = 5 + 10 = 15

    }

    public static void main(String[] args){

        int n = 5;

        System.out.println(sumFromOneToN(n));

    }
}
