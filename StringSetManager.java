import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
enum StringCommand {ADD, REMOVE, CLEAN, QUIT, INVALID};

public class StringSetManager {
    public static void main(String [] args){
        final Scanner sc = new Scanner(System.in);
        ArrayList <String> stringSet = new ArrayList<String>();
        while(true){
            StringCommand command = null;
            String opt = sc.next();
            opt = opt.toUpperCase();

            if(opt.equals("QUIT")){
                System.out.println("BYE!");
                break;
            }

            else if(opt.equals("ADD") || opt.equals("REMOVE") || opt.equals("CLEAN")){
                command = StringCommand.valueOf(opt);
                switch(command){
                    case ADD:
                        final String newString = sc.next();
                        if(!stringSet.contains(newString))
                            stringSet.add(newString);
                        break;
                    case REMOVE:
                        final String remove = sc.next();
                        stringSet.remove(remove);
                        break;
                    case CLEAN:
                        stringSet.clear();
                        break;
                    default:
                        System.out.println("Unknown Command!");
                        break;
                }
                System.out.printf("Element Size: %d,  Values = %s\n", stringSet.size(),stringSet);

            }

            else
                System.out.println("Unknown Command!");
        }
    }
}
