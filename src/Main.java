import arraysandstrings.*;
import linkedlists.RemoveDups;
import linkedlists.ReturnKthToLast;
import model.Point;
import structures.LinkedList;

public class Main {
    public static void main(String[] args) {
        //CheckPermutation.execute();
        //URLify.execute();
        //StringCompressor.execute();
        //OneAway.execute();
        //RemoveDups.execute();
        //ReturnKthToLast.execute();

        testDataStructures();
    }

    private static void testDataStructures() {
        LinkedList<Point> linkedPoints = new LinkedList<>();

        linkedPoints.addLast(new Point(-5, 20));
        linkedPoints.addLast(new Point(200, 1));
        linkedPoints.addLast(new Point(2, 9));
        linkedPoints.addLast(new Point(123, 56));
        linkedPoints.addLast(new Point(89, 9));
        linkedPoints.addLast(new Point(5, 3));
        linkedPoints.addLast(new Point(96, 2));
        linkedPoints.addLast(new Point(-80, 20));
        linkedPoints.addLast(new Point(96, -23));
        linkedPoints.addLast(new Point(31, 31));

        Point found = linkedPoints.get(new Point(5, 3));

        if (found != null)
            System.out.println("Found " + found);
        else
            System.out.println("Point not on list");

        System.out.println("Before removing:");
        linkedPoints.display();
        System.out.println();
        linkedPoints.displayReverse();


        linkedPoints.remove(new Point(31,31));

        System.out.println("\nAfter removing:");
        linkedPoints.display();
        System.out.println();
        linkedPoints.displayReverse();

    }
}
