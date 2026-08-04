public class duplicate {
    public static void dupli(String str , int idx , StringBuilder newStr , boolean[] map){
        if( idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char currchar = str.charAt(idx);
        if(map[currchar - 'a']==true){
            dupli(str, idx+1, newStr, map);
        }else{
            map[currchar -'a'] = true;
                dupli(str, idx+1, newStr.append(currchar), map);
             
        }
    }
    public static void main(String[] args) {
        System.out.println(dupli(null, 0, null, 36););
    }
}
