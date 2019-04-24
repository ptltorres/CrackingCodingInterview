package model;

public class Point {

    public int x;
    public int y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "("+ x + ", " + y +")";
    }

    @Override
    public boolean equals(Object obj) {
        Point otherPoint = (Point) obj;
        return this.x == otherPoint.x && this.y == otherPoint.y;
    }
}
