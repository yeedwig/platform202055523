import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

enum Command{ADD, LIST, QUIT, SUM, MIN, MAX, INVALID};

public class ArrayEnum{
    public static void main(String [] args){
        final Scanner sc = new Scanner(System.in);
        ArrayList <Integer> values = new ArrayList<Integer>();

        while(true){
            Command command = null;
            String opt = sc.next();
            opt = opt.toUpperCase();

            if(opt.equals("QUIT")){
                System.out.println("Bye!");
                break;
            }

            else if(opt.equals("SUM") || opt.equals("LIST") || opt.equals("ADD") || opt.equals("MIN") ||opt.equals("MAX")){
                 command = Command.valueOf(opt);
                 switch(command){
                     case ADD:
                         final int newValue = sc.nextInt();
                         values.add(newValue);
                         break;
                     case LIST:
                         for(Integer value : values){
                             System.out.printf("%d ", value);
                         }
                         System.out.println();
                         break;
                     case SUM:
                         int sum = 0;
                         for(Integer value : values){
                             sum += value;
                         }
                         System.out.println(sum);
                         break;
                     case MIN:
                         int min = Collections.min(values);
                         System.out.println(min);
                         break;
                     case MAX:
                         int max = Collections.max(values);
                         System.out.println(max);
                         break;
                     default:
                         System.out.println("Invalid Command");
                         break;
                 }
            }
            else
                System.out.println("Invalid Command");
        }
    }
}