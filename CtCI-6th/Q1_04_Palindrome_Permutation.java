public class Q1_04_Palindrome_Permutation {
    public static void main(String[] args) {
        System.out.println(isPermutationOfPalindrome("tact Coa"));
    }

    static boolean isPermutationOfPalindrome(String str) {
        boolean hasOdd = false;
        int index;
        int[] intArray = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : str.toCharArray()) {
            index = getCharNum(c);
            if (index != -1)
                intArray[index]++;
        }
        for (int count : intArray) {
            if (count % 2 == 1) {
                if (hasOdd) return false;
                hasOdd = true;
            }
        }
        return true;
    }

    static int getCharNum(Character c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if (a <= val && val <= z) {
            return val - a;
        }
        return -1;
    }
}
