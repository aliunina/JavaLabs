package Lab2;
/**
 * @author P. A. Aliunina
 * @author Z. A. Vedrov
 *
 * @version 1
 */
public class ForLoopTestBirthday {

    public static void main(String[] args) {

        int sum = 0;
        int day = 20;
        int month = 12;
        for(int i = 0, j = 200; (i < 100 || j < 500); i++, j++) {
            if (i % (day + month) == 0){
                sum += i;
            }
            if (j % (day + month) == 0){
                sum += j;
            }
        }
        System.out.println("\nСумма = " + sum);
    }
}