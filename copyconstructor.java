public class copyconstructor {
    public static void main(String[] args){
        student s1 = new student();
        s1.name = "ram";
        s1.rollno = 123;
       s1.marks[0] = 67;
       s1.marks[1] = 45;
       s1.marks[2] = 90;
       
 
        student s2 = new student(s1);
        s1.marks[0] = 45;
      //  System.out.println(s2.name);
      for(int i = 0 ; i<3 ; i++){
        System.out.println(s2.marks[i]);
        
      }
      

    }
     
    
}

class student {
    String name ;  
    int rollno ;
   int marks[];
    student(student s1){
         marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
      //  this.marks = s1.marks;  refreence copy 
        for(int i = 0 ; i<3 ; i++){  // deep copy 
        this.marks[i] = s1.marks[i];
      }
      
    }
    student(){
          marks = new int[3];

    }
    student(String name){
        this.name = name ;
       marks = new int [3];
    }

    student(int rollno){
        this.rollno = rollno;
        marks = new int [3];
    }
    
    student(int marks[]){
        marks = new int [3];
        this.marks = marks;

    }

}

// public class copyconstructor {
//     public static void main(String[] args) {

//         student s1 = new student();

//         s1.name = "Ramu";
//         s1.rollno = 123;

//         s1.marks[0] = 67;
//         s1.marks[1] = 45;
//         s1.marks[2] = 90;

//         student s2 = new student(s1);

//         System.out.println(s2.name);
//         System.out.println(s2.rollno);

//         for(int i = 0; i < s2.marks.length; i++) {
//             System.out.print(s2.marks[i] + " ");
//         }
//     }
// }

// class student {

//     String name;
//     int rollno;
//     int marks[];

//     student() {
//         marks = new int[3];
//     }

//     student(student s1) {
//         this.name = s1.name;
//         this.rollno = s1.rollno;
//         this.marks = s1.marks;
//     }
// }