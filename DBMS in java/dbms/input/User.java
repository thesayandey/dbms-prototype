package dbms.input;
import java.util.Scanner;
public class User{
    private static String st;
    public static boolean isv;
    public static String takeUserInput(){
        Scanner sc = new Scanner(System.in);
        st = sc.next();
        return st;
    }

    public static boolean isValid(String s){
        

        return isv;
    }


    public static void main(String args[]){
        String str;
        str = User.takeUserInput();
        System.out.println(str);
    }
}