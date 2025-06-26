package OOPs;

class Rectangle{
    public double length;
    public double breadth;

    public double area(){
        return length*breadth;
    }

    public double perimeter(){
        return 2*(length+breadth);
    }

    public boolean isSquare(){
        return length==breadth;
    }
}

public class Rectangle_Class {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();
        rectangle.length = 10.5;
        rectangle.breadth = 3.5;

        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.isSquare());
    }
}
