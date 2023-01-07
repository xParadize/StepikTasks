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

Дополните класс Animal. У класса Animal должны быть следующие конструкторы:

Позволяющий создать животное с его типом и именем
Позволяющий создать животное с его типом и возрастом. При этом в имени окажется значение "No Name"
Позволяющий создать животное со всеми его свойствами в том же порядке, который указан на предыдущем слайде.

Добавьте инкапсуляцию в класс Animal. Для каждого свойства в классе Animal должны быть свои методы get/set (для булевых значений не get, a is).

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isFly() {
        return isFly;
    }

    public void isFly(boolean isFly) {
        this.isFly = isFly;
    }

    public boolean isWalk() {
        return isWalk;
    }

    public void isWalk(boolean isWalk) {
        this.isWalk = isWalk;
    }

    public boolean isSwim() {
        return isSwim;
    }

    public void isSwim(boolean isSwim) {
        this.isSwim = isSwim;
    }

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
        this.name = "No Name";
    }

    public void holiday(int day) {
        System.out.println("Животное поправилось на " + (weight += day * 0.1) + " килограмм за " + day + "дня(-ей)");
    }

    public void rename(String newName) {
        name = newName;
        System.out.println("Теперь нашего друга зовут " + newName);
    }

    public void display() {
        System.out.println("Тип животного: " + type + ", "
                + "Имя животного: " + name + ", "
                + "Возраст животного: " + age + ", "
                + "Вес животного: " + weight + ", "
                + "Умеет летать? " + (isFly ? "Да" : "Нет") + ", "
                + "Умеет ходить? " + (isWalk ? "Да" : "Нет") + ", "
                + "Умеет плавать? " + (isSwim ? "Да" : "Нет"));
    }
}

class Main{
    public static void main(String[] args) {
        Animal tiger = new Animal("тигр", "Артём");
        tiger.setAge(15);
        tiger.setWeight(300.6);
        tiger.isSwim(true);
        tiger.isWalk(true);
        tiger.isFly(false);
        tiger.display();

        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        duck.holiday(5);
        duck.rename("Утя-Утя");
        duck.display();
        System.out.println(duck.getAge());
        System.out.println(duck.getName());
        System.out.println(duck.getWeight());
        System.out.println(duck.getType());
        System.out.println(duck.isSwim());
        System.out.println(duck.isWalk());
        System.out.println(duck.isFly());
    }
}
