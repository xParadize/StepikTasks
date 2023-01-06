/* Опишите класс Animal. У класса Animal должны быть свойства:

type - тип животного (String)
name - имя животного (String)
age - возраст животного (int)
weight - вес животного (double)
isFly - ответ на вопрос, умеет ли это животное летать? (boolean)
isWalk - ответ на вопрос, умеет ли это животное ходить? (boolean)
isSwim -  ответ на вопрос, умеет ли это животное плавать? (boolean)
У животного должны быть методы:

display  - выводит информацию о животном в формате: "Тип: <Тип животного>, Имя: <Имя животного>, Возраст: <Возраст животного>, Вес: <Вес животного>, Умеет летать: <Да/Нет>, Умеет ходить: <Да/Нет>, Умеет плавать: <Да/Нет>."
rename(String) - принимает новое имя животного
holiday(int) - принимает на вход число праздничных дней. Увеличивает массу животного на 0.1 за каждый праздничный день.

*/


public class Animal {

    String type, name;
    int age;
    double weight;
    boolean isFly, isWalk, isSwim;

    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }

    public void holiday(int day) {
        System.out.println("Животное поправилось на " + (weight += day * 0.1) + " килограмм за " + day + "дня(-ей)");
    }

    public void rename() {
        String newName = name;
        System.out.println("Теперь нашего друга зовут " + newName);
    }

    public void display() {
        System.out.println("Тип животного: " + type + "\n"
                + "Имя животного: " + name + "\n"
                + "Возраст животного: " + age + "\n"
                + "Вес животного: " + weight + "\n"
                + "Умеет летать? " + isFly + "\n"
                + "Умеет ходить? " + isWalk + "\n"
                + "Умеет плавать? " + isSwim);
    }
}

class Main{
    public static void main(String[] args) {
        Animal tiger = new Animal("тигр", "Артём", 15, 300.6, true, true, false);
        tiger.display();
        tiger.rename();
        tiger.display();

        System.out.println();

        Animal sparrow = new Animal("воробей", "Капитан Джек", 3, 2, false, true, true);
        sparrow.display();
        sparrow.holiday(2);
        sparrow.display();
    }
}
