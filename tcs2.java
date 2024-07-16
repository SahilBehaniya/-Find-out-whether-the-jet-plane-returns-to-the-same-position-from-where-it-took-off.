import java.util.Scanner;

public class tcs2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toUpperCase();
      boolean obj = stringcheck(str);
       if(obj){
        System.out.println("Returned Successfully");
       }else{
        System.out.println("Not returned successfully");
       }


    }

   public static boolean stringcheck(String str){
        int x=0,y=0;
       
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='N'  ){
                x++;
               
            }else if(str.charAt(i)=='E'){
                y++;
              
            }else if(str.charAt(i)=='S'){
                  x--;
                  
            }else if(str.charAt(i)=='W'){
                y--;
              
            }
        }
        System.out.println(x +" "+ y);
        
          return x==0 && y==0;
    
    }
}
