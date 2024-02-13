import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<Integer>();
        list.add(3);
        list.add(7);
        list.add(9);
        list.add(2);
        list.add(5);
        list.add(5);
        list.add(8);
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(3);
        list.add(1);

        lists.RemovebadPairs(list);

        System.out.println(list);
    }

    public class lists {
        public static void  RemovebadPairs(ArrayList<Integer> list) {
        int size = list.size();
        int newSize = 0;
        for (int i = 0; i<size; i+=2) {
            if (i+1<size && list.get(i) <= list.get(i+1)) {
                list.set(newSize++, list.get(i));
                list.set(newSize++, list.get(i+1));
            }
        }
        list.subList(newSize,size).clear();
    }}

    }
