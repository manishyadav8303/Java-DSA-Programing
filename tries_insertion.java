public class tries_insertion {
     static  class Node{
        Node childeren[] = new Node[26];
        boolean eow = false;
        Node(){
            for(int i = 0 ; i<26 ; i++){
                childeren[i] = null;
            }
        }
    }
    public static Node root = new Node();

    public static void insert(String words){
        Node curr = root;
        for(int level = 0 ; level<words.length() ; level++){
            int indx = words.charAt(level)-'a';
       
        if(curr.childeren[indx] == null){
            curr.childeren[indx] = new Node();
        }
        curr = curr.childeren[indx];
        }
        curr.eow = true;
    }

    public  static boolean search(String key){
        Node curr = root;
        for(int level = 0 ; level<key.length() ; level++){
            int idx = key.charAt(level) - 'a';
            if(curr.childeren[idx] == null){
                return false;
            }
            curr= curr.childeren[idx];
        }
        return curr.eow == true;
    }
    public static void main(String[] args) {
        String word[] = {"aar" , "aram" , "kaam"};
        for(int i = 0 ; i<word.length ;i++){
              insert(word[i]);
        } 
       // System.out.println("aaa");
        System.out.println(search("aar"));
    }
}
