class FirstJavaProgram{
    public static void main(String[] args) {
        System.out.println(Area(5));
        System.out.println(Round(10));
    }
    public static double Area(int x){
        final double PI = 3.14;
        return x * x * PI;
    }

    public static double Round(int x){
        final double PI = 3.14;
        return 2 * x * PI;
    }
}
