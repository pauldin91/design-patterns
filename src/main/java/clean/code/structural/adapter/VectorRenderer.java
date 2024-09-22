package clean.code.structural.adapter;

import java.util.ArrayList;

public class VectorRenderer {
    public void Draw(ArrayList<Vector> vectors)
    {
        for(Vector v:vectors)
        {
            for (Line l:v)
            {
                LineToPointAdapter adapter = new LineToPointAdapter(l);
                adapter.forEach(PointRenderer::Draw);
            }
        }
    }
}
