public class inheritance {
    public static void main(String[] args) {
        fish shark = new fish();
        shark.eat();
        shark.swim();
        shark.run();
    }
    
}

 class animal{
    String color;

    void eat(){
        System.out.println("yes eat");
    }

    void swim(){
        System.out.println("Yes they swim ");
    }
 }

 class fish extends animal{

    void run(){
        System.out.println("no they not run");
    }

 }
