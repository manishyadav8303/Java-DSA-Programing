public class shortespath_string {
    public static  float Shortpath(String Path){
        int x=0; int y = 0;
        for(int i = 0 ; i<Path.length(); i++){
            char dir = Path.charAt(i);

            if(dir == 'N'){
                y++;
            }
            else if(dir == 'S'){
                y--;
            }
            else if(dir == 'W'){
                x--;
            }
            else{
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(y2+x2);// we have to do typecaste

    }
    public static void main(String[] args) {
       String Path = "WNEENESENNN";
        Shortpath(Path);
        System.out.println(Shortpath(Path));
    }
    
}
