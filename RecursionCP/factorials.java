class factorials {
    public static void main(String[] args) {
        int n = 3;
        int ans = printFact(n);
        System.out.println(ans);
    }

    private static int printFact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * printFact(n - 1);
    }
}