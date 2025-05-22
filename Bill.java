package project1;
import java.util.*;

interface BillGen {
    int calculate();
}

class ProductB implements BillGen {
    String name;
    int prod_id, quantity, unit_price, total;

    ProductB() {}

    ProductB(String n, int id, int q, int u) {
        name = n;
        prod_id = id;
        quantity = q;
        unit_price = u;
    }

    public int calculate() {
        total = quantity * unit_price;
        return total;
    }
}

public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of orders:");
        int n = sc.nextInt();
        ProductB[][] order = new ProductB[n][];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter number of products in order " + (i + 1) + ":");
            int m = sc.nextInt();
            order[i] = new ProductB[m];

            for (int j = 0; j < m; j++) {
                System.out.println("Enter product " + (j + 1) + " name:");
                String a = sc.next();
                System.out.println("Enter product ID:");
                int b = sc.nextInt();
                System.out.println("Enter product quantity:");
                int c = sc.nextInt();
                System.out.println("Enter product Unit Price:");
                int d = sc.nextInt();

                ProductB pb = new ProductB(a, b, c, d);
                pb.calculate();
                order[i][j] = pb;
            }
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            System.out.println("\nOrder No: " + (i + 1));
            Date date = java.util.Calendar.getInstance().getTime();
            System.out.println(date);
            System.out.println("---------------------------------------------------------------");
            System.out.printf("%10s %20s %10s %10s %10s\n", "Prod_ID", "Name", "Qty", "Unit_Price", "Total");
            System.out.println("---------------------------------------------------------------");

            for (int j = 0; j < order[i].length; j++) {
                ProductB p = order[i][j];
                System.out.printf("%10d %20s %10d %10d %10d\n", p.prod_id, p.name, p.quantity, p.unit_price, p.total);
                sum += p.total;
            }

            System.out.println("---------------------------------------------------------------");
            System.out.println("Net Amount : " + sum);
            System.out.println("---------------------------------------------------------------");
        }

        sc.close();
    }
}