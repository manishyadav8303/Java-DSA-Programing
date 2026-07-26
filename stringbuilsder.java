public class stringbuilsder {
    public static void main(String[] args) {
        StringBuilder letter = new StringBuilder("");

        for(char ch = 'a' ; ch<='z' ; ch++){
            letter.append(ch);
        }
        //System.out.println(letter.length());
        System.out.println(letter);
    }
    
}
