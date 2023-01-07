/* Опишите класс WritingMaterials. У класса WritingMaterials должны быть свойства:

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

*/

import java.util.Locale;

public class WritingMaterials {

    String name, color;
    int price;
    double length;
    boolean draw;

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
        //empty constructor
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
            System.out.println(name + " провел(-а) линию. Ее(-го) цвет " + color + ".");
        }
        else {
            System.out.println(name + " ничего не сможет нарисовать.");
        }
    }

    public void display() {
        System.out.println("Название: " + name + ", цвет: " + color + ", длина: " + length + ", цена: " + price + ", умеет рисовать? " + (draw ? "Да" : "Нет") + ".");
    }
}

class test{
    public static void main(String[] args) {
        WritingMaterials pen = new WritingMaterials();
        pen.setName("ручка");
        pen.setColor("Красный");
        pen.setLength(11.6);
        pen.setPrice(167);
        pen.setDraw(true);
        pen.display();
        pen.draw();
        pen.priceDown(10);
        pen.display();
        pen.priceUp(23);
        pen.display();
        pen.replaceRod("Синий");
        pen.draw();
        System.out.println(pen.getName());
        System.out.println(pen.getColor());
        System.out.println(pen.getLength());
        System.out.println(pen.getPrice());
        System.out.println(pen.isDraw());
    }

}
