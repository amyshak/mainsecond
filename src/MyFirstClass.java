import com.mainacademy.homework.Car;
import com.mainacademy.homework.TestVarArg;

import java.util.Scanner;

/**
 * Created by user on 20.07.2017.
 */
public class MyFirstClass {



    public static void main(String[] arg){
        /* вычисление площади квадрада
         */

        Square(6);

        // вычисление площади прямоугольника

        reqSquare(4,5);

        name("Alex");

        TestVarArg test =new TestVarArg();
        int summ = test.calcSum(4,5,7,8);
        System.out.println( "Сумма" + summ);


        Car car1 = new Car(100);
        Car car2 = new Car (150);
        Car car3 = new Car (60);
        System.out.println(car1.getNumOfCars());





        }

    private static void Square(float a) {
        float square = a*a;
        System.out.println(square);
    }

    private static void reqSquare(double x, double y) {
        double reqSquare = x*y;
        System.out.println("Площадь прямоугольника" + reqSquare);
    }

    public static void name(String name){
        System.out.println("hey there!" +name);
    }




}
