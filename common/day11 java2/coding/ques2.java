package assignment2;

public class ques2 {
    public static void main(String[] args) {
        String str = "I AM VINAY";
        srt(str);

    }


    public static void srt(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            for (int j = 0; j < chars.length; j++) {

                if (chars[i] < chars[j]) {
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }

            }

        }

        for (int k = 0; k < chars.length; k++) {
            System.out.println(chars[k]);
        }
    }
}