import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FibonacciInverso {

    public static void main(String[] args) {

        ArrayList<Integer> fibonacci = new ArrayList<Integer>();

        fibonacci.add(1);
        fibonacci.add(1);

        for(int cont = 2; cont < 10; cont++) {
            fibonacci.add(fibonacci.get(fibonacci.size()-1) + fibonacci.get(fibonacci.size()-2));
        }

        for(int cont = 9; cont >= 0; cont--) {
            fibonacci.add(fibonacci.get(cont));
            fibonacci.remove(cont);
        }

        System.out.println(fibonacci);
    }
}
