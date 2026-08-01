
public class geetersetter {
    public static void main(String[] args) {
        pen p1 = new pen();

        p1.setColor("bue");
        System.out.println(p1.getcolor());
        p1.settip(12);
        System.out.println(p1.gettip());


    }
    
}

class pen {
       private String color;
       private int tip;
       
    void setColor(String color ){
        this.color = color;
    }

    String getcolor(){
        return this.color;
    }

    int gettip(){
        return this.tip;
    }

    void settip(int tip){
        this.tip = tip;
    }

    }
