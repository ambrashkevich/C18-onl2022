package tms.example;

public class Task4 {
    public static void main(String[] args) {
        String[] words = {"Казак",
                "Вопрос",
                "понедельник",
                "вторник",
                "дед"};
        System.out.println("\nPalindrome Words:");
        for (String word : words) {
            String str = word.toUpperCase();
            int strLen = str.length();
            boolean isPalin = true;

            for (int j = 0; j < strLen / 2; j++) {
                if (str.charAt(j) != str.charAt(strLen - 1 - j)) {
                    isPalin = false;
                    break;
                }
            }
            if (isPalin)
                System.out.println(word);
        }
    }
}


