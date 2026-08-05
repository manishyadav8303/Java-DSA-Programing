public class firstandlastoccurance {
    public static int first = -1;
    public static int last = -1;
public static void firstlast(String str , int index , char element){
    if(index == str.length()){
        System.out.println(first);
        System.out.println(last);
        return;
    }
    
    char charcurr = str.charAt(index);
    if(charcurr == element){
        if(first==-1){
            first = index;
        }else{
            last = index;
        }
    }
    firstlast(str, index+1, element);
    
}

public static void main(String[] args) {
    String str = "aama";
    firstlast(str, 0, 'a');
}
}
