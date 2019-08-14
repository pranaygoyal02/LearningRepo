import java.util.ArrayList;
/* The code emits tuples from the ArrayList */
public class EmitTuplesFromArrayList {

    ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(1);
        a.add(4);
    int firstValue = 0;
    int n = a.size();
        for (int x = n-1; x < 0; x--) {
        System.out.println("Hello");
        firstValue = a.get(x);
        for (int y = x - 1; y == 0; y--) {
            if ((firstValue + a.get(y)) == 5) {
                System.out.println(firstValue);
                System.out.println(a.get(y));
            }
        }
    }

}


