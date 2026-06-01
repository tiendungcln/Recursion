public class Level_2_3 {
    // Tính tổng mảng bằng recursion
    // Ví dụ:
    // [1,2,3,4]
    // => 10
    // Tìm vị trí target trong mảng bằng recursion

    public static int sumArray(int[] arr, int index){

        if (index == arr.length){
            return 0;
        }

        return arr[index] + sumArray(arr, index + 1);
        // Chạy xuống
        // sumArray(arr, 0) = 2 + sumArray(arr, 1)
        // sumArray(arr, 1) = 6 + sumArray(arr, 2)
        // sumArray(arr, 2) = 8 + sumArray(arr, 3)
        // sumArray(arr, 3) = 5 + sumArray(arr, 4)
        // sumArray(arr, 4) = 0 (base case)
        // Chạy lên
        // 5 + 0 = 5
        // 8 + 5 = 13
        // 6 + 13 = 19
        // 2 + 19 = 21

    }

    public static void searchArray(int[] arr, int index, int target){

        if (index == arr.length){
            return;
        }

        // Nếu phần tử hiện tại bằng target
        if (arr[index] == target){
            System.out.println("Index chứa target = " + index);
        }

        // call phần tử tiếp theo
        searchArray(arr, index + 1, target);

    }

    public static void main(String[] args){

        int[] arr = {2, 6, 8, 5};
        int index = 0;
        int target = 8;

        System.out.println(sumArray(arr, index));
        searchArray(arr, index, target);

    }

}
