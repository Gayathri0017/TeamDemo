import java.util.*;
public class Getname {
    public static void main(String []args) {
        if (args.length < 2) {
            System.out.println("Usage: java Getname <name> <age>");
            return;
        }
        
        String name = args[0];
        String age = args[1];

        System.out.println("Name is " + name + ", Age is " + age);
    }
}
