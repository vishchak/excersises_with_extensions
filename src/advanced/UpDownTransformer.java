package advanced;

public class UpDownTransformer extends TextTransformer {
    @Override
    public String transform(String text) {
        char[] chars;
        StringBuilder sb = new StringBuilder();
        chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                String str = Character.toString(chars[i]).toUpperCase();
                sb.append(str);
            } else
                sb.append(chars[i]);
        }
        return sb.toString();
    }
}
