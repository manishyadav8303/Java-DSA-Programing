public class keypadcombination {
    public static String[] keypad = {
    ".", "abc", "def", "ghi", "jkl",
    "mno", "pqrs", "tuv", "vwx", "yz"
};

public static void printcom(String str , int idx , String combination){
     if(idx == str.length()){
        System.out.println(combination);
        return;
     }
    char currchar = str.charAt(idx);

    String map = keypad[currchar - '0'];
    for(int i = 0 ; i<map.length(); i++){
        printcom(str, idx+1, combination+map.charAt(i));
    }
}
public static void main(String[] args) {
    String str = "2";
    printcom(str, 0, "");
}
}
