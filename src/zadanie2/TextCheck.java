package zadanie2;

public class TextCheck {
    private static long countCharsInText(String text) {
        return text.chars().count();
    }

    private static long countCharsInTextWithoutSpaces(String text) {
        return text.replace(" ", "").chars().count();
    }

    private static long countWordsInText(String text) {
        return text.trim().split(" ").length;
    }

    private static boolean isTextPalindrome(String text) {
        text = text.toLowerCase();
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - (i + 1))) {
                return false;
            }
        }
        return true;
    }

    public static String getTextSummary(String text) {
        return text + "<br/>" +
                "<h3>Ilość słów: " + countWordsInText(text) + "</h3>" +
                "<h3>Ilość znaków: " + countCharsInText(text) + "</h3>" +
                "<h3>Ilość znaków (bez spacji): " + countCharsInTextWithoutSpaces(text) + "</h3>" +
                "<h3>Palindrom: " + isTextPalindrome(text) + "</h3>";
    }
}
