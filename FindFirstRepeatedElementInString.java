// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
 public class FindFirstRepeatedElementInString {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String s = "abcdabcd";
        HashSet<Character> stringl = new HashSet<>();
         int counter =0;
        for(char c : s.toCharArray()){
       
        if(stringl.contains(c)){
            //counter++;
            //if(counter == 1){
                System.out.println(c);
                break;
                
            //}
            
        }else{
            stringl.add(c);
        }
            
        }
    }
}