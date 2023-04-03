class FirstJavaProgram {
    public static void main(String[] args) {
        for (int j = 1; j <= 1000; j++) {
            if (isPrimeNumber(j))
                System.out.println(j);
        }
    }
        public static boolean isPrimeNumber ( int n){
            if (n <= 1)
                return false;
            if (n == 2)
                return true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        }
    }