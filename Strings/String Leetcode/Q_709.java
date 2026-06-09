// 709. To Lower Case

public class Q_709{

    //Optimized Version
    public String toLowerCase(String s) {
        String res = s.toLowerCase();
        return res;    
    }

    //First Approach
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder("");
        for(int i=0 ; i<s.length() ; i++){
            sb.append(Character.toLowerCase(s.charAt(i)));
        }  
        return sb.toString();  
    }
}