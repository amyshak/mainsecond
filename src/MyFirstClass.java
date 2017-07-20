import java.util.Scanner;

/**
 * Created by user on 20.07.2017.
 */
public class MyFirstClass {



    public static void main(String[] arg){
        System.out.print("Hello world");

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(line);



        int e = 6;
        float f = 1;

        boolean boolExpr = e < f;

        if (boolExpr) {
            System.out.println("true");
        } else {

            System.out.println("false");
        }



    }
}
