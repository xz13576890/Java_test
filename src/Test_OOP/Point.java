package Test_OOP;
/**
 * 定义一个“点”（Point）类可以表示三位空间中的坐标，要求：
 1、可以生成特定坐标的点对象
 2、提供可以设置三个坐标的方法
 3、提供可以计算该点距离另外点的距离的方法
 */
public class Point {
    double x,y,z;

    //手动添加构造器并初始化对象的属性
    public Point(double _x, double _y, double _z){
        x = _x;
        y = _y;
        z = _z;
    }
    public void Set_XYZ(double _x,double _y,double _z){
        x = _x;
        y = _y;
        z = _z;
    }

    public double distance(Point p){
        double result = Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y) + (z - p.z) * (z - p.z));
        return result;

    }

    public static void main(String[] args) {
        Point p1 = new Point(3.2,4,8);
        Point p2 = new Point(20,40,80);
        p1.Set_XYZ(10,13,22);
        System.out.println(p1.x);
        System.out.println(p1.distance(p2));

    }
}
