package dbms.input;
import java.util.Scanner;
public class User{
    private static String st;
    public static boolean isv;
    public static String takeUserInput(){
        Scanner sc = new Scanner(System.in);
        st = sc.nextLine();
        return st;
    }

    public static boolean isValid(String s){
        if(s.substring(0, 7) == "create "){
            System.out.println("SUCCESS");
        }

        return isv;
    }

    public static String returnTableName(String str){
        String table_name;
        table_name = str.substring(14);
        return table_name;
    }


    public static void main(String args[]){
        String str;
        str = User.takeUserInput();
        System.out.println(str);

        //String s = str.substring(0,6);
        //System.out.println(s);
        //User.isValid(str);
        boolean b = User.isValid(str);
        System.out.println(b);

    }
}