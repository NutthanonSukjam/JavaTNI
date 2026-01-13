public class Product {

    // Attributes
    public String name;
    public double price = 0;
    public int quantity = 0;

    // เพิ่มสินค้าเข้าคลัง
    public void addStock(int amount) {
        if (amount > 0) {
            quantity += amount;
            System.out.println("Added " + amount + " items to stock");
        }
    }

    // ขายสินค้าออกจากคลัง
    public void sell(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
            System.out.println("Sold " + amount + " items");
        } else {
            System.out.println("Not enough items in stock...");
        }
    }

    // เปลี่ยนราคาสินค้า
    public void changePrice(double newPrice) {
        if (newPrice > 0) {
            price = newPrice;
            System.out.println("Change price to " + newPrice + " baht");
        }
    }

    // มูลค่าสินค้าในคลัง
    public double stockValue() {
        return price * quantity;
    }

    // แสดงข้อมูลสินค้า
    public void showInfo() {
        System.out.println("Name  : " + name);
        System.out.println("Price : " + price + " Baht/Item");
        System.out.println("Stock : " + quantity + " Items");
        System.out.println("Stock Value: " + stockValue() + " Baht");
    }
}

