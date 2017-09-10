
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

    public static void main(String [] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String line=bufferedReader.readLine();
        int n=Integer.parseInt(line);
        int [] a=new int[n];
        line=bufferedReader.readLine();
        String [] strs=line.split(" ");
        for(int i=0;i<n;++i){
            a[i]=Integer.parseInt(strs[i]);
        }
        System.out.println(solve(a));
    }

    public static int solve(int a[]){
        int ans=0;
        int res=0;
        HashSet<Integer> hashSet=new HashSet<Integer>();
        hashSet.add(0);
        for(int i=0;i<a.length;++i){
            if(a[i]==0){
                ++ans;
                hashSet.clear();
                hashSet.add(0);
                res=0;
                continue;
            }
           res=res^a[i];
           if(hashSet.contains(res)){
               ++ans;
               hashSet.clear();
               hashSet.add(0);
               res=0;
           }
           else {
               hashSet.add(res);
           }
        }
        return ans;
    }


}
