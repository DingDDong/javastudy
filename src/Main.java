import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
class FunctionDemo{
        public static void main(String[] args) {
                BiFunction<Integer, String , String> bifunction= ( num, str ) -> num + "번째 " + str ;
                        System.out.println(bifunction.apply(3, "비행기"));
                        System.out.println(bifunction.apply(5,"커피"));
        }
}