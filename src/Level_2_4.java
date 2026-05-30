public class Level_2_4 {
    // Tính tổng a->b

    public static int sum(int a, int b){

        if (a > b){
            return 0;
        }

        return a + sum(a + 1, b);

    }

    public static void main(String[] args){

        int a = 3;
        int b = 7;

        System.out.println(sum(a, b));

    }
}
