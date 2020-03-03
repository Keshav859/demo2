package CanvasQuestion;

public class CanvasProvider implements ICanvasProvider {
    ICanvas icanvas;
    public ICanvas getCanvas(String canvasName) {

        try {
            switch (canvasName.toUpperCase()) {
                case "SCREEN":
                    icanvas = new ScreenCanvas();
                    break;
                case "PRINTER":
                    icanvas = new PrinterCanvas();
                    break;
                default:
                    throw new CanvasTypeNotSupportedException(canvasName + " is not supported. Enter either SCREEN or PRINTER");
            }
        }
        catch(CanvasTypeNotSupportedException ex){
            System.out.println(ex.getMessage());
        }

        return icanvas;
    }
}