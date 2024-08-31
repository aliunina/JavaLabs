import java.util.Scanner;

/**
 * Расчет эффективной температуры воздуха.
 *
 * Эффективная температора водуха зависит от
 *          Температуры
 *          Влажности
 *          Скорости ветра
 *
 * @author Aliunina P.A.
 * @version 1
 */
public class EffectiveTemperature {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Ввод температуры (С)
        System.out.println("Введите температуру ");
        float temperature = input.nextFloat();
        //Ввод процента влажности (%)
        System.out.println("Введите процент влажности ");
        float humidity = input.nextFloat();
        //Ввод скорости ветра (m/s)
        System.out.println("Введите скорость ветра ");
        float speed = input.nextFloat();
        //Расчет эффективной температуры воздуха
        double effectiveTemperature = 37 - (37 - temperature) / (0.68 - 0.0014 * humidity + 1 /
                (1.76 + 1.4 * Math.pow(speed, 0.75))) - 0.29 * temperature * (1 - humidity / 100);

        System.out.println("Эффективная температура воздуха равна " + effectiveTemperature);
    }
}
