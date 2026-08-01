public class contructer {
    public static void main(String[] args) {
        student s1 = new student(4);
        student s2 = new student("ramu");
        System.out.println(s1.n);
        System.out.println(s2.name);

    }
}

class student{ 
    int n ;
    String name ;
   student(int n){
    this.n = n;
    //System.out.println("hey it me .. ");
    }
    student(String name){
        this.name = name ;
    }
}
 