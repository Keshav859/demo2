package CanvasQuestion;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        List<IShape> shapes = new ArrayList<>();

        CanvasProvider canvasProvider = new CanvasProvider();
        ICanvas printerCanvas = canvasProvider.getCanvas("PRINTER");
        ICanvas screenCanvas = canvasProvider.getCanvas("SCREEN");

        List<IShape> printerList = new ArrayList<>();
        printerList.add(new Square("red"));
        printerList.add(new Line("red"));

        List<IShape> screenList = new ArrayList<>();
        screenList.add(new Square("blue"));

        printerCanvas.drawShapes(printerList);
        screenCanvas.drawShapes(screenList);

        ICanvas unsupportedCanvas = canvasProvider.getCanvas("HELLO");
    }
}