import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
class FunctionDemo{
        public static void main(String[] args) {
                DoubleUnaryOperator f = s -> s * 0.5;
                        System.out.println(f.applyAsDouble(5));
                        System.out.println(f.applyAsDouble(10));
        }
}