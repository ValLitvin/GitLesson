package by.hw.lessons.hw_6;

public class hw_6 {
    public static void main(String[] args) {
    // 1.
        int[] massive = new int[10];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = i;
            System.out.println("Элемент [" + i + "]" + " = " + massive[i]);
        }
        for (int i = 0; i < massive.length; i++) {
            if (i % 2 != 0) {
                massive[i] = 0;
            }
//            if (i % 2 == 1) {
//                massive[i] = 0;
//            }
        }
    System.out.println("--------------------------");
    // 2.
        int[] massive1 = {9, 7, 5, 3, 1};
        int[] massive2 = new int [massive1.length + 1];
            for (int i = 0; i < massive1.length; i++) {
            massive2[i] = massive1[i];
        }
        massive2[massive2.length - 1] = 0;
            for (int l : massive2) {
            System.out.println("l= " + l);
        }
    }
}