package OOPs;

class Cylinder{
    double radius;
    double height;

    public double lidArea(){
        return 2*3.14*radius*radius;
    }

    public double totalSurfaceArea(){
        return 2*3.14*radius*height;
    }

    public double volume(){
        return 2*3.14*radius*(height+radius);
    }
}

public class Cylinder_Class {
    public static void main(String[] args){
        Cylinder cylinder = new Cylinder();

        cylinder.radius = 7.0;
        cylinder.height = 14.0;

        System.out.println(cylinder.lidArea());
        System.out.println(cylinder.totalSurfaceArea());
        System.out.println(cylinder.volume());
    }
}
