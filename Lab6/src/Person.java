import java.util.Scanner;

/**
 * Класс содержит два поля: имя и адрес.
 *
 *  @author Aliunina P.A.
 *  @version 1.0
 */

public class Person {
    // объявление переменных
    private String name;               // Имя
    private String address;            // Адрес

    // Конструктор по умолчанию
    // в котором инициализируем name & address
    public Person(){
        Scanner input = new Scanner(System.in);

        System.out.print("Введите имя: ");
        setName(input.nextLine());

        System.out.print("Введите адрес: ");
        setAddress(input.nextLine());
    }

    // setter переменной name
    public void setName(String name) {
        this.name = name;
    }

    // getter переменной name
    public String getName() {
        return name;
    }

    // setter переменной address
    public void setAddress(String address) {
        this.address = address;
    }

    // getter переменной address
    public String getAddress() {
        return address;
    }
}

