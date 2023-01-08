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

Перегрузите метод holiday() в классе Animal (из предыдущего урока) таким образом:

holiday() - увеличивает массу животного на 0.1
holiday(double m) - увеличивает массу животного на m
holiday(double m, int n) - n раз увеличивает массу животного на m

Создайте три класса - наследника от класса Animal (из предыдущего урока): Bird, Fish и Insect.

Класс Bird:
По умолчанию будем считать, что все птицы умеют летать.

У птиц должны быть новые свойства: 

area - зона обитания
winterFly - ответ на вопрос, улетает ли она зимовать
Добавьте птицам метод chirik_chirik, который выводит на экран строку "Chirik-Chirik".

Класс Fish:
Все рыбы должны уметь плавать по умолчанию.

У рыб должны быть новые свойства: 

squama - тип чешуи
upStreamSwim - умеет ли плавать против течения
Добавьте рыбам метод bul_bul, который выводит на экран строку "Bul-bul".

Класс Insect:
Все насекомые должны уметь ходить по умолчанию.

У насекомых должны быть новые свойства: 

wingCount - количество крыльев
likeJesus - умеет ли ходить по воде
Добавьте насекомым метод ggggg, который выводит на экран строку "Ggggg".

Переопределите у созданных вами классов наследников (Bird, Fish и Insect) метод display. 
Перед выводом стандартной информации добавьте в начало вывода фразу "I am <название класса>".
Так же добавьте в метод display информацию о новых свойствах этого класса. 

Добавьте классу Animal инициализатор. Задайте в нём для каждого животного имя и тип по умолчанию.
Добавьте инициализаторы и в наследников вашего класса. 

Добавьте классу Animal статичный метод на ваш вкус и статичное свойство String description,
в котором будет храниться описание класса. Убедитесь, что его нельзя вызвать у объекта, но можно вызвать у класса. 

Добавьте автоматическую нумерацию создания всех животных и наследников. Используйте при этом статическое поле.
Так же, для удобства, сгенерируйте классу Animal  метод toString(), который выводил бы подробную информацию о животном (данные по всем полям, включая номер).
Вывод номера в метод display() не добавляйте.

Запретите наследование от класса Fish, переопределение метода rename у класса Animal и изменение свойства description.

*/

public class Animal {

    String type, name;
    int age;
    double weight;
    boolean isFly, isWalk, isSwim;

    static final String description = Animal.class.getName();
    static int count;

    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
        count++;
    }

    public Animal() {
        count++;
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

    public static String getDescription() {
        return description;
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

    public void holiday() {
        weight += 0.1;
    }

    public void holiday(int day) {
        weight += day * 0.1;
    }

    public void holiday(double m) {
        weight += m;
    }

    public void holiday(double m, int n) {
        weight += (m * n);
    }

    public final void rename(String newName) {
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

    public static void sayHello() {
        System.out.println("Hello!");
    }

    public static void invokeCounter() {
        System.out.println("Количество существ: " + count);
    }

    public String toString() {
        return  "Номер животного: " + count + ", "
                + "Тип животного: " + type + ", "
                + "Имя животного: " + name + ", "
                + "Возраст животного: " + age + ", "
                + "Вес животного: " + weight + ", "
                + "Умеет летать? " + (isFly ? "Да" : "Нет") + ", "
                + "Умеет ходить? " + (isWalk ? "Да" : "Нет") + ", "
                + "Умеет плавать? " + (isSwim ? "Да." : "Нет.");
    }
}

public class Bird extends Animal {

    {
        isFly (true);
        type = "Птица";
        name = "Тимофей";
    }

    String area;
    boolean winterFly;

    public String getArea() {
        return "Место обитания: " + area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean isWinterFly() {
        return winterFly;
    }

    public void setWinterFly(boolean winterFly) {
        this.winterFly = winterFly;
    }

    public Bird() {
        super();
    }

    public void chirik_chirik() {
        System.out.println("Chirik-Chirik");
    }

    @Override
    public void display() {
        System.out.println("I am " + this.getClass().getSimpleName() + " and I live in " + area + ".\n"
                + "Some people say, that I need overwintering - it's " + isWinterFly() + ".");
        System.out.println("Тип животного: " + type + ", "
                + "Имя животного: " + name + ", "
                + "Возраст животного: " + age + ", "
                + "Вес животного: " + weight + ", "
                + "Умеет летать? " + (isFly ? "Да" : "Нет") + ", "
                + "Умеет ходить? " + (isWalk ? "Да" : "Нет") + ", "
                + "Умеет плавать? " + (isSwim ? "Да" : "Нет"));

    }
}

public final class Fish extends Animal{

    {
        isSwim (true);
        type = "Рыба";
        name = "Александр";
    }

    String squama;
    boolean upStreamSwim;

    public String getSquama() {
        return "Тип чешуи: " + squama;
    }

    public void setSquama(String squama) {
        this.squama = squama;
    }

    public boolean isUpStreamSwim() {
        return upStreamSwim;
    }

    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }

    public Fish() {
        super();
    }

    public void bul_bul() {
        System.out.println("Bul-bul");
    }

    @Override
    public void display() {
        System.out.println("I am " + this.getClass().getSimpleName() + " and I have " + squama + " type of squama.\n"
                + "Do you know that I can swim up stream? Of course, because it's " + isUpStreamSwim() + ".");
        System.out.println("Тип животного: " + type + ", "
                + "Имя животного: " + name + ", "
                + "Возраст животного: " + age + ", "
                + "Вес животного: " + weight + ", "
                + "Умеет летать? " + (isFly ? "Да" : "Нет") + ", "
                + "Умеет ходить? " + (isWalk ? "Да" : "Нет") + ", "
                + "Умеет плавать? " + (isSwim ? "Да" : "Нет"));
    }
}

public class Insect extends Animal {

    {
        isWalk (true);
        type = "Насекомое";
        name = "Максим";
    }

    int wingCount;
    boolean likeJesus;

    public int getWingCount() {
        System.out.print("Количество крыльев: ");
        return wingCount;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public boolean isLikeJesus() {
        return likeJesus;
    }

    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }

    public Insect() {
        super();
    }

    public void ggggg() {
        System.out.println("Ggggg");
    }

    @Override
    public void display() {
        System.out.println("I am " + this.getClass().getSimpleName() + " and I have " + wingCount + " wing(s)!\n"
                + "Once upon a time my insect-friend said, that I can walk on water, so I tried and convinced that It's " + isLikeJesus() + ".");
        System.out.println("Тип животного: " + type + ", "
                + "Имя животного: " + name + ", "
                + "Возраст животного: " + age + ", "
                + "Вес животного: " + weight + ", "
                + "Умеет летать? " + (isFly ? "Да" : "Нет") + ", "
                + "Умеет ходить? " + (isWalk ? "Да" : "Нет") + ", "
                + "Умеет плавать? " + (isSwim ? "Да" : "Нет"));
    }
}
