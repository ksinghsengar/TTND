package main.resource;

/**
 * Created by krishan on 6/29/2017.
 */
public class Point {
    Integer x;
    Integer y;

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "X: "+getX()+" Y: "+getY();
    }
}
