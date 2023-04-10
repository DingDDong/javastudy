@FunctionalInterface
interface Calculate<T> {  // 제네릭 기반의 함수형 인터페이스
    T cal(T a, T b);
}
class CalculatorDemo{
    public static <T> void calAndShow(Calculate<T> op, T n1, T n2){
        T r = op.cal(n1, n2);
        System.out.println(r);
    }
    public static void main(String[] args) {
        Calculate<Integer> c1 =  (a, b) -> a + b;
        Calculate<Double> c2 = (a, b) -> a + b;
        Calculate<Integer> c3 = (a, b) -> a - b;
        Calculate<Double> c4 = (a, b) -> a - b;

        calAndShow(c1, 3, 4);
        calAndShow(c2,2.5,7.1);
        calAndShow(c3, 4, 2);
        calAndShow(c4, 4.9, 3.2);
        /*
         // 3 + 4
        calAndShow((a, b) -> a + b, 3, 4);

        // 2.5 + 7.1
        calAndShow((a, b) -> a + b, 2.5, 7.1);

        // 4 - 2
        calAndShow((a, b) -> a - b, 4, 2);

        // 4.9 - 3.2
        calAndShow((a, b) -> a - b, 4.9, 3.2);

        정답에는 이런식으로 표현해있음 c1을 (a, b) -> a + b 로 치환 가능
        자료형은 인자로 전달되는 매개변수에 자료형에 따라서 알아서 정해짐
         */
    }
}
