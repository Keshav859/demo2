package CanvasQuestion;

import java.util.List;

public interface ICanvas {
    public void setPixel(String colour, int x, int y);
    public void drawShapes( List<IShape> shapes);
}