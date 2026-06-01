public class Level_5 {
    // Reverse String cơ bản
    // Ví dụ:
    // "hello"
    // => "olleh"

    public static String reverseString(String str){

        if (str.length() <= 1){
            return str;
        }

        // charAt: Dùng để lấy 1 ký tự trong chuỗi
        // substring: Dùng để cắt chuỗi từ vị trí index đến hết
        return reverseString(str.substring(1)) + str.charAt(0);

    }

    public static void main(String[] args){

        String str = "hello";
        System.out.println(reverseString(str));

    }
}
