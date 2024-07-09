public class operatingN {
    public static void main(String[] args) {
        int n=10;
        printIncreasingOrder(n);
        System.out.println();
        printDecreasingOrder(n);
        System.out.println();
        System.out.println(sumOfN(n));
    }

    private static int sumOfN(int n) {
        if(n==1){
            return 1;
        }
        return n+sumOfN(n-1);
    }

    private static void printIncreasingOrder(int n) {
        if(n<0){
            return ;
        }
        printIncreasingOrder(n-1);
        System.out.print(n +" ");
    }

    private static void printDecreasingOrder(int n) {
        if(n<0){
            return ;
        }
        System.out.print(n +" ");
        printDecreasingOrder(n-1);
    }
}
