public class subsequence2 {
    public static void main(String[] args) {
        String str="abc";
        int count = subsequ(str,"");
        System.out.println(count);
    }

    private static int subsequ(String str, String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return 1;
        }
        char c=str.charAt(0);
        int inc=subsequ(str.substring(1), ans+c);
        int exc=subsequ(str.substring(1), ans);
        return inc+exc;
    }
}
