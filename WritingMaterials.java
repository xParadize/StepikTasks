/* Опишите класс WritingMaterials. 

У класса WritingMaterials должны быть свойства:
name - название предмета (String)
color - цвет, которым он пишет (String).
price - его цена (int)
length - его длина (double)
draw - ответ на вопрос, умеет ли эта письменная принадлежность писать? (boolean)
У предмета должны быть методы:

display()  - выводит информацию о предмете в формате:
"Название: <его название>, Цвет: <цвет>, Длина: <его длина>, Цена: <его цена>, Умеет рисовать: <Да/Нет>.

replace_rod(String) - принимает новый цвет стержня
priceUp(int) - принимает на вход изменение цены. Увеличивает цену на это число.
priceDown(int) - принимает на вход изменение цены. Уменьшает цену на это число.
draw() - Если предмет умеет рисовать, то выводит на экран фразу типа: "<Название> провёл линию. Её цвет - <цвет>.", в противном случае выводит на экран фразу " <Название> не может ничего нарисовать.".

Дополните класс WritingMaterials. У класса WritingMaterials должны быть следующие конструкторы:

Позволяющий создать предмет с его названием и цветом.
Позволяющий создать предмет с его названием и ценой. При этом в цвете окажется значение "No Color".
Позволяющий создать предмет с его ценой, длиной и способностью рисовать. При этом в цвете окажется значение "No Color", а в названии - "No Name".
Позволяющий создать предмет со всеми его свойствами в том же порядке, который указан на предыдущем слайде.

Добавьте инкапсуляцию в класс WritingMaterials. Для каждого свойства в классе WritingMaterials должны быть свои методы get/set (для булевых значений не get, a is).

Немного измените и перегрузите метод draw() в классе WritingMaterials (из предыдущего урока) таким образом:

draw() - Если предмет умеет рисовать, то выводит на экран фразу типа: "<Название> провёл линий: 1. Их цвет - <цвет>.", в противном случае выводит на экран фразу " <Название> не может ничего нарисовать.". (почти как и было)
draw(int n) - Если предмет умеет рисовать, то выводит на экран фразу типа: "<Название> провёл линий: <n>. Их цвет - <цвет>.", в противном случае выводит на экран фразу " <Название> не может ничего нарисовать.". 
draw(String color) - Если предмет умеет рисовать, то выводит на экран фразу типа: "<Название> провёл линий: 1. Их цвет - <color>.", в противном случае выводит на экран фразу " <Название> не может ничего нарисовать.". 
draw(String color, int n) - Если предмет умеет рисовать, то выводит на экран фразу типа: "<Название> провёл линий: <n>. Их цвет - <color>.", в противном случае выводит на экран фразу " <Название> не может ничего нарисовать.". 

Создайте три класса - наследника от класса WritingMaterials (из предыдущего урока): Pen, Ruler и Divider.

Класс Pen:
По умолчанию будем считать, что все ручки умеют рисовать.

У ручек должны быть новые свойства: 

countColor - количество цветов этой ручки (количество стержней, по умолчанию - 1)
auto - ответ на вопрос, автоматическая она, или нет.
Добавьте ручкам метод writeMyName, который выводит на экран строку, содержащую ваше имя.

Класс Ruler:
По умолчанию будем считать, что все линейки не умеют рисовать.

У линеек должны быть новые свойства: 

length - длина линейки
wood - из дерева ли эта линейка
Добавьте линейкам метод measure, который выводит на экран строку "Сейчас померяем длину".

Класс Divider:
По умолчанию будем считать, что все циркули умеют рисовать.

У циркулей должны быть новые свойства: 

dividerType - тип циркуля
metal - сделан ли этот циркуль из металла
Добавьте циркулям метод draw_circle, который выводит на экран строку "Нарисован круг".

Переопределите у созданных вами классов наследников (Pen, Ruler и Divider.) метод display. 
Перед выводом стандартной информации добавьте в начало вывода фразу "This is <название класса>". 
Так же добавьте в метод display информацию о новых свойствах этого класса. 

Добавьте классу WritingMaterials инициализатор. Задайте в нём для каждого предмета название и цвет по умолчанию.
Добавьте инициализаторы и в наследников вашего класса. 

Добавьте классу WritingMaterials статичный метод на ваш вкус и статичное свойство String description, в котором будет храниться описание класса.
Убедитесь, что его нельзя вызвать у объекта, но можно вызвать у класса. 

Добавьте автоматическую нумерацию создания всех письменных принадлежностей и наследников. Используйте при этом статическое поле.
Так же, для удобства, сгенерируйте классу WritingMaterials  метод toString(), который выводил бы подробную информацию о предмете (данные по всем полям, включая номер).
Вывод номера в метод display() не добавляйте.

Запретите наследование от класса Ruler, переопределение метода drawCircle у класса Divider и изменение свойства description.

*/

public class WritingMaterials {

    String name, color;
    int price;
    double length;
    boolean draw;

    static final String description = WritingMaterials.class.getName();
    static int count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isDraw() {
        return draw;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }

    public WritingMaterials(String name, String color, int price, double length, boolean draw) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.draw = draw;
        count++;
    }

    public WritingMaterials(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public WritingMaterials(String name, int price) {
        this.name = name;
        this.price = price;
        this.color = "No Color";
    }

    public WritingMaterials(int price, double length, boolean draw) {
        this.price = price;
        this.length = length;
        this.draw = draw;
        this.color = "No Color";
        this.name = "No Name";
    }

    public WritingMaterials() {
        count++;
    }

    public void replaceRod(String newColor) {
        color = newColor;
        System.out.println("Мы заменили цвет стержня на " + newColor);
    }

    public void priceUp(double newPrice) {
        price += newPrice;
        System.out.println("Цена предмета увеличилась на " + newPrice);
    }

    public void priceDown(double newPrice) {
        price -= newPrice;
        System.out.println("Цена предмета уменьшилась на " + newPrice);
    }

    public void draw() {
        if (draw) {
            System.out.println(name + " провел(-а) линий: 1. Их цвет " + color + ".");
        }
        else {
            System.out.println(name + " ничего не сможет нарисовать.");
        }
    }

    public void draw(int n) {
        if (draw) {
            System.out.println(name + " провел(-а) линий: " + n + ". Их цвет " + color + ".");
        }
        else {
            System.out.println(name + " ничего не сможет нарисовать.");
        }
    }

    public void draw(String color) {
        if (draw) {
            System.out.println(name + " провел(-а) линий: 1. Их цвет " + color + ".");
        }
        else {
            System.out.println(name + " ничего не сможет нарисовать.");
        }
    }

    public void draw(String color, int n) {
        if (draw) {
            System.out.println(name + " провел(-а) линий: " + n + ". Их цвет " + color + ".");
        }
        else {
            System.out.println(name + " ничего не сможет нарисовать.");
        }
    }

    public void display() {
        System.out.println("Название: " + name + ", цвет: " + color + ", длина: " + length + ", цена: " + price
                + ", умеет рисовать? " + (draw ? "Да" : "Нет") + ".");
    }

    public static void sayLoremIpsum() {
        System.out.println("Lorem ipsum...");
    }

    public static void invokeCounter() {
        System.out.println("Количество предметов: " + count);
    }

    public String toString() {
        return "Номер предмета " + count + "Название: " + name + ", цвет: " + color + ", длина: " + length + ", цена: " + price
                + ", умеет рисовать? " + (draw ? "Да" : "Нет") + ".";
    }
}

public class Pen extends WritingMaterials{

    {
        setDraw(true);
        name = "Богатырь";
        color = "grey";
    }

    int countColor = 1;
    boolean auto;

    public Pen() {
        super();
    }

    public int getCountColor() {
        System.out.print("Number of color(s): ");
        return countColor;
    }

    public void setCountColor(int countColor) {
        this.countColor = countColor;
    }

    public boolean isAuto() {
        System.out.print("Can It write automatically? ");
        return auto;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }

    public void writeMyName() {
        System.out.println("xParadize");
    }

    @Override
    public void display() {
        System.out.println("This is " + this.getClass().getSimpleName() + ". It has " + countColor + " color(s). The fact, that " +
                "It's automatically thing is " + auto + ".");
        System.out.println("Название: " + name + ", цвет: " + color + ", длина: " + length + ", цена: " + price
                + ", умеет рисовать? " + (draw ? "Да" : "Нет") + ".");
    }
}

public final class Ruler extends WritingMaterials {

    {
        setDraw(false);
        name = "Большой гребешок";
        color = "blue";
    }

    int myLength;
    boolean wood;

    public Ruler() {
        super();
    }

    public int getMyLength() {
        System.out.print("Length is: ");
        return myLength;
    }

    public void setMyLength(int myLength) {
        this.myLength = myLength;
    }

    public boolean isWood() {
        System.out.print("Is It made of wood? ");
        return wood;
    }

    public void setWood(boolean wood) {
        this.wood = wood;
    }

    public void measure() {
        System.out.println("Сейчас померим длину");
    }

    @Override
    public void display() {
        System.out.println("This is " + this.getClass().getSimpleName() + ". It has " + length + " length. You know, that" +
                " this thing made of wood? Of course, because it's " + wood);
        System.out.println("Название: " + name + ", цвет: " + color + ", длина: " + length + ", цена: " + price
                + ", умеет рисовать? " + (draw ? "Да" : "Нет") + ".");
    }
}

public class Divider extends WritingMaterials {

    {
        setDraw(true);
        name = "Длинные ножки";
        color = "green";
    }

    String dividerType;
    boolean metal;

    public Divider() {
        super();
    }

    public String getDividerType() {
        System.out.print("Divider type is: ");
        return dividerType;
    }

    public void setDividerType(String dividerType) {
        this.dividerType = dividerType;
    }

    public boolean isMetal() {
        System.out.print("Is Divider made of metal? ");
        return metal;
    }

    public void setMetal(boolean metal) {
        this.metal = metal;
    }

    public final void draw_circle() {
        System.out.println("Нарисован круг");
    }

    @Override
    public void display() {
        System.out.println("This is " + this.getClass().getSimpleName() + ". It has " + dividerType + " type. Is It made of metal? " +
                metal + "!");
        System.out.println("Название: " + name + ", цвет: " + color + ", длина: " + length + ", цена: " + price
                + ", умеет рисовать? " + (draw ? "Да" : "Нет") + ".");
    }
}
