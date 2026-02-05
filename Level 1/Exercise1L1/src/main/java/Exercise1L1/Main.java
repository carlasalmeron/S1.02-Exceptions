package Exercise1L1;

public class Main {
    public static void main(String[] args) {

        Sale sale = new Sale();

        try {
            sale.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        sale.products.add(new Product("Book", 20));
        sale.products.add(new Product("Pen", 5));

        sale.calculateTotal();
        System.out.println("Total price: " + sale.totalPrice);

        try {
            sale.products.get(5);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index error: " + e.getMessage());
        }


    }
}
