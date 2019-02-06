import java.util.Scanner;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine();
        if(name.equals("Alice")){
            System.out.println("Hi " + name);
        } else if(name.equals("Bob")){
            System.out.println("Hi " + name);
        } else{System.out.println("I am sorry but do I know you?");
        }
        
            
        
        
        
        
        
        

    }
}
