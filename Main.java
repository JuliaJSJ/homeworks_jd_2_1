import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Main {
        public static void main(String args[]) {
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<Integer> listFinish = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(5);
            list.add(16);
            list.add(-1);
            list.add(-2);
            list.add(0);
            list.add(32);
            list.add(3);
            list.add(5);
            list.add(8);
            list.add(23);
            list.add(4);

            Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext()) {
                Integer i = iterator.next();
                if ((i > 0) && (i % 2 == 0))  {
                    listFinish.add(i);
                }
            }

            Collections.sort(listFinish);
            System.out.println(listFinish);
        }
}

