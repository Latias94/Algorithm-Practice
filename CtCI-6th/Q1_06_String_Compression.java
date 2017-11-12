public class Q1_06_String_Compression {
    public static void main(String[] args) {
        System.out.println(stringCompression("aabcccccaaa"));
    }

    private static String stringCompression(String str) {
        if (countCompression(str) >= str.length()) return str;
        char recentChar = str.charAt(0);
        int repeatCount = 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            repeatCount++;
            if (recentChar != str.charAt(i)) {
                stringBuilder.append(repeatCount);
                recentChar = str.charAt(i);
                stringBuilder.append(recentChar);
                repeatCount = 0;
            } else if (i + 1 >= str.length()) {
                repeatCount++;
                stringBuilder.append(repeatCount);
            }
        }
        // 先检查字符串长度，性能会增加
//        if(stringBuilder.length()>=str.length()) return str;
        return stringBuilder.toString();
    }

    static int countCompression(String str) {
        int compressedLength = 0;
        int countConsecutive = 0;
        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressedLength += 1 + String.valueOf(countConsecutive).length();
                countConsecutive = 0;
            }
        }
        return compressedLength;
    }
}
