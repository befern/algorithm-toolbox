package bfg.math.greedy_algorithms;


import bfg.math.ListStub;
import bfg.math.Segment;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class CoveringSegmentsTest extends TestCase {
    OverlappingSegments overlappingSegments;
    List<Segment> segments;
    List<Integer> expectedPoints;

    public void testSimple3SegmentsOptimalPoints() {
        segments = ListStub.create(new Segment(1, 3), new Segment(2, 5), new Segment(3, 6));
        overlappingSegments = new OverlappingSegments(segments);
        expectedPoints = ListStub.create(3);

        assertEquals(expectedPoints, overlappingSegments.optimalCoveringPoints());
    }

    public void testUnOrdered4SegmentsOptimalPoints() {
        segments = ListStub.create(new Segment(4, 7), new Segment(1, 3), new Segment(2, 5), new Segment(5, 6));
        overlappingSegments = new OverlappingSegments(segments);
        expectedPoints = ListStub.create(3, 6);

        assertEquals(expectedPoints, overlappingSegments.optimalCoveringPoints());
    }

    public void testMaximumSegmentsOptimalPoints() {
        segments = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            segments.add(new Segment(i + 1, 1000000000 - i));
        }

        overlappingSegments = new OverlappingSegments(segments);
        expectedPoints = ListStub.create(1000000000 - 99);

        assertEquals(expectedPoints, overlappingSegments.optimalCoveringPoints());
    }
}
