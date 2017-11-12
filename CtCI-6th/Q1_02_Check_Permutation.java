public class Q1_02_Check_Permutation {
    public static void main(String[] args) {
        System.out.print(isPermutation("abz", "aba"));
//        checkSymtax("abc");
    }

    static boolean isPermutation(String str1, String str2) {
        if (str1.equals(str2)) return true;
        int checker1 = 0;
        int checker2 = 0;
        for (int i = 0; i < str1.length(); i++) {
            int val = str1.charAt(i) - 'a';
            checker1 |= (1 << val);
        }

        for (int i = 0; i < str2.length(); i++) {
            int val = str2.charAt(i) - 'a';
            checker2 |= (1 << val);
        }
//        System.out.println(checker1 + " : "+Integer.toBinaryString(checker1));
//        System.out.println(checker2 + " : "+Integer.toBinaryString(checker2));
        return (checker1 == checker2);
    }

    static void checkSymtax(String str) {
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            System.out.println(val + " : " + (1 << val));
        }
    }
}
