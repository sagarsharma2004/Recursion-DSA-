public class genrateParenthesis {
    public static void main(String[] args) {
        int n=2;
        createparenthesis(n,0,0,"");
    }

    private static void createparenthesis(int n, int openbr, int closebr, String ans) {
        if(n==openbr&&n==closebr){
            System.out.println(ans);
            return;
        }
        if(openbr>n||closebr>n){
            return;
        }
        // createparenthesis(n, openbr+1, closebr, ans+"(");//for reverse the output.
        if(openbr>closebr){
            createparenthesis(n, openbr, closebr+1, ans+")");
        }
        createparenthesis(n, openbr+1, closebr, ans+"(");
    }
}
