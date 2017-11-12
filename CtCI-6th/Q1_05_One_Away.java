public class Q1_05_One_Away {
    private static boolean findDiff = false;

    public static void main(String[] args) {
        System.out.println(isOneAway1("pale", "bake"));
    }

    // Brute Force algorithm O(n)
    static boolean isOneAway1(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // replacement
        if (str1.length() == str2.length()) {
            for (int i = 0; i < charArray1.length; i++) {
                if (charArray1[i] != charArray2[i] && findDiff)
                    return false;
                else if (charArray1[i] != charArray2[i])
                    findDiff = true;
            }
            return true;
        } else if (charArray1.length - charArray2.length == 1) {
            return isInsertedOrRemovedOne(charArray1, charArray2);
        } else if (charArray1.length - charArray2.length == -1) {
            return isInsertedOrRemovedOne(charArray2, charArray1);
        }
        return false;
    }

    static boolean isInsertedOrRemovedOne(char[] charArray1, char[] charArray2) {
        int i = 0, j = 0;
        while (i < charArray1.length && j < charArray2.length) {
            if (charArray1[i] != charArray2[j] && findDiff) {
                return false;
            } else if (charArray1[i] != charArray2[j]) {
                findDiff = true;
                i++;
            } else {
                i++;
                j++;
            }
        }
        return true;
    }
}
