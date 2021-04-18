public class Main {
    public static void main(String[] args) {
        System.out.println("Посмотрите на котиков");
        Cat vilya = new Cat("Виля", 7);
        Cat laska = new Cat("Ласка", 5);
        System.out.println(laska);
        System.out.println(vilya);
        laska.meow();
    }
}
