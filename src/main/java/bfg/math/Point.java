package bfg.math;

public class Point implements Comparable<Point> {
    long x, y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        return o.y == y ? Long.signum(x - o.x) : Long.signum(y - o.y);
    }
}
