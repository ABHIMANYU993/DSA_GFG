// User function Template for Java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class power_set_subsequence {
    public List<String> AllPossibleStrings(String s) {
        // Code here
        List<String> a = new ArrayList<>();
        int n,i,j;
        n=s.length();
        int powersize=(1<<n);
        for(i=0;i<powersize;i++){
            StringBuilder sb=new StringBuilder();
            for(j=0;j<n;j++){
                if((i&(1<<j))!=0)sb.append((s.charAt(j)));
            }
            a.add(sb.toString());
        }
        Collections.sort(a);
        return a;
    }
}
