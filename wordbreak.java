public class wordbreak {
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

    public  static  boolean wordBreak(String key){
        if(key.length() == 0){
            return  true;
        }
        for(int i = 1 ; i<=key.length() ; i++){
            if(search(key.substring(0 ,i))&&wordBreak(key.substring(i))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String arr[] = {"aa","bb","cc"};
        for(int i = 0 ; i<arr.length ; i++){
            insert(arr[i]);
        }

        String key = "aabb";
        System.out.println(wordBreak(key));
    }
}
