class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog {
    void bark() {
        System.out.println("barking...");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("meowing...");
    }
}

class TestInheritance3 {
    public static void main(String args[]) {
        Dog d = new Dog();
        Cat c = new Cat();
        c.meow();
        c.eat();
        d.bark();
    }
}