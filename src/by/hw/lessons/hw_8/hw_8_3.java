package by.hw.lessons.hw_8;

public class hw_8_3 {
    public static String insertSubstring(String text, int k, String str) {
        if (k <= 0 || k > text.length() || str == null) {
            return text; // Если индекс недопустим или подстрока пустая, возвращаем оригинальный текст
        }
        String[] words = text.split(" ");

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (word.length() >= k) {

                result.append(word.substring(0, k));
                result.append(str);
                result.append(word.substring(k));
            } else {
                result.append(word);
            }

            if (i != words.length - 1) {
                result.append(' ');
            }
        }

        return result.toString();
    }
        public static void main(String[] args) {
        String text = "Каждая строка, создаваемая с помощью оператора new, литерала (заключенная в двойные апострофы) и ли метода класса, создающего строку, является экземпляром класса String. Особенностью объекта класса String является то, что его значение не может быть изменено после создания объекта при помощи любого метода класса. Изменение строки всегда приводит к созданию нового объекта в heap. Сама объектная ссылка при этом сохраняет прежнее значение и хранится в стеке. Произведенные изменения можно сохранить переинициализируя ссылку.";

        int k = 4; //
        String str = "-+-";

        System.out.println(insertSubstring(text, k, str));
    }
}


