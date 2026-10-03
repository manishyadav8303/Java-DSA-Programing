public class removeduplicatestring {
    public static boolean map[] = new boolean[26];
    
    public static String removedupli(String str , int index , String newstr){
        if(index == str.length()){
            System.out.println(newstr);
            return newstr;
        }
        char currchar = str.charAt(index);
        

        if(map[currchar - 'a']==true){
            removedupli(str, index+1 , newstr);
        }else{
            newstr += currchar;
            map[currchar-'a']=true;
            removedupli(str, index+1, newstr);
        }
        return newstr;
    }
    public static void main(String[] args) {
        String str = "aaabs";
       // System.out.println(removedupli(str, 0, ""));
       removedupli(str, 0, "");
    }
}
