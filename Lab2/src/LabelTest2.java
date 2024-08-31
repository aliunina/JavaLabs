package Lab2;
/**
 * Применение label и continue.
 * Конструкции для label и continue
 *
 * @author P. A. Aliunina
 * @author Z. A. Vedrov
 * @version 1
 */
public class LabelTest2 {
    public static void main(String[] args){
        int[] scores = {1, 5, 2, 3, 4};
        outer:
        for (int i = 0; i < 10; i++){
            if(scores[i] <= 0) break outer;
            if(scores[i] > 3){
                inner:
                for (int j = 0; j < 3; j++){
                    if(scores[i] == 10){
                        System.out.println("Хороший результат! Ура!!!");
                        continue inner;
                    }
                    System.out.println("Начинаем с начала");
                    continue outer;
                }
            }
            if (scores[i] <= 5) System.out.println("Больше практики...");
        }
    }
}