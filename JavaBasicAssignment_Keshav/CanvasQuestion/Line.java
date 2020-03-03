package CanvasQuestion;

public class Line implements IShape {

    private String colour;

    public Line(String colour){
        this.colour = colour;
    }

    public String getColour(){
        return colour;
    }
    @Override
    public void draw(ICanvas canvas, String colour) {
        canvas.setPixel(colour,0,0);
        canvas.setPixel(colour,1,1);
    }
}