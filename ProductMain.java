import javax.swing.JOptionPane;

public class ProductMain {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(
                null,
                "Welcome to Product Stock System"
        );

        Product product = new Product();

        product.name = JOptionPane.showInputDialog("Enter product name:");
        product.price = Double.parseDouble(
                JOptionPane.showInputDialog("Enter price per item:")
        );
        product.quantity = Integer.parseInt(
                JOptionPane.showInputDialog("Enter product stock:")
        );

        System.out.println();
        product.showInfo();
        System.out.println();

        int addStockConfirm = JOptionPane.showConfirmDialog(
                null,
                "Do you want to add more item?",
                "Add Stock",
                JOptionPane.YES_NO_CANCEL_OPTION
        );

        if (addStockConfirm == JOptionPane.YES_OPTION) {
            int amount = Integer.parseInt(
                    JOptionPane.showInputDialog("How many item to add in stock:")
            );
            product.addStock(amount);
        }


        int changePriceConfirm = JOptionPane.showConfirmDialog(
                null,
                "Do you want to change price?",
                "Change Price",
                JOptionPane.YES_NO_CANCEL_OPTION
        );

        if (changePriceConfirm == JOptionPane.YES_OPTION) {
            double newPrice = Double.parseDouble(
                    JOptionPane.showInputDialog("How much is new price item ?")
            );
            product.changePrice(newPrice);
        }
        System.out.println();
        product.showInfo();
        System.out.println();
    }
}
