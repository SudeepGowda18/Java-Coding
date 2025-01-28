public class abstractDemo {
    abstract static class Animal {
        abstract void makeSound();
    }

    static class Dog extends Animal {
        void makeSound() {
            System.out.println("bark bow");
        }
    }
    public static void main(String[] args) {
        Animal bruno = new Dog();
        bruno.makeSound();
    }
}