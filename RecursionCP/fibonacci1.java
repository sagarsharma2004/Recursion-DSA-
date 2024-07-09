public class fibonacci1 {
    public static void main(String[] args) {
        int n=6;
        int ans=findFibonacci(n);
        System.out.println(ans);
    }

    private static int findFibonacci(int n) {
        if(n==0 || n==1){
            return n;
        }
        int fib1=findFibonacci(n-1);
        int fib2=findFibonacci(n-2);
        return fib1+fib2;
    }
    
}