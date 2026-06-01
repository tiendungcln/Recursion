public class Level_5_2 {
    // Kiểm tra palindrome bằng recursion
    // Ví dụ:
    // "madam"
    // => true

    public static boolean isPalindrome(String str){

        // Base case:
        // Chuỗi rỗng hoặc chỉ còn 1 ký tự => palindrome
        if (str.isEmpty() || str.length() == 1){
            return true;
        }

        // Nếu ký tự đầu và cuối khác nhau => không phải palindrome
        if (str.charAt(0) != str.charAt(str.length() - 1)){
            return false;
        }

        // Kiểm tra tiếp phần ở giữa chuỗi
        // substring(start, end): Lấy từ start KHÔNG lấy end
        return isPalindrome(str.substring(1, str.length() - 1));

    }

    public static void main(String[] args){

        String str = "madam";
        System.out.println(isPalindrome(str));;

    }
}
