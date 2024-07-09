public class coinToss2 {
    public static void main(String[] args) {
        int n=2;
        printTossWithoutHeadRepeat(n,"",false);//using flag
        printTossWithoutHeadRepeat2(n,"");//without using flag
    }

    private static void printTossWithoutHeadRepeat2(int n, String ans) {
        if(n==0){
            System.out.println(ans);
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H'){
            printTossWithoutHeadRepeat2(n-1, ans+"H");
        }
        printTossWithoutHeadRepeat2(n-1, ans+"T");

    }

    private static void printTossWithoutHeadRepeat(int n, String ans, boolean flag) {
        if(n==0){
            System.out.println(ans);
            return;
        }
        if(flag==false){
            printTossWithoutHeadRepeat(n-1, ans+"H", true);
        }
        printTossWithoutHeadRepeat(n-1, ans+"T", flag);
    }    
}
