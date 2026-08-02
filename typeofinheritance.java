public class typeofinheritance {
   public static void main(String[] args){
    //  horse h1 = new horse();
    //  h1.walk();
    //  h1.food();
    // //  h1.changecolor();
    // System.out.println(h1.color);

    chicken c = new chicken();
   // [ animal -> horse -> chicken ] 

    //  c.eat();
    //  c.walk();
    //  //c.food();
   }
}

abstract class animal{
    String color;
    
    void eat(){
        System.out.println("yes they eat");
    }
    animal(){
        //color = "red";
        System.out.println("animal comstructor called");
    }

    abstract void walk();
}

class horse extends animal{
horse(){
    System.out.println("horse comstructor called");
}

    void walk(){
        System.out.println("yes they can walk");
    }

    void changecolor(){
        color="black";
    }

    void food(){
        System.out.println("herbs");
    }
}

class chicken extends horse{

    chicken(){
        System.out.println("chicken comstructor called");
    }
    void walk(){
        System.out.println("yes they fly and walk");
    }
}
