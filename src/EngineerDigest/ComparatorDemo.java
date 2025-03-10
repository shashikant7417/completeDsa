package EngineerDigest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(8);
        list.add(7);
        list.add(7);

        list.sort(new MyComparator());
        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        list1.add("Date");
        list1.add("Pineapple");
        list1.add("Apple");
        list1.add("Banana");

        list1.sort((o1,o2) -> o1.length() - o2.length());
        System.out.println(list1);
    }
}

//class MyLengthComparator implements Comparator<String> {
//
//    @Override
//    public int compare(String o1, String o2) {
//        return o2.length() -o1.length();
//    }
//}


class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2  -  o1;
    }
}
