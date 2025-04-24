
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// created by Muhammad Ilhan Naquib bin Kamarul Zaman
// 227998
public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Question 1");
        // QUESTION 1
        // creating test inputs for calculating length using list
        Calc calc1 = new Calc(0, 3);
        Calc calc2 = new Calc(1, 7);
        Calc calc3 = new Calc(1, 1);
        Calc calc4 = new Calc(3, 7);
        Calc calc5 = new Calc(15, 1);
        Calc calc6 = new Calc(10, 20);
        Calc calc7 = new Calc(-5, -1);
        Calc calc8 = new Calc(-7, -4);

        List<Calc> lengthList = new ArrayList<>(
                Arrays.asList(calc1, calc2, calc3, calc4, calc5, calc6, calc7, calc8));

        // using the calculateLength function (Question 1)
        for (Calc l : lengthList) {
            System.out.println("-------------------------------------");
            System.out
                    .println("For vector " + l.x + " and " + l.y + ", the length is : " + l.calculateLength(l.x, l.y));
        }

        System.out.println("-------------------------------------");
        System.out.println("Question 2 and 3");
        // QUESTION 2 AND 3
        // creating test inputs for question 2 and 3 using list
        Calc calca = new Calc(7, -3, 3, 1);
        Calc calcb = new Calc(-4, 1, -2, 5);
        Calc calcc = new Calc(-1, -2, -4, -1);

        List<Calc> distAndAngList = new ArrayList<>(
                Arrays.asList(calca, calcb, calcc));

        // looping the list to calculate using calculateDistance and calculateAngle
        for (Calc l : distAndAngList) {
            System.out.println("-------------------------------------");
            System.out.println("vector A : " + l.ax + ", " + l.ay);
            System.out.println("vector B : " + l.bx + ", " + l.by);

            // using the calculateDistance function to get the distance (Question 2)
            System.out.println("The distance is : " + l.calculateDistance(l.ax, l.ay, l.bx, l.by));

            // using the calculateAngle function to get the angle (Question 3)
            System.out.println("The angle of vectors is : " + l.calculateAngle(l.ax, l.ay, l.bx, l.by) + " degrees");
        }

    }
}
