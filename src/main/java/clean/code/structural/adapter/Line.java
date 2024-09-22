package clean.code.structural.adapter;

public class Line {
    public Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int hashCode() {
        int res=start.hashCode();
        res=31*res+end.hashCode();
        return res;
    }
    @Override
    public boolean equals(Object o)
    {
        if (o == this) return true;
        if (o==null || o.getClass()!=getClass()) return false;
        Line line = (Line)o;
        if(!this.start.equals(line.start))return false;
        return this.end.equals(line.end);
    }
}
