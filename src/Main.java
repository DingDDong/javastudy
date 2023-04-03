class Triangle {
    final private double height;
    final private double base;
    public Triangle(double height,int base) {
        this.height = height;
        this.base = base;
    }
    public double getArea() {
        return height * base / 2;
    }
}
class useTriangle{
    public static void main(String[] args) {
        Triangle tr = new Triangle(5,3);
        System.out.println(tr.getArea());
        Triangle tr1 = new Triangle(10,8);
        System.out.println(tr1.getArea());
    }
}
