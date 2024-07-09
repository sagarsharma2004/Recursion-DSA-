public class coinToss3 {
    public static void main(String[] args) {
        int n=3;
        printTossWithoutTailRepeat(n,"",false);//using flag
        printTossWithoutTailRepeat2(n,""); //without using flag
    }

    private static void printTossWithoutTailRepeat2(int n, String ans) {
        if(n==0){
            System.out.println(ans);
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='T'){
            printTossWithoutTailRepeat2(n-1, ans+"T");
        }
        printTossWithoutTailRepeat2(n-1, ans+"H");
    }

    private static void printTossWithoutTailRepeat(int n, String ans, boolean flag) {
        if(n==0){
            System.out.println(ans);
            return;
        }
        if(flag==false){
            printTossWithoutTailRepeat(n-1, ans+"T", true);
        }
        printTossWithoutTailRepeat(n-1, ans+"H", false);
    }
}
