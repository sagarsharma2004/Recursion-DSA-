public class coinToss {
    public static void main(String[] args) {
        int n=4;
        printtoss(n,"");
    }

    private static void printtoss(int n, String ans) {
        if(n==0){
            System.out.println(ans);
            return;
        }
        printtoss(n-1, ans+"H");
        printtoss(n-1, ans+"T");
    }
}
