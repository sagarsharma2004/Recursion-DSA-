public class boardpath {
    public static void main(String[] args) {
        int n=3;
        brdpath(0,n,"");//aplicable only for 3
        brdpath2(0, n, "");//applicable for n values
    }

    private static void brdpath2(int curr, int n, String ans) {
        if(curr==n){
            System.out.println(ans);
            return;
        }
        if(curr>n){
            return;
        }
        for (int i = 1; i <= n; i++) {
            brdpath(curr+i, n, ans+i);
        }
    }

    private static void brdpath(int curr, int n, String ans) {
        if(curr==n){
            System.out.println(ans);
            return;
        }  
        if(curr>n){
            return;
        }      
        brdpath(curr+1, n, ans+"1");
        brdpath(curr+2, n, ans+"2");
        brdpath(curr+3, n, ans+"3");
    }


}
