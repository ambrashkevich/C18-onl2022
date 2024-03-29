package by.tms.task1.service;

public class TextFormatter {

    public int getNumberOfWords(String str) {
        String[] words = str.split(" ");
        return words.length;
    }

    public boolean isPalindromeInString(String[] str) {
        boolean result = false;
        for (String word : str) {
            String stringLowerCase = word.toLowerCase();
            StringBuilder stringBuilder = new StringBuilder(stringLowerCase);
            StringBuilder reverse = stringBuilder.reverse();
            return (reverse.toString()).equals(stringLowerCase);
        }
        return false;
    }

    public String getMiddleSigns(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }
}
