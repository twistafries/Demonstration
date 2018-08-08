import java.util.*;

public class HelloWorld {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! What's your name?");
        String message = input.nextLine();
        input.close();
        System.out.println("Hello, " + message + "!");
    }
}
