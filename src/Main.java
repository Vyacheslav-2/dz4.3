/*Д/з Класс Phone.
Создайте класс Phone, который содержит переменные number, model и weight.
Создайте три экземпляра этого класса.
Выведите на консоль значения их переменных.
Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
Вызвать эти методы для каждого из объектов.
Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number,
model и weight.
Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
Добавить конструктор без параметров.*/
/*Д/3 Доработать класс Phone. Сделать его абстрактным. Метод info() сделать абстрактным.
Также добавить классы-наследники от Phone - SamsungPhone, XiaomiPhone и ApplePhone.
 Реализацию info() в каждом классе-наследнике. Создать объекты каждого класса-наследника и проверить метод Info().*/
abstract class Phone {
    protected String number;
    protected String model;
    protected float weight;

    public Phone(String number, String model, float weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public abstract void info();

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public String getNumber() {
        return number;
    }
}
class SamsungPhone extends Phone {
    public SamsungPhone(String number, String model, float weight) {
        super(number, model, weight);
    }

    public SamsungPhone(String number, String model) {
        super(number, model);
    }

    @Override
    public void info() {
        System.out.println("Samsung " + model + ", номер: " + number + ", вес: " + weight + " г");
    }
}
class XiaomiPhone extends Phone {
    public XiaomiPhone(String number, String model, float weight) {
        super(number, model, weight);
    }

    public XiaomiPhone(String number, String model) {
        super(number, model);
    }

    @Override
    public void info() {
        System.out.println("Xiaomi " + model + ", номер: " + number + ", вес: " + weight + " г");
    }
}
class ApplePhone extends Phone {
    public ApplePhone(String number, String model, float weight) {
        super(number, model, weight);
    }

    public ApplePhone(String number, String model) {
        super(number, model);
    }

    @Override
    public void info() {
        System.out.println("Apple " + model + ", номер: " + number + ", вес: " + weight + " г");
    }
}
public class Main {
    public static void main(String[] args) {
        Phone phone1 = new SamsungPhone("123456789", "Galaxy S10", 157);
        Phone phone2 = new XiaomiPhone("987654321", "Redmi Note 8", 190);
        Phone phone3 = new ApplePhone("987654321", "iPhone 11", 194);

        phone1.info();
        phone1.receiveCall("Петя");

        phone2.info();
        phone2.receiveCall("Вася");

        phone3.info();
        phone3.receiveCall("Иван");
    }

}
//
// {      Samsung Galaxy S10, номер: 123456789, вес: 157 г
//        Звонит Петя
//        Xiaomi Redmi Note 8, номер: 987654321, вес: 190 г
//        Звонит Вася
//        Apple iPhone 11, номер: 987654321, вес: 194 г
//        Звонит Иван
//    }
//
//}