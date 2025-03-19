package by.hw.lessons.hw_8;

public class hw_8_2 {

    public static String processStrings(String str1, String str2) {

        if (str1.endsWith(str2)) {
            return str1.substring(0, str1.length() - str2.length()).trim();
        }
        else {return str1.toUpperCase();
        }
    }

    public static void main(String[] args) {
        String str1 = "Я люблю java";
        String str2 = "java";

        String result = processStrings(str1, str2);
        System.out.println(result);

        String str3 = "Я люблю Java";
        String str4 = "java";

        String result2 = processStrings(str3, str4);
        System.out.println(result2);
    }
    }


