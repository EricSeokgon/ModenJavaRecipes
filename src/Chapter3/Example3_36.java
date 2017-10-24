package Chapter3;

/**
 * Project: ModenJavaRecipes
 * FileName: Example3_36
 * Date: 2017-10-24
 * Time: 오전 9:10
 * Author: user
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Example3_36 {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        String forward = sb.toString().toLowerCase();
        String backward = sb.reverse().toString().toLowerCase();
        return forward.equals(backward);
    }
}
