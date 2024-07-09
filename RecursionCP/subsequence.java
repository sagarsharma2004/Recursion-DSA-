public class subsequence {
    static int count=0;
    public static void main(String[] args) {
        String str="abc";
        subseq(str,"");
        System.out.println(count);
    }
    private static void subseq(String str, String ans) {
        if(str.length()==0){
            count++;
            System.out.println(ans);
            return;
        }
        char  c=str.charAt(0);
        subseq(str.substring(1), ans+c);  //include the characters
        subseq(str.substring(1), ans);  //exclude the characters
    }
}
