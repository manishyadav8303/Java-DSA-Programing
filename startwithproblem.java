public class startwithproblem {
     static class Node{
        Node [] children = new Node[26];
        boolean eow = false;
        int freq ;
       public  Node(){
        for(int i = 0 ; i<children.length ; i++){
            children[i] = null;
        }
        freq = 1;
        }
    }
    public static Node root = new Node();

    public static boolean startwith(String prefix){
        Node curr = root;
        for(int i = 0 ; i<prefix.length() ;i++){
            int idx = prefix.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
    public static void insert(String s){
        Node curr = root;
        for(int i= 0 ; i<s.length() ;i++){
            int idx = s.charAt(i)-'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }else{
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static void main(String[] args) {
        String str[] = {"zebra" , "dog" , "duck" , "dove"};
        String prefix1 = "zeb";
        String prefix2 = "man";
        for(int i = 0 ; i<str.length ; i++){
            insert(str[i]);
        }

        System.out.println(startwith(prefix2));
        System.out.println(startwith(prefix1));
    }
}
