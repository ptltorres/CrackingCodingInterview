package linkedlists;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class RemoveDups {

    public static void execute() {
        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(5);
        nums.add(7);
        nums.add(10);
        nums.add(5);
        nums.add(10);
        nums.add(5);
        nums.add(1);
        nums.add(10);

        removeDups(nums);

        nums.forEach(integer -> System.out.print(integer + " "));
    }

    private static void removeDups(LinkedList<Integer> list) {
        Set<Integer> intSet = new HashSet<>();
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            Integer current = iterator.next();

            if (intSet.contains(current))
                iterator.remove();
            else
                intSet.add(current);
        }
    }
}
