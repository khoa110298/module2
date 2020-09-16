package bai7_Abstract_Class_va_Interface.thuc_hanh;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "gà kêu: ò ó o";
    }

    @Override
    public String howToEat() {
        return "could be fried ";
    }
}

