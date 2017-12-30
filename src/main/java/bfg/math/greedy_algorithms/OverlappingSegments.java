package bfg.math.greedy_algorithms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OverlappingSegments {
    List<Segment> segments;

    public OverlappingSegments(List<Segment> segments) {
        segments.sort(Comparator.comparing(Segment::getEnd));
        this.segments = segments;

    }

    public List<Integer> optimalCoveringPoints() {
        List<Integer> resultPoints = new ArrayList<>();

        resultPoints.add(segments.get(0).getEnd());
        int lastPoint = resultPoints.get(0);

        for (int i=1; i<segments.size(); i++){
            int segmentEndingPoint = segments.get(i).getEnd();
            if (!segments.get(i).containsPoint(lastPoint)) resultPoints.add(lastPoint = segmentEndingPoint);
        }

        return resultPoints;
    }
}
