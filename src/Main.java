class Accumulator {
    private static int j = 0;
    public static void add(int i){
        j = j + i;
    }
    public static void showResult(){
        System.out.println(j);
    }
    public static void main(String[] args){
        for(int i = 0; i < 10; i++) {
            Accumulator.add(i);
        }
        Accumulator.showResult();
    }
}
