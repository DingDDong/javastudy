import java.util.Collections;
import java.util.ArrayList;
import java.util.List;


class StrIgnoreCaseComp {
        public static void main(String[] args) {
                List<String> list = new ArrayList<>();
                list.add("robot");
                list.add("Lamda");
                list.add("box");
                Collections.sort(list, (String::compareToIgnoreCase));
                System.out.println(list);
        }
}