package easy.strings;

public class GenerateTagForVideo {
    public static String generateTag(String caption) {
        caption = caption.trim();
        String[] words = caption.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append("#").append(words[0].toLowerCase());
        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            if (!word.isEmpty()) {
                sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase());
            }

        }
        String tag = sb.toString();
        return tag.substring(0, Math.min(tag.length(), 100));

    }

    public static void main(String[] args) {
        System.out.println(generateTag("Leetcode daily streak achieved"));
        System.out.println(generateTag("can I Go There"));
        System.out.println(generateTag(
                "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"));

    }

}
