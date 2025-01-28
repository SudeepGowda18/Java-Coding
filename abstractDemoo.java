public class abstractDemoo {
    abstract static class Animal{
        abstract void makeSound();
    }

    static class Dog extends Animal {
        void makeSound() {
            System.out.println("Bow Bow");
        }
    }

    static class Cat extends Animal {
        void makeSound() {
            System.out.println("meow meow");
        }
    }
    public static void main(String[] args) {
        Dog bruno = new Dog();
        Cat steve = new Cat();
        bruno.makeSound();
        steve.makeSound();
    }
}
