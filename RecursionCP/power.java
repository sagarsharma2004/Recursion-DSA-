public class power {
    public static void main(String[] args) {
        int a=3;
        int b=5;
        System.out.println(pow(a,b));
    }

    private static int pow(int a, int b) {
        if(b==0){
            return 1;
        }
        return a*pow(a, b-1);
    }
}
