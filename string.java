import java.util.*;
public class string {
    public static void printlettr(String str){
        for(int i =0 ; i<str.length() ; i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        String str ="abcd";
        String str2 = new String("defgh");
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        // contination

        String firstname = "manish";
        String lastname = "yadav";
        String fullname = firstname+" "+ lastname;
       // System.out.println(fullname);
      // System.out.println(fullname.charAt(3));
        printlettr(fullname);
    }
    
}
