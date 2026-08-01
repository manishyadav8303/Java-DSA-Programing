class oops{

    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setColor("blue");
        p1.settip(12);
        System.out.println(p1.color);
        System.out.println(p1.tip);

        bankaccount b1 = new bankaccount();
        b1.username = "ramu";
        b1.setpass("rammmu");
       // System.out.println(b1.password);
    }
}
    class pen {
        String color;
        int tip;

        void setColor(String newcolor){
            color = newcolor;
        }
        void settip(int newtip){
            tip = newtip;
        }
    }

class bankaccount{
    public String username;
    private String password;
    public void setpass(String pwd){
        password = pwd;
    }
}
