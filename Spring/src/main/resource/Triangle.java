package main.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by krishan on 6/29/2017.
 */
public class Triangle {
     Integer height;
     Integer altitude;
     String type;
     Point point1;
    Point point2;
    Point point3;

//    List<Point> list;
    Map<String,Point> map;
     Triangle(){

     }

    Triangle(Integer height, Integer altitude, String type){
        this.height = height;
        this.altitude = altitude;
        this.type = type;


        System.out.println("Inside Constructor");
    }

    public Map<String, Point> getMap() {
        return map;
    }

    public void setMap(Map<String, Point> map) {
        this.map = map;
    }


    public Point getPoint1() {
        return point1;
    }
    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }
//@Autowired
    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }
//@Autowired
    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    /* public List<Point> getList() {
        return list;
    }

    public void setList(List<Point> list) {
        this.list = list;
    }*/

    public String getType() {
        return type;
    }

   /* public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        System.out.println("Inside point");
        this.point = point;
    }*/

    public void setType(String type) {
        this.type = type;
    }


    public Integer getHeight() {
        return height;
    }
@Required
    public void setHeight(int height) {
        this.height = height;
        System.out.println("Height");
    }

    public Integer getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
        System.out.println("Altitude");
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
//        return super.toString();
        return "Altitude: "+altitude+" Height: "+height+"Point: "+point1+" "+point2+" "+point3;
//        " Point: "+map;
//        "Point: x: "+point.getX()+" y: "+point.getY();
//        "Point "+list;
    }

}
