package clean.code.structural.bridge;

public class Point {
    private float x,y;

    public Point(float x,float y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString()
    {
        return "{x="+x+",y="+y+"}";
    }
    @Override
    public boolean equals(Object o)
    {
        if (o == this) return true;
        if (o==null || o.getClass()!=getClass()) return false;
        Point point = (Point)o;
        if(x!=point.x)return false;
        return point.y==y;

    }
    @Override
    public int hashCode()
    {
        int res=(int)x;
        res=31*res+(int)y;
        return res;
    }
}
