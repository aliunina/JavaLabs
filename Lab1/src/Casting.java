package Lab1;
/**
 * Casting
 * рассматриваются варианты выражений со смешением типов
 * например, int и long
 *
 * @author P. A. Aliunina
 * @author Z. A. Vedrov
 * @version 1.8
 */

public class Casting {
    public static void main(String[] args) {
        short age = 20;
        char sex = 'S';
        byte iq = 16;
        int height = 85;
        long distance = 300;
        float price = 99.99f;
        double money = 500.00;
        System.out.println("age =" + age);
        System.out.println("sex =" + sex);
        System.out.println("iq =" + iq);
        System.out.println("height =" + height);
        System.out.println("distance =" + distance);
        System.out.println("price =" + price);
        System.out.println("money =" + money);
        //age = sex;        // will this compile?
        //sex = iq;         // will this compile?
        iq = (byte) height; // will this compile?
        distance = height;  // will this compile
        // price = money;   // will this compile?
        sex = (char) money; // will this compile?
        System.out.println("iq + height =" + (iq + height));
        System.out.println("age =" + age);
        System.out.println("sex =" + sex);
        System.out.println("iq =" + iq);
        System.out.println("height =" + height);
        System.out.println("distance =" + distance);
        System.out.println("price =" + price);
        System.out.println("money =" + money);
    }
}
