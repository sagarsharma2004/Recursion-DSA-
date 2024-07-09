public class mazePath {
    public static void main(String[] args) {
        int n=3;
        int m=3;
        mazpath(0,0,n-1,m-1,"");
    }

    private static void mazpath(int cr, int cc, int n, int m, String ans) {
        if(cr==n&&cc==m){
            System.out.println(ans);
            return;
        }
        if(cr>n||cc>m){
            return;
        }
        mazpath(cr+1, cc, n, m, ans+"H");
        mazpath(cr, cc+1, n, m, ans+"V");
        mazpath(cr+1, cc+1, n, m, ans+"D");
    }
}
