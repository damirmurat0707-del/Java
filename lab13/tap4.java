import java.util.*;

public class Tap4 {
    public static void main(String[] args) {
        Arrays.asList(1,2,3)
                .stream()
                .map(x->x*x)
                .forEach(System.out::println);
    }
}