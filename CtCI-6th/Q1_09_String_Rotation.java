public class Q1_09_String_Rotation {
    public static void main(String[] args) {
        System.out.println(isRotation("waterbottle", "erbottlewat"));
    }

    public static boolean isRotation(String s1, String s2) {
        if (s1.length() == s2.length() && s1.length() > 0) {
            return isSubstring(s1, s2 + s2);
        }
        return false;
    }

    private static boolean isSubstring(String str, String target) {
//        System.out.println("target :" + target);
        if (str.equals(target))
            return true;
        else if (str.length() > target.length())
            return false;
        else
            return (isSubstring(str, target.substring(1, target.length())))
                    || (isSubstring(str,
                    target.substring(0, target.length() - 1)));
    }
}
