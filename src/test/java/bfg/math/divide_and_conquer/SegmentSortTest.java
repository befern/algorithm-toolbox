package bfg.math.divide_and_conquer;

import bfg.math.IntegerArrayStub;
import bfg.math.ListStub;
import bfg.math.PositiveInteger;
import bfg.math.Segment;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class SegmentSortTest extends TestCase {
    List<Segment> segments;
    List<Integer> points;
    List<Integer> segmentsContainedByPoint;

    public void test2Segments3Points() {
        segments = ListStub.create(new Segment(0, 5), new Segment(7, 10));
        points = ListStub.create(1, 6, 11);
        segmentsContainedByPoint = ListStub.create(1, 0, 0);

        assertEquals(segmentsContainedByPoint, SegmentSort.countSegmentsCrossingEachPoint(segments, points));
    }

    public void testNegativeValues() {
        segments = ListStub.create(new Segment(-10, 10));
        points = ListStub.create(-100, 100, 0);
        segmentsContainedByPoint = ListStub.create(0, 0, 1);

        assertEquals(segmentsContainedByPoint, SegmentSort.countSegmentsCrossingEachPoint(segments, points));
    }

    public void testPointsContainedBySeveralSegments() {
        segments = ListStub.create(new Segment(0, 5), new Segment(-3, 2), new Segment(7, 10));
        points = ListStub.create(1, 6);
        segmentsContainedByPoint = ListStub.create(2, 0);

        assertEquals(segmentsContainedByPoint, SegmentSort.countSegmentsCrossingEachPoint(segments, points));
    }

    public void testMaxNumberOfSegments() {
        segments = new ArrayList<>();

        for (int i = 0; i < 50000; i++) {
            segments.add(new Segment(i + 1, 100_000_000 - i));
        }

        points = ListStub.create(0, 1, 2, 3, 4, 5, 6, 7,8, 9, 10);
        segmentsContainedByPoint = ListStub.create(0, 1, 2, 3, 4, 5, 6, 7,8, 9, 10);

        assertEquals(segmentsContainedByPoint, SegmentSort.countSegmentsCrossingEachPoint(segments, points));
    }

    public void testMaxNumberOfPoints() {
        int[] segmentsNumber = IntegerArrayStub.createEqualElementsArray(1, new PositiveInteger(50_000));
        int[] pointsArray = IntegerArrayStub.createMonotoneIncreasingArray(99_950_001, 100_000_000, new PositiveInteger(1));
        segmentsContainedByPoint = ListStub.createIntegerListfromIntArray(segmentsNumber);
        segments = ListStub.create(new Segment(0, 100_000_000));
        points = ListStub.createIntegerListfromIntArray(pointsArray);

        assertEquals(segmentsContainedByPoint, SegmentSort.countSegmentsCrossingEachPoint(segments, points));
    }

    //TODO this test takes too long, algorithm has to be improved
    /**
    public void testMaxNumberOfPointsAndSegments() {
        int[] segmentsNumber = IntegerArrayStub.createEqualElementsArray(1, new PositiveInteger(50_000));
        int[] pointsArray = IntegerArrayStub.createMonotoneIncreasingArray(99_950_001, 100_000_000, new PositiveInteger(1));
        segmentsContainedByPoint = ListStub.createIntegerListfromIntArray(segmentsNumber);
        points = ListStub.createIntegerListfromIntArray(pointsArray);
        segments = new ArrayList<>();

        for (int i = 0; i < 50000; i++) {
            segments.add(new Segment(i + 1, 100_000_000 - i));
        }

        assertEquals(segmentsContainedByPoint, SegmentSort.countSegmentsCrossingEachPoint(segments, points));
    }
    **/
}
