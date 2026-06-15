

public class Q_344{
    public void reverseString(char[] s) {
        int left = 0, right = n - 1;
        while (left < right) {
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}