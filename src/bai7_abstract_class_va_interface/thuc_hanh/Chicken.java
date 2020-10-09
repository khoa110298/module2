package bai7_abstract_class_va_interface.thuc_hanh;

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

