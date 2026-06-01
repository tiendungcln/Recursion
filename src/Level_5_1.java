public class Level_5_1 {
    // In từng ký tự đảo ngược
    // Ví dụ:
    // o
    // l
    // l
    // e
    // h

    public static void reverseString(String str){

        // if (str.length() == 0)
        if (str.isEmpty()){
            return;
        }

        reverseString(str.substring(1));
        System.out.println(str.charAt(0));

    }

    public static void main(String[] args){

        String str = "hello";
        reverseString(str);

    }

}
