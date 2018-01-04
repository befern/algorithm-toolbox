package bfg.math.divide_and_conquer;

import bfg.math.Segment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class SegmentSort {

    //TreeSet provides guaranteed log(n) time cost for the basic operations (add, remove and contains).
    public static List<Integer> countSegmentsCrossingEachPoint(List<Segment> segmentList, List<Integer> points) {
        List<Integer> count = new ArrayList<>();
        TreeSet<Segment> pointsSortedByEnd;

        TreeSet<Segment> pointsSortedByStart = new TreeSet<>((new OrderByStartingPoint()));
        pointsSortedByStart.addAll(segmentList);

        for (int point : points) {
            pointsSortedByEnd = new TreeSet<>(new OrderByEndingPoint());
            Segment thisPoint = new Segment(point, point);
            pointsSortedByEnd.addAll(pointsSortedByStart.headSet(thisPoint, true));
            count.add(pointsSortedByEnd.tailSet(thisPoint, true).size());
        }

        return count;
    }

    private static class OrderByStartingPoint implements Comparator<Segment> {

        @Override
        public int compare(Segment s1, Segment s2) {
            return Integer.compare(s1.getStart(), s2.getStart());
        }
    }


    private static class OrderByEndingPoint implements Comparator<Segment> {

        @Override
        public int compare(Segment s1, Segment s2) {
            return Integer.compare(s1.getEnd(), s2.getEnd());
        }
    }
}
