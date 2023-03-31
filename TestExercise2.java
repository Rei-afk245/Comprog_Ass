import java.util.Scanner;

public class TestExercise2 {
    public static void main(String[] args) {
        String id, desc;
        double unitPrice;
        int qty;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter InvoiceItem's id: ");
        id = input.nextLine();
        System.out.print("Enter description: ");
        desc = input.nextLine();
        System.out.print("Enter Quantity: ");
        qty = input.nextInt();
        System.out.print("Enter Unit's Price: ");
        unitPrice = input.nextDouble();
        Exercise2 e = new Exercise2(id, desc, qty, unitPrice);
        e.ToString();
    }
}
