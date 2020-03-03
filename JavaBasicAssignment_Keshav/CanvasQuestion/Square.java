package CanvasQuestion;

public class Square implements IShape {

    private String colour;

    public Square(String colour){
        this.colour = colour;
    }
    public String getColour(){
        return colour;
    }
    @Override
    public void draw(ICanvas canvas, String colour) {
        canvas.setPixel(colour,0,0);
        canvas.setPixel(colour,0,1);
        canvas.setPixel(colour,1,0);
        canvas.setPixel(colour,1,1);
    }
}