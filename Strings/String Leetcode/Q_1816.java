//1816. Truncate Sentence

public class Q_1816{
    public String truncateSentence(String s, int k) {
        String ans = "";
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == ' '){
                if(count == k-1){
                    return ans ;
                }
                count++;
                ans += s.charAt(i);
            }
            else{
                ans += s.charAt(i);
            }
        }
        return ans;
    }
}