package CanvasQuestion;

import java.util.List;

public class ScreenCanvas implements ICanvas {

    public ScreenCanvas(){
    }
    public void setPixel(String colour, int x, int y){
        System.out.println("Screen("+ x + ","
                + y + "," + colour + ")");
    }

    public void drawShapes( List<IShape> shapes){
        shapes.stream().forEach(entry -> {
            try {
                if (entry.getColour() != null)
                    entry.draw(this, entry.getColour());
                else
                    throw new ColourNotSetException("Colour is not Set");
            }
            catch(ColourNotSetException ex){
                System.out.println(ex.getMessage());
            }
        });
    }
}