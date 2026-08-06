public class subsquences {
    public static void subsq(String str , int index , String newstr){
        if(index == str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(index);
        
        // to be 
        subsq(str, index+1, newstr+currchar);
        // not to be

        subsq(str, index+1, newstr);
    }
    public static void main(String[] args) {
        String str = "abc";
        subsq(str, 0, "");

    }
}
