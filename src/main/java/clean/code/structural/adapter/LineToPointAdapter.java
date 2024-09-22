package clean.code.structural.adapter;

import java.util.*;
import java.util.function.Consumer;

public class LineToPointAdapter implements Iterable<Point> {
    private static final Map<Integer, List<Point>> cache = new HashMap<>();
    private int hash;
    public LineToPointAdapter(Line line) {
        hash = line.hashCode();
        if(cache.get(hash)!=null) return;

        ArrayList<Point> points = new ArrayList<>();

        int left = Math.min(line.start.x,line.end.x);
        int right = Math.max(line.start.x,line.end.x);
        int bottom = Math.min(line.start.y,line.end.y);
        int top = Math.max(line.start.y,line.end.y);
        int dx = right - left;
        int dy = line.end.y-line.start.y;
        if(dx==0)
        {
            for (int y = top; y <= bottom; y++) {
                points.add(new Point(left,y));
            }
        }else if (dy==0)
        {
            for (int x = left; x <= right; x++) {
                points.add(new Point(x,top));
            }
        }
        cache.put(hash,points);
    }

    @Override
    public Iterator<Point> iterator() {
        return cache.get(hash).iterator();
    }

    @Override
    public void forEach(Consumer<? super Point> action) {
        cache.get(hash).forEach(action);
    }

    @Override
    public Spliterator<Point> spliterator() {
        return cache.get(hash).spliterator();
    }
}
