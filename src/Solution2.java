import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("DEF");
        list.add("ABC");
        list.sort((p1, p2) -> p1.compareTo(p2));
        System.out.print(list.get(1));
    }
}
