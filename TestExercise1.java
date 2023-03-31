import java.util.*;

public class TestExercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length, width;
        System.out.print("Enter length: ");
        length = input.nextDouble();
        System.out.print("Enter width = ");
        width = input.nextDouble();
        Exercise1 e = new Exercise1(length, width);
        e.display();
    }
}
