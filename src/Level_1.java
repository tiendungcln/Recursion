public class Level_1 {
    // — In từ 1 → n
    // Ví dụ:
    // n = 5
    // => 1 2 3 4 5
    // — In từ n → 1
    // Ví dụ:
    // n = 5
    // => 5 4 3 2 1
    public static void printNumber(int current, int n){

        // base case
        if (current > n){
            return;
        }

        // in current
        // Đi xuống = gọi hàm sâu hơn
        // Đi xuống ≠ số giảm
        // Đi xuống  => 1 2 3 4 5
        // Giống chồng đĩa thì đĩa 1 sẽ nằm dưới cùng xong dần dần chồng lên
        System.out.print("Trước " + current + " ");

        // recursion call
        printNumber(current + 1, n);

        // Đi lên = return về hàm trước đó
        // Đi lên ≠ số tăng
        // Ví dụ:
        // 5 4 3 2 1
        // Giống chồng đĩa:
        // Đĩa 5 được đặt sau cùng nên nằm trên cùng.
        // Khi gỡ đĩa ra thì đĩa 5 ra trước,
        // rồi tới 4, 3, 2, 1.
        // Stack:
        // Last In First Out (LIFO)
        // Vào sau → Ra trước.
        System.out.print("Sau " + current + " ");

    }

    public static void main(String[] args){

        int current = 1;
        int n = 5;

        printNumber(current, n);

    }

}
