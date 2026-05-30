public class Level_1_1 {
    // In số chẵn từ 1 → n
    // Ví dụ:
    // n = 10
    // => 2 4 6 8 10

    public static void printEvenNumbers(int current, int n){

        // base case
        if (current > n){
            return;
        }

        // in current số chẵn
        if (current % 2 == 0){
            System.out.print(current + " ");
        }

        // recursion call
        printEvenNumbers(current + 1, n);

    }

    public static void printOddNumbers(int current, int n){

        // base case
        if (current > n){
            return;
        }

        // in current số lẻ
        if (current % 2 != 0){
            System.out.print(current + " ");
        }

        // recursion call
        printOddNumbers(current + 1, n);

    }

    public static void main(String[] args){

        int current = 1;
        int n = 10;

        printEvenNumbers(current, n);
        printOddNumbers(current, n);

    }

}
