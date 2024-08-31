/**
 * Class created for testing
 * @author P. A. ALiunina
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        //Rectangle test
        Rectangle rec = new Rectangle();
        rec.setLength(3);
        rec.setWidth(2);
        System.out.println(rec +
                "\nRectangle area = " + rec.getArea() +
                "\nRectangle color = " + rec.getColor());
        //Triangle test
        Triangle triangle = new Triangle();
        triangle.setBase(8);
        triangle.setHeight(4);
        System.out.println("\n" + triangle +
                "\nTriangle area = " + triangle.getArea() +
                "\nTriangle color = " + triangle.getColor());
        //Trapeze test
        Trapeze trapeze = new Trapeze();
        trapeze.setHeight(2);
        trapeze.setHighBase(22);
        trapeze.setLowBase(1);
        System.out.println("\n" + trapeze +
                "\nTrapeze area = " + trapeze.getArea() +
                "\nTrapeze color = " + trapeze.getColor());
    }
}
