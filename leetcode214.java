class leetcode214 {
    public String sortestpalidrom(String s){
        if(s.length()==0){ 
            return s ;//checking empty
        }
        //reversing string
         String rev = new StringBuilder(s).reverse().toString();
        //combining all 
         String temp = s+"#"+rev;

         //new  array

         int [] str = new int[temp.length()];

         // build lps

         for(int i =1 ; i<temp.length() ;i++){
            int j = str[i-1];
            while(j>0 && temp.charAt(i) != temp.charAt(j)){
                j= str[j-1];
            }
            if(temp.charAt(i) == temp.charAt(j)){
                j++;
            }
            str[i]=j;
            
         }
        //length
        int lenth = str[temp.length()-1];

        // remain part

        String remain = s.substring(lenth);

         return new StringBuilder(remain).reverse().toString()+s;


    }
   
}

    

