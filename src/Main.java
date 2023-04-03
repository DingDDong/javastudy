class FirstJavaProgram{
    public static void main(String[] args) {
      result(10,5);
    }
    public static void result(int x, int y){
        System.out.println("더하기: " + (x + y));
        System.out.println("빼기: " + (x - y));
        System.out.println("곱하기: " + (x * y));
        System.out.println("몫: " + (x / y));
        System.out.println("나머지: " + (x % y));
    }
}
