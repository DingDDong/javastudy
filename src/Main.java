import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;


class Stream{
        public static void main(String[] args) {
                List<Integer> ls = Arrays.asList(5, 4, 3, 2);

                BinaryOperator<Integer> lc = (s1, s2) -> {
                        if(s1 > s2)
                                return s1;
                        else
                                return s2;
                };

                Integer str = ls.stream()
                                .reduce(0,lc);
                System.out.println(str);
        }
}