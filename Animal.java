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
        tiger.age = 15;
        tiger.weight = 300.6;
        tiger.isSwim = true;
        tiger.isWalk = true;
        tiger.isFly = false;
        tiger.display();

        Animal sparrow = new Animal("воробей", 5);
        sparrow.weight = 2;
        sparrow.isSwim = false;
        sparrow.isWalk = true;
        sparrow.isFly = true;
        sparrow.display();

        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        duck.holiday(5);
        duck.rename("Утя-Утя");
        duck.display();
    }
}