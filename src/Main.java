import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

class CollectParallenStringStream{
        public static void main(String[] args) {
                Integer[] ints = {5, 2, 1, 135};
                Stream<Integer> ss = Arrays.stream(ints);

                int sum = ss.parallel()
                                    .filter(s -> s + 5 < 11)
                                    .collect(() -> new ArrayList<>(),
                                            (c, s) -> c.add(s),
                                            (lst1, lst2) -> lst1.addAll(lst2)).stream()
                        .mapToInt(s -> ((Integer)s).intValue())
                        .sum();
                System.out.println(sum);
        }
}