public class array_assignment {
    public static boolean Twice_number(int number[]){
        for (int i = 0 ; i < number.length ; i++){
            for (int j = i+1 ;j < number.length ; j++){
                if (number[i] == number[j]){
                    return true;
                } 
            }
        } return false ;
    }
    public static void main(String[] args) {
        int number[]={1,2,3,3};
        System.out.println(Twice_number(number));

    }
    
}
