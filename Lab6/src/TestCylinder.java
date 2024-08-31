/**
 * Управляющая программа для Cylinder class
 *
 *  @author Aliunina P.A.
 *  @version 1.0
 */
public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(); // Use constructor 1
        System.out.println("Радиус = " + cylinder1.getRadius()
                + "\nВысота = " + cylinder1.getHeight()
                + "\nЦвет = " + cylinder1.getColor()
                + "\nПлощадь основания = " + cylinder1.getArea()
                + "\nОбъем = " + cylinder1.getVolume());
        Cylinder cylinder2 = new Cylinder(5.0, 5.1); // Use constructor 2
        System.out.println("\nРадиус = " + cylinder2.getRadius()
                + "\nВысота = " + cylinder2.getHeight()
                + "\nЦвет = " + cylinder2.getColor()
                + "\nПлощадь основания = " + cylinder2.getArea()
                + "\nОбъем = " + cylinder2.getVolume());
    }
}
