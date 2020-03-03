package CanvasQuestion;

import java.util.Objects;

public class PixelInfo {

    private int x;
    private int y;
    private String colour;

    public PixelInfo(int x, int y, String colour){
        this.x = x;
        this.y = y;
        this.colour = colour;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PixelInfo pixelInfo = (PixelInfo) o;
        return x == pixelInfo.x &&
                y == pixelInfo.y &&
                Objects.equals(colour, pixelInfo.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, colour);
    }

    @Override
    public String toString() {
        return "PixelInfo{" +
                "x=" + x +
                ", y=" + y +
                ", colour='" + colour + '\'' +
                '}';
    }
}