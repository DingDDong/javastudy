class FirstJavaProgram{
    public static void main(String[] args) {
      result(3,7);
    }
    public static void result(int x, int y){
        if(x > y){
            System.out.println("절대값: " + (x - y));
        }
        else{
            System.out.println("절대값: " + (y - x));
        }
    }
}
